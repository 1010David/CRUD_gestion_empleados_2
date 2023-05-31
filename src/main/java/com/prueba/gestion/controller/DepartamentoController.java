package com.prueba.gestion.controller;

import com.prueba.gestion.modelo.Departamento;
import com.prueba.gestion.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    private final DepartamentoService departamentoService;

    @Autowired
    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping
    public List<Departamento> getAllDepartamento() {
        return departamentoService.getAllDepartamento();
    }

    @GetMapping("/{id}")
    public Departamento getDepartamentoById(@PathVariable int id) {
        return departamentoService.getDepartamentoById(id);
    }

    @PostMapping
    public Departamento createDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.createDepartamento(departamento);
    }

    @PutMapping("/{id}")
    public Departamento updateDepartamento(@PathVariable int id, @RequestBody Departamento departamento) {
        return departamentoService.updateDepartamento(id, departamento);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartamento(@PathVariable int id) {
        departamentoService.deleteDepartamento(id);
    }
}
