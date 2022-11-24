package com.manoelcampos.produtos;

import java.time.LocalDate;

public final class ProdutoBuilder {
    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private int estoque;
    private String categoria;
    private String urlFoto;

    private ProdutoBuilder() {
    }

    public static ProdutoBuilder aProduto() {
        return new ProdutoBuilder();
    }

    public ProdutoBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder withCodigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
        return this;
    }

    public ProdutoBuilder withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder withModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder withPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder withDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder withDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder withEstoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder withCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder withUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public Produto build() {
        return new Produto(id, codigoEan, descricao, marca, modelo, preco, dataCadastro, dataUltimaAtualizacao, estoque, categoria, urlFoto);
    }
}
