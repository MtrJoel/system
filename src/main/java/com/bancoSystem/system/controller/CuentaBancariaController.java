package com.bancoSystem.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoSystem.system.models.CuentaBancaria;
import com.bancoSystem.system.service.CuentaBancariaService;

@RestController
@RequestMapping("cuentas")
public class CuentaBancariaController {

    @Autowired
    private CuentaBancariaService cuentaBancariaService;

    @GetMapping("/estado")
    public String verificarServidor() {
        return "Server corriendo";
    }

    // * Crear cuenta
    @PostMapping("/crear")
    public CuentaBancaria crearCuentas(
            @RequestBody CuentaBancaria cuenta) {
        return cuentaBancariaService.crearCuenta(cuenta);
    }

    // * Traer todas las cuentas creadas en un objeto
    @GetMapping("")
    public List<CuentaBancaria> verCuentas() {
        return cuentaBancariaService.todasCuentas();
    }

    // * Traer una cuenta en especifico por numero de cuenta
    @GetMapping("/{numeroCuenta}")
    public CuentaBancaria buscarPorId(
            @PathVariable String numeroCuenta) {
        return cuentaBancariaService.consultarPorNumero(numeroCuenta);
    }
}
