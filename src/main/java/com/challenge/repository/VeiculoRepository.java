package com.challenge.repository;

import com.challenge.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findById(Integer id);
}