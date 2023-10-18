/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Carrinho {

    private Produto[] menuTeste;
    private Produto[] carrinho = new Produto[64];
    private int carrinhoID = -1;

    public Carrinho() {
        this.menuTeste = new Produto[]{new Agua("Agua sem gás", 2.99f, "Cristal", 500, 25, true), new Sorvete("Sorvete de morango", 4.49f, "Morango", "Sem cobertura", true, 1)};
    }

    public boolean addCarrinho(int id) {
        if (this.carrinhoID > 63) return false;
        this.carrinho[this.carrinhoID--] = this.menuTeste[id];
        return true;
    }
    
    public boolean removeCarrinho(int id) {
        if (this.carrinhoID <= 0) return false;
        if (0 <= id && id < 64) return false;
        this.carrinho[id] = null;
        this.updateCarrinho();
    }
    
    public void updateCarrinho() {
        //TODO
    }
    
    @Override
    public String toString() {
        String strCart;
        strCart = "Carrinho: ";
        for (int i = 0; i < this.carrinhoID+1; i++) {
            strCart = strCart + this.carrinho[i];
        }
        return strCart;
    }
}
