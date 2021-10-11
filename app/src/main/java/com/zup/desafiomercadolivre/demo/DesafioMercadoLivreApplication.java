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
public class DesafioMercadoLivreApplication  {

	public static void main(String[] args) {

		SpringApplication.run(DesafioMercadoLivreApplication.class, args);
	}


}
