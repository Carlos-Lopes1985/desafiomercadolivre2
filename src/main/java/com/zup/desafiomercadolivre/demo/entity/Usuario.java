package com.zup.desafiomercadolivre.demo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@NoArgsConstructor
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message="Data não pode ser vazio ou nulo")
    @Future
    private LocalDateTime dataHora;

    @Email
    @NotBlank(message="Email não pode ser vazio ou nulo")
    private String login;

    @NotBlank(message="Senha não pode ser vazio ou nulo")
    @Min(value=6)
    private String senha;

//    @Transient
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    public String getSenha() {
//        return bCryptPasswordEncoder.encode(senha);
//    }

    public Usuario(Long id, @NotBlank(message = "Data não pode ser vazio ou nulo") @Future LocalDateTime dataHora, @Email @NotBlank(message = "Email não pode ser vazio ou nulo") String login, @NotBlank(message = "Senha não pode ser vazio ou nulo") @Min(value = 6) String senha) {
        this.id = id;
        this.dataHora = dataHora;
        this.login = login;
        this.senha = senha;
    }
}
