package gelato;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brazx
 */
public class Produto {
    public String nome;
    public float valor;
    public String marca;
    public String[] sabores;
    public String sabor;
    public String cobertura;
    
    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public void atualizarValor(float s) {
        this.valor += s;
    }
    
    @Override
    public String toString() {
        return this.nome + " - Custo: " + this.valor;
    }
}
