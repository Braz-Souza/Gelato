/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geladoBuilder;

import gelato.Produto;

/**
 *
 * @author brazx
 */
public abstract class geladoBuilder {
    protected String nome;
    protected float valor;
    protected String marca;
    protected String cobertura;
    protected float custoCobertura = 0.99f;
    protected String[] saboresPossiveis = {"Morango", "Baunilha", "Chocolate"};    
    protected String[] coberturasPossiveis = {"Morango", "Chocolate"};    
    protected Produto gelado;
    
    public geladoBuilder() {
        valor = 3.99f;
        marca = "Gelato";
        cobertura  = null;
    }
    
    public String[] getSabores() {
        return saboresPossiveis;
    }
    
    public String[] getCoberturas() {
        return coberturasPossiveis;
    }
    
    public void updateAdc(float valorAdc) {
        this.valor += valorAdc;
        this.gelado.atualizarValor(valorAdc);
    }
    
    public float getValor() {
        return valor;
    }
    
    public Produto getGelado() {
        return this.gelado;
    }
}
