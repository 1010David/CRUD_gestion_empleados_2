package com.prueba.gestion.controller;


import com.prueba.gestion.modelo.Registro;
import com.prueba.gestion.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registro")
public class RegistroController {
    private final RegistroService registroService;

    @Autowired
    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping
    public List<Registro> getAllRegistros() {
        return registroService.getAllRegistros();
    }

    @GetMapping("/{id}")
    public Registro getRegistroById(@PathVariable long id) {
        return registroService.getRegistroById(id);
    }

    @PostMapping
    public Registro createRegistro(@RequestBody Registro registro) {
        return registroService.createRegistro(registro);
    }

    @PutMapping("/{id}")
    public Registro updateRegistro(@PathVariable long id, @RequestBody Registro registro) {
        return registroService.updateRegistro(id, registro);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistro(@PathVariable long id) {
        registroService.deleteRegistro(id);
    }
}

