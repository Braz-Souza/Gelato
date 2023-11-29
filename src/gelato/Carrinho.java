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

    private final int maxCartSize = 64;
    private Produto[] cart = new Produto[maxCartSize];
    private float price = 0;
    private int cartID = -1;
    
    public Carrinho() {
    }

    public boolean add(Produto produto) {
        if (this.cartID >= maxCartSize-1) return false;
        this.cart[++this.cartID] = produto;
        this.price += produto.obterValor();
        return true;
    }
    
    public boolean del(int id) {
        if (this.cartID < 0) return false;
        if (id < 0 || id > maxCartSize) return false;
        
        this.price -= this.cart[id].obterValor(); 
        
        for (int i = id+1; i<=this.cartID; i++) 
            this.cart[i - 1] = this.cart[i];
        this.cartID--;
        return true;
    }
    
    public boolean buy() {
        if (this.cartID == -1) {
            System.out.println("Carrinho está vazio, não é possível continuar a compra");
            return false;
        }
        System.out.println("Compra concluída!\n");
        String printStr = "Recibo: \n" + this.toString();
        System.out.println(printStr);
        this.clear();
        return true;
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
