package entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity(name = "fruta")
public class Frutas extends PanacheEntity {
    public String nome;
    public int quantidade;
}
