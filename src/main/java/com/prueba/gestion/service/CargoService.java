package com.prueba.gestion.service;

import com.prueba.gestion.modelo.Cargo;
import com.prueba.gestion.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    private final CargoRepository cargoRepository;

    @Autowired
    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> getAllCargo() {
        return cargoRepository.findAll();
    }

    public Cargo getCargoById(int id) {
        return cargoRepository.findById((long) id).orElse(null);
    }

    public Cargo createCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public Cargo updateCargo(int id, Cargo cargo) {
        Cargo existingCargo = cargoRepository.findById((long) id).orElse(null);
        if (existingCargo != null) {
            existingCargo.setNombre(cargo.getNombre());
            existingCargo.setDescripcion(cargo.getDescripcion());
            existingCargo.setNivelJerarquico(cargo.getNivelJerarquico());
            existingCargo.setSalarioBase(cargo.getSalarioBase());
            return cargoRepository.save(existingCargo);
        }
        return null;
    }

    public void deleteCargo(int id) {
        cargoRepository.deleteById((long) id);
    }
}
