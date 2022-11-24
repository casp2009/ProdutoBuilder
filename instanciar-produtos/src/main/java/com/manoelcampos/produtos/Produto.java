package com.manoelcampos.produtos;

import java.lang.module.ModuleDescriptor;
import java.time.LocalDate;

/**
 * Produto da loja.
 * @author Manoel Campos da Silva Filho
 */
public class Produto {
    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private int estoque = 0;
    private String categoria;
    private String urlFoto;

    public Produto(long id, String codigoEan, String descricao, String marca, String modelo, double preco,
                   LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, int estoque,
                   String categoria, String urlFoto) {

        this.setId(id);
        this.setCodigoEan(codigoEan);
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPreco(preco);
        this.setDataCadastro(LocalDate.now());
        this.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.setEstoque(estoque);
        this.setCategoria(categoria);
        this.setUrlFoto(urlFoto);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        if(atributoNaoNulo(codigoEan, "CodigoEan")){
            this.codigoEan = codigoEan;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(atributoNaoNulo(descricao, "Descrição")){
            this.descricao = descricao;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(atributoNaoNulo(marca, "Marca")){
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(atributoNaoNulo(modelo, "Modelo")){
            this.modelo = modelo;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            throw new IllegalArgumentException("Preço não pode ser menor ou igual a zero.");
        }else {
            this.preco = preco;
        }
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public final void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if(getDataCadastro().isAfter(dataUltimaAtualizacao)){
            throw new IllegalArgumentException("A data de atualização não pode ser anterior a de criação.");
        }else {
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(atributoNaoNulo(categoria, "Categoria")){
            this.categoria = categoria;
        }
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        if(atributoNaoNulo(urlFoto, "urlFoto")){
            this.urlFoto = urlFoto;
        }
    }

    public boolean atributoNaoNulo(String valor, String tipo){
        if(valor == null || valor.isEmpty()){
            throw new IllegalArgumentException("O atributo "+tipo+" não pode ser nulo ou vazio.");
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", codigoEan='" + codigoEan + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao +
                ", estoque=" + estoque +
                ", categoria='" + categoria + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

}
