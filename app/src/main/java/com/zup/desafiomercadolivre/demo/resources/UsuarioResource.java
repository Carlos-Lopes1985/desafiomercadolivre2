package com.zup.desafiomercadolivre.demo.resources;

import com.zup.desafiomercadolivre.demo.entity.Usuario;
import com.zup.desafiomercadolivre.demo.service.CadastroService;
import com.zup.desafiomercadolivre.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService cadastroService;

    @PostMapping
    public ResponseEntity<?>cadastrarUsuario( @Valid @RequestBody Usuario user) throws Exception {
        return ResponseEntity.ok(cadastroService.cadastrar(user));
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?>buscarUmUsuario(@PathVariable(value="id") Long id) throws Exception {
        Usuario user = (Usuario) cadastroService.buscarUmUsuario(id);

        System.out.println("Valor usuario: "+user);
        return ResponseEntity.ok(user);
    }
}
