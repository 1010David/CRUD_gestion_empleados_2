package com.prueba.gestion.service;


import com.prueba.gestion.modelo.Registro;
import com.prueba.gestion.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {
    private final RegistroRepository registroRepository;

    @Autowired
    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    public List<Registro> getAllRegistros() {
        return registroRepository.findAll();
    }

    public Registro getRegistroById(long id) {
        return registroRepository.findById(id).orElse(null);
    }

    public Registro createRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    public Registro updateRegistro(long id, Registro registro) {
        Registro existingRegistro = registroRepository.findById(id).orElse(null);
        if (existingRegistro != null) {
            existingRegistro.setNombre(registro.getNombre());
            existingRegistro.setDescripcion(registro.getDescripcion());
            existingRegistro.setFecha(registro.getFecha());
            return registroRepository.save(existingRegistro);
        }
        return null;
    }

    public void deleteRegistro(long id) {
        registroRepository.deleteById(id);
    }
}
