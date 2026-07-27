package com.bancoSystem.system.models;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentaBancaria")
public class CuentaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String numeroCuenta;
    private String titular;
    private BigDecimal balance;

    public enum Estados {
        ACTIVA, BLOQUEADA, CANCELADA
    }

    private Estados estado;

    // ! getter y setters

    public Long getId(){
        return id;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public Estados getEstados(){
        return estado;
    }
}
