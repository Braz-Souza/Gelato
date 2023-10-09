/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Milkshake extends Gelado{
    public int tamanhoMl;
    public boolean canudinho;
    public boolean morango;
    
    public Milkshake(String nome, float valor, String sabor, String cobertura, int tamanhoMl, boolean canudinho, boolean morango) {
        this.nome = nome;
        this.valor = valor;
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.tamanhoMl = tamanhoMl;
        this.canudinho = canudinho;
        this.morango = morango;
    }
}
