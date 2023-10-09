package gelato;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brazx
 */
public abstract class Produto {
    public String nome;
    public float valor;
    
    @Override
    public String toString() {
        return this.nome + " - Custo: " + this.valor;
    }
}
