package com.zup.desafiomercadolivre.demo.repository;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
