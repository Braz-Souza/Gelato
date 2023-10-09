/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Agua extends Bebida{
    public boolean temGas;
    
    public Agua(String nome, float valor, String marca, int tamanhoMl, int tempAdeqC, boolean temGas) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.tamanhoMl = tamanhoMl;
        this.tempAdeqC = tempAdeqC;
        this.temGas = temGas;
    }   
}
