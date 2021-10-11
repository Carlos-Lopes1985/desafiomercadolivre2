package com.zup.desafiomercadolivre.demo;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import com.zup.desafiomercadolivre.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

@SpringBootApplication
public class DesafioMercadoLivreApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioMercadoLivreApplication.class, args);
	}


	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void run(String... args) throws Exception {

		Usuario user = new Usuario(1L, LocalDateTime.now(),"carlos@gmail.com",bCryptPasswordEncoder.encode("123"));
		usuarioRepository.save(user);
		System.out.println(user);
	}
}
