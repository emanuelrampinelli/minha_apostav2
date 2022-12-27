package com.minha.aposta.manel.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "EQUIPE")
@Data
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

}
