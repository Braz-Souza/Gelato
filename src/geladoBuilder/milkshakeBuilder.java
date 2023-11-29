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
public class milkshakeBuilder extends geladoBuilder{
    private String sabor;
    private int tamMl;
    private final int[] tamanhosDisponiveis = {300, 500, 700, 1000};
    
    public milkshakeBuilder() {
        this.valor += 6;
        this.nome = "Milkshake";
        this.sabor = "Baunilha";
        this.tamMl = 300;
        gelado = new Produto(this.nome, this.valor);
        gelado.defMilkShake();
        this.gelado.defSabor(this.sabor);
        this.gelado.defTam(this.tamMl);
    }
    
    public void setSabor(int escolha) {
        String saborAtual = this.saboresPossiveis[escolha];
        this.sabor = saborAtual;
        this.gelado.defSabor(saborAtual);
    }
    
    public void addCobertura(int escolha) {
        if (this.cobertura == null) {
            String cob = this.coberturasPossiveis[escolha];
            this.cobertura = cob;
            this.updateAdc(this.custoCobertura);
            this.gelado.defCobertura(cob);
        }
    }
    
    public void removeCobertura() {
        if (this.cobertura != null) {
            this.cobertura = null;
            this.updateAdc(-this.custoCobertura);
            this.gelado.defCobertura(null);
        }
    }

    public void mudarTamanho(int escolha) {
        int tam = this.tamanhosDisponiveis[escolha];
        this.tamMl = tam;
        this.gelado.defTam(tam);
    }
    
    public int[] getTamanhos() {
        return tamanhosDisponiveis;
    }
}
