package com.practica.Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Pais implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpais;
    private String nombre;
    private String capital;
    private String poblacion;
    private String costas;

    public Pais() {
    }

    public Pais(String nombre, String capital, String poblacion, String costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
}
