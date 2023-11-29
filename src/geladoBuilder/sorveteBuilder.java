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
    private int indexSabores = -1;
    private final int maxSabor = 5;
    private final float custoBola = 2.99f;
    
    public sorveteBuilder() {
        this.nome = "Sorvete";
        this.sabores = new String[10];
        gelado = new Produto(this.nome, this.valor);
        gelado.defSorvete();
    }
    
    public void addSabor(int escolha) {
        String sabor = this.saboresPossiveis[escolha];
        if (this.indexSabores + 1 < this.maxSabor) {
            this.sabores[++this.indexSabores] = sabor;
            this.updateAdc(this.custoBola);
            this.gelado.defSabores(this.sabores);
            this.gelado.defBolasQtd(this.indexSabores+1);
        }
    }
    
    public void removeSabor() {
        if (this.indexSabores > -1) {
            this.sabores[this.indexSabores--] = null;
            this.updateAdc(-this.custoBola);
            this.gelado.defSabores(this.sabores);
            this.gelado.defBolasQtd(this.indexSabores+1);
        }
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
}
