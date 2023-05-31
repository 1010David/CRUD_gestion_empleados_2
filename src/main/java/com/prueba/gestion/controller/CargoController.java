package com.prueba.gestion.controller;

import com.prueba.gestion.modelo.Cargo;
import com.prueba.gestion.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    private final CargoService cargoService;

    @Autowired
    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping
    public List<Cargo> getAllCargo() {
        return cargoService.getAllCargo();
    }

    @GetMapping("/{id}")
    public Cargo getCargoById(@PathVariable int id) {
        return cargoService.getCargoById(id);
    }

    @PostMapping
    public Cargo createCargo(@RequestBody Cargo cargo) {
        return cargoService.createCargo(cargo);
    }

    @PutMapping("/{id}")
    public Cargo updateCargo(@PathVariable int id, @RequestBody Cargo cargo) {
        return cargoService.updateCargo(id, cargo);
    }

    @DeleteMapping("/{id}")
    public void deleteCargo(@PathVariable int id) {
        cargoService.deleteCargo(id);
    }
}

