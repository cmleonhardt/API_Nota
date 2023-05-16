package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // sequenciador

    private Integer quantidade;

    private Integer valorTotalDoItem;

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

    public Integer getValorTotalDoItem() {
        return valorTotalDoItem;
    }

    public void setValorTotalDoItem(Integer valorTotalDoItem) {
        this.valorTotalDoItem = valorTotalDoItem;
    }
}
