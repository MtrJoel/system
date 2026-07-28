package com.bancoSystem.system.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bancoSystem.system.models.CuentaBancaria;

public interface CuentaBancariaRepository extends JpaRepository<CuentaBancaria, Long> {
    Optional<CuentaBancaria> findByNumeroCuenta(String numeroCuenta);
}
