package com.bancoSystem.system.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    private Tipos tipo;
    private BigDecimal monto;
    private LocalDateTime fecha;
    private String detalles;
}
