package com.zup.desafiomercadolivre.demo.service;

import java.util.List;

public interface CadastroService {

    Object cadastrar(Object o)throws Exception;

    Object buscarUmUsuario(Long id) throws  Exception;

    List<Object> listarTodos() throws  Exception;

}
