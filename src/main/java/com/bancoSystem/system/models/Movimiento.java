package com.bancoSystem.system.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimiento")
public class Movimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public enum Tipos {
        DEPOSITO,
        RETIRO,
        TRANSFERENCIA_RECIBIDA,
        TRANSFERENCIA_ENVIADA
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tipos tipo;

    @Column(nullable = false)
    private BigDecimal monto;

    @Column(nullable = false)
    private LocalDateTime fecha;

    private String detalles;

    @ManyToOne
    @JoinColumn(name = "cuenta_id", nullable = false)
    private CuentaBancaria cuentaBancaria;

    // Constructors
    public Movimiento() {
    }

    public Movimiento(Tipos tipo, BigDecimal monto, LocalDateTime fecha, String detalles, CuentaBancaria cuentaBancaria) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.detalles = detalles;
        this.cuentaBancaria = cuentaBancaria;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    // Setters
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}