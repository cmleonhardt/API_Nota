package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // sequenciador

    private Integer numeroDoItem;

    private Integer quantidade;

    private BigDecimal valorTotalDoItem;

    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Nota nota;



    public Itens() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotalDoItem() {
        return valorTotalDoItem;
    }

    public void setValorTotalDoItem(BigDecimal valorTotalDoItem) {
        this.valorTotalDoItem = valorTotalDoItem;
    }

    public Integer getNumeroDoItem() {
        return numeroDoItem;
    }

    public void setNumeroDoItem(Integer numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }
}
