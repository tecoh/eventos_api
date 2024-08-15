package com.hellow.eventos.classes.midia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="midia")
@Table(name="midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Midia {
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
    @JoinColumn(name="id_midia")
    private Midia Midia_id;

}
