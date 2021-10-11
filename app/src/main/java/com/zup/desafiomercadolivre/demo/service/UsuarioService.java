package com.zup.desafiomercadolivre.demo.service;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import com.zup.desafiomercadolivre.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioService implements CadastroService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Object cadastrar(Object o) throws Exception{
        Usuario user = new Usuario();
        user = (Usuario)o;
        if(Objects.nonNull(user)){

            System.out.println("Passou aki " +user);
            usuarioRepository.save(user);
        }else{
            throw new Exception("Erro ao salvar usuario");
        }
        return user;
    }

    @Override
    public Object buscarUmUsuario(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public List<Object> listarTodos() {
        return null;
    }
}
