
package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity(name = "fruta")
public class Frutas extends PanacheEntity {
    public String nome;
    public int quantidade;
    public Frutas() {
    }
    
    public Frutas(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
}
