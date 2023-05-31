package com.prueba.gestion.repository;

import com.prueba.gestion.modelo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si los necesitas
}
