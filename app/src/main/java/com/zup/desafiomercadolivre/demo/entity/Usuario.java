package com.zup.desafiomercadolivre.demo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Past
    private LocalDateTime dataHora;

    @Email
    @NotBlank(message="Email não pode ser vazio ou nulo")
    private String login;

    @NotBlank(message="Senha não pode ser vazio ou nulo")
    @Min(value=6)
    private String senha;

    public Usuario(Long id, @NotBlank(message = "Data não pode ser vazio ou nulo") @Future LocalDateTime dataHora, @Email @NotBlank(message = "Email não pode ser vazio ou nulo") String login, @NotBlank(message = "Senha não pode ser vazio ou nulo") @Min(value = 6) String senha) {
        this.id = id;
        this.dataHora = dataHora;
        this.login = login;
        this.senha = senha;
    }
}
