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
public class Bebida extends Produto{
    public String marca;
    public int tamanhoMl;
    public int tempAdeqC;
    
    public Bebida(String nome, float valor, String marca, int tamanhoMl, int tempAdeqC) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.tamanhoMl = tamanhoMl;
        this.tempAdeqC = tempAdeqC;
    } 
}
