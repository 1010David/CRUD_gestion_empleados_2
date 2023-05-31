package com.prueba.gestion.service;


import com.prueba.gestion.modelo.Empleado;
import com.prueba.gestion.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }


    public Empleado actualizarEmpleado(Long id, Empleado empleado) {
        Optional<Empleado> empleadoExistente = empleadoRepository.findById(id);
        if (empleadoExistente.isPresent()) {
            Empleado empleadoActualizado = empleadoExistente.get();
            empleadoActualizado.setNombre(empleado.getNombre());
            empleadoActualizado.setApellido(empleado.getApellido());
            empleadoActualizado.setFechaNacimiento(empleado.getFechaNacimiento());
            empleadoActualizado.setDireccion(empleado.getDireccion());
            empleadoActualizado.setTelefono(empleado.getTelefono());
            empleadoActualizado.setCorreoElectronico(empleado.getCorreoElectronico());
            empleadoActualizado.setNumeroIdentificacion(empleado.getNumeroIdentificacion());
            empleadoActualizado.setFechaContratacion(empleado.getFechaContratacion());
            empleadoActualizado.setSalario(empleado.getSalario());

            return empleadoRepository.save(empleadoActualizado);
        } else {
            throw new IllegalArgumentException("Empleado no encontrado con el ID: " + id);
        }
    }

}
