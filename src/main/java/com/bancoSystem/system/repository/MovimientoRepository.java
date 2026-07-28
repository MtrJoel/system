package com.bancoSystem.system.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bancoSystem.system.models.CuentaBancaria;
import com.bancoSystem.system.models.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByCuentaBancaria(CuentaBancaria cuentaBancaria);
}
