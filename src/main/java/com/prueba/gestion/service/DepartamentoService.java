package com.prueba.gestion.service;

import com.prueba.gestion.modelo.Departamento;
import com.prueba.gestion.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    @Autowired
    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public List<Departamento> getAllDepartamento() {
        return departamentoRepository.findAll();
    }

    public Departamento getDepartamentoById(int id) {
        return departamentoRepository.findById((long) id).orElse(null);
    }

    public Departamento createDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public Departamento updateDepartamento(int id, Departamento departamento) {
        Departamento existingDepartamento = departamentoRepository.findById((long) id).orElse(null);
        if (existingDepartamento != null) {
            existingDepartamento.setNombre(departamento.getNombre());
            existingDepartamento.setDescripcion(departamento.getDescripcion());
            existingDepartamento.setUbicacion(departamento.getUbicacion());
            existingDepartamento.setJefeDepartamento(departamento.getJefeDepartamento());
            return departamentoRepository.save(existingDepartamento);
        }
        return null;
    }

    public void deleteDepartamento(int id) {
        departamentoRepository.deleteById((long) id);
    }
}
