
package org.acme.db2model.mysql;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity(name = "carro")
public class Carros extends PanacheEntity{


    public String name;

    public Carros() {
    }
    
    public Carros(String name) {

        this.name = name;
    }
    
}
