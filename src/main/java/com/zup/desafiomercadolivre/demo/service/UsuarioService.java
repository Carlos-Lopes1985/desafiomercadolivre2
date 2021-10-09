package com.zup.desafiomercadolivre.demo.service;

import com.zup.desafiomercadolivre.demo.entity.Usuario;

import java.util.List;
import java.util.Objects;


public class UsuarioService implements CadastroService {

    @Override
    public Object cadastrar(Object o) throws Exception{
        Usuario user = new Usuario();

        if(Objects.isNull(user)){
            user = (Usuario)o;
            System.out.println("Passou aki " +user);
        }else{
            throw new Exception("Erro ao salvar usuario");
        }
        return user;
    }

    @Override
    public Object buscarUmUsuario(Long id) {
        return null;
    }

    @Override
    public List<Object> listarTodos() {
        return null;
    }
}
