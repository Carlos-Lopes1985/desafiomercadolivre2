package com.zup.desafiomercadolivre.demo.service;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UsuarioSErviceTest {

    @InjectMocks
    private UsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void validaCadastroUsuarioValido() throws Exception {
        Usuario user = new Usuario(1L, LocalDateTime.now(),"carlos@gmail.com","123");
        assertEquals((Usuario) usuarioService.cadastrar(user),user);
    }

    @Test(expected = Exception.class)
    public void validaCadastroUsuarioIgualNulo() throws Exception {
        usuarioService.cadastrar(null);
    }
}
