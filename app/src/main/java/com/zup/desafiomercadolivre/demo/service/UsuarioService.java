package com.zup.desafiomercadolivre.demo.service;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import com.zup.desafiomercadolivre.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioService  {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario) throws Exception{

        if(Objects.nonNull(usuario)){

            System.out.println("Passou aki " +usuario);
            usuarioRepository.save(usuario);
        }else{
            throw new Exception("Erro ao salvar usuario");
        }
        return usuario;
    }

    public Usuario buscarUmUsuario(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
}
