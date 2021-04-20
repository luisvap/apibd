package br.uniso.apibd.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ALUNO")
@Data
@Accessors(chain = true)
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ra", nullable = false)
    private Integer ra;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "idade", nullable = false)
    private Integer idade;

}
