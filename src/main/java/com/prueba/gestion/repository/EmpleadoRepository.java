package com.prueba.gestion.repository;

import com.prueba.gestion.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si los necesitas
}
