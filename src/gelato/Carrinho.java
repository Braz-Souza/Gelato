/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import products.Produto;

/**
 *
 * @author brazx
 */
public class Carrinho {

    private final Produto[] menuTeste;
    private final int maxCartSize = 64;
    private Produto[] cart = new Produto[maxCartSize];
    private float price = 0;
    private int cartID = -1;
    
    public Carrinho() {
        this.menuTeste = new Produto[]{
            new ProdutoBuilder("Agua", 2.99f).setTamanhoMl(500).buildBebida(), 
            new ProdutoBuilder("Sorvete de morango", 5.99f).setSabor("Morango").buildGelado(), 
            new ProdutoBuilder("Milkshake de Baunilha", 9.99f).setSabor("Baunilha").buildGelado(), 
            new ProdutoBuilder("Coca-Cola", 2.76f).buildBebida(), 
            new ProdutoBuilder("Agua", 10.50f).setTamanhoMl(2000).buildBebida(),
        };
    }

    public boolean add(int id) {
        if (this.cartID >= maxCartSize-1) return false;
        this.cart[++this.cartID] = this.menuTeste[id];
        this.price += this.cart[this.cartID].valor;
        return true;
    }
    
    public boolean del(int id) {
        if (this.cartID < 0) return false;
        if (id < 0 || id > maxCartSize) return false;
        
        this.price -= this.cart[id].valor; 
        
        for (int i = id+1; i<=this.cartID; i++) 
            this.cart[i - 1] = this.cart[i];
        this.cartID--;
        return true;
    }
    
    public void buy() {
        if (this.cartID == -1) {
            System.out.println("Carrinho está vazio, não é possível continuar a compra");
        } else {
            System.out.println("Compra concluída!\n");
            String printStr = "Recibo: \n" + this.toString();
            System.out.println(printStr);
            this.clear();
        }
    }
    
    public void clear() {
        this.cartID = -1;
    }
    
    public void print() {
        String printStr = "Carrinho: \n" + this.toString();
        System.out.println(printStr);
    }
    
    @Override
    public String toString() {
        if (this.cartID == -1)
            return "    Carrinho Vazio";
        
        String strCart, iStr;
        strCart = "";
        for (int i = 0; i < this.cartID+1; i++) {
            iStr = "    "  + String.valueOf(i) + " -> " + this.cart[i] + "\n";
            strCart += iStr;
        }
        strCart += "Valor Total = " + String.format("%.2f", this.price);
        return strCart;
    }
}
