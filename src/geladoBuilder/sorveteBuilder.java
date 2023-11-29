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
public class sorveteBuilder extends geladoBuilder{
    private String[] sabores;
    private int indexSabores = 0;
    private int maxSabor = 5;
    private float custoBola = 2.99f;
    private Produto sorvete;
    
    public sorveteBuilder() {
        this.nome = "Sorvete";
        this.sabores = new String[10];
        sorvete = new Produto(this.nome, this.valor);
    }
    
    public void addSabor(int escolha) {
        String sabor = this.saboresPossiveis[escolha];
        if (this.indexSabores + 1 < this.maxSabor)
            sabores[this.indexSabores++] = sabor;
        this.valor += this.custoBola;
        this.sorvete.atualizarValor(this.custoBola);
    }
    
    public void removeSabor() {
        this.indexSabores--;
        this.valor -= this.custoBola;
        this.sorvete.atualizarValor(-this.custoBola);
    }
    
    public void addCobertura(int escolha) {
        String cob = this.coberturasPossiveis[escolha];
        this.cobertura = cob;
        this.valor += this.custoCobertura;
        this.sorvete.atualizarValor(this.custoCobertura);
    }
    
    public void removeCobertura() {
        this.cobertura = "Sem Cobertura";
        this.valor -= this.custoCobertura;
        this.sorvete.atualizarValor(-this.custoCobertura);
    }
    
    public Produto getSorvete() {
        return sorvete;
    }
}
