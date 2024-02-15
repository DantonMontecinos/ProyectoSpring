package com.proyecto.cole.spring.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Getter @Setter @Column (name="nombre")
    private String nombre;

    @Getter @Setter @Column(name="apellido")
    private String apellido;


    private String email;

    @Getter @Setter @Column(name="telefono")
    private String telefono;


    private String password;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private Long id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
