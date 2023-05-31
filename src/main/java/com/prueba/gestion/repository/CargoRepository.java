package com.prueba.gestion.repository;

import com.prueba.gestion.modelo.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si los necesitas
}
