package com.hellow.eventos.classes.ingresso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_endereco;
    private String logradouro;
    private String nome;
    private Integer numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String complemento;

    @ManyToOne
    @JoinColumn(name="id_ingresso")
    private Ingresso Ingresso_id;

}
