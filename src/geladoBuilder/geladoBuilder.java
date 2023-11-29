/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geladoBuilder;

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
    
    public geladoBuilder() {
        valor = 3.99f;
        marca = "Gelato";
        cobertura  = "Sem Cobertura";
    }
    
    public String[] getSabores() {
        return saboresPossiveis;
    }
    
    public String[] getCoberturas() {
        return coberturasPossiveis;
    }
    
    public float getValor() {
        return valor;
    }
}
