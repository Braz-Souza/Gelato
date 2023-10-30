/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import products.Bebida;
import products.Gelado;
import products.Produto;

/**
 *
 * @author brazx
 */
public class ProdutoBuilder {
    private String nome, marca, sabor, cobertura;
    private int tamanhoMl, tempAdeqC, qtdBola;
    private float valor;
    private boolean temGas, canudinho, morango, casquinha;
    
    public ProdutoBuilder(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        this.tempAdeqC = 25;
        this.tamanhoMl = 300;
        this.temGas = false;
        this.canudinho = false;
        this.morango = false;
        this.casquinha = true;
        this.cobertura = "Sem cobertura";
        this.temGas = false;
        this.canudinho = false;
        this.morango = false;
        this.casquinha = true;
        this.qtdBola = 1;
    }
    
    public ProdutoBuilder setSabor(String s) {
        this.sabor = s;
        return this;
    }
    
    public ProdutoBuilder setCobertura(String c) {
        this.cobertura = c;
        return this;
    }
    
    public ProdutoBuilder setTamanhoMl(int t) {
        this.tamanhoMl = t;
        return this;
    }
    
    public ProdutoBuilder setTempAdeqC(int c) {
        this.tempAdeqC = c;
        return this;
    }
    
    public ProdutoBuilder setQtdBola(int q) {
        this.qtdBola = q;
        return this;
    }
    
    public ProdutoBuilder setMarca(String m) {
        this.marca = m;
        return this;
    }
    
    public ProdutoBuilder addGas() {
        this.temGas = true;
        return this;
    }
    
    public ProdutoBuilder addCopo() {
        this.casquinha = false;
        return this;
    }
    
    public ProdutoBuilder addCanudo() {
        this.canudinho = true;
        return this;
    }
    
    public ProdutoBuilder addMorango() {
        this.morango = true;
        return this;
    }
    
    public Produto buildGelado() {
        // Placeholder no momento
        // Após fazer o console utilizavel procurar por melhores alternativas
        return new Gelado(this.nome, this.valor, this.sabor, this.cobertura);
    }
    
    public Produto buildBebida() {
        // Placeholder no momento
        // Após fazer o console utilizavel procurar por melhores alternativas
        return new Bebida(this.nome, this.valor, this.marca, this.tamanhoMl, this.tempAdeqC);
    }
}
