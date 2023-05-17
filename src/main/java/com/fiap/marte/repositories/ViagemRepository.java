package com.fiap.marte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.marte.models.ViagemModelo;

@Repository
public interface ViagemRepository extends JpaRepository<ViagemModelo, Long> {
	
}
