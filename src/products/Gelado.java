/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

import products.Produto;

/**
 *
 * @author brazx
 */
public class Gelado extends Produto{
    public String[] sabores;
    public String cobertura;
    
    public Gelado(String nome, float valor, String[] sabor, String cobertura) {
        this.nome = nome;
        this.valor = valor;
        this.sabores = sabor;
        this.cobertura = cobertura;
    } 
}
