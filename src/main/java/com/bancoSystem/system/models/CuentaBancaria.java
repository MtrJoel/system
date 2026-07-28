package com.bancoSystem.system.models;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    @Column(nullable = false)
    private String titular;

    @Column(nullable = false)
    private BigDecimal balance;

    public enum Estados {
        ACTIVA, BLOQUEADA, CANCELADA
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estados estado;

    // ! getters

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

    public Estados getEstado(){
        return estado;
    }

    // ! Setters

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public void setEstado(Estados estado){
        this.estado = estado;
    }

    public CuentaBancaria(){
        
    }


    public CuentaBancaria(String numeroCuenta, String titular, BigDecimal balance, Estados estado){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.balance = balance;
        this.estado = estado;
    }
}
