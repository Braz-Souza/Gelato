/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Sorvete extends Gelado{
    public boolean casquinha;
    public int qtdBola;
    
    public Sorvete(String nome, float valor, String sabor, String cobertura, boolean casquinha, int qtdBola) {
        this.nome = nome;
        this.valor = valor;
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.casquinha = casquinha;
        this.qtdBola = qtdBola;
    }
}
