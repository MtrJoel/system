package com.bancoSystem.system.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.bancoSystem.system.models.CuentaBancaria;
import com.bancoSystem.system.repository.CuentaBancariaRepository;

@Service
public class CuentaBancariaService {

    
    private CuentaBancariaRepository cuentaBancariaRepository;

    public CuentaBancariaService(CuentaBancariaRepository cuentaBancariaRepository){
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    // ? crear cuentas
    public CuentaBancaria crearCuenta(CuentaBancaria cuenta) {
        cuenta.setEstado(CuentaBancaria.Estados.ACTIVA);
        return cuentaBancariaRepository.save(cuenta);
    }

    // ? Buscar cuenta por Id
    public CuentaBancaria consultarPorNumero(String numeroCuenta) {
        return cuentaBancariaRepository.findByNumeroCuenta(numeroCuenta)
                .orElseThrow(() -> new RuntimeException("La cuenta : " + numeroCuenta + " no existe"));
    }

    // ? Buscar todas las cuentas
    public List<CuentaBancaria> todasCuentas(){
        return cuentaBancariaRepository.findAll();
    }
    
}
