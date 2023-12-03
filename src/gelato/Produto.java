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
    protected final String nome;
    protected float valor;
    private String[] sabores;
    private String sabor;
    private String cobertura;
    private int tamMl;
    private int qtdBolas;
    private boolean sorv;
    private boolean milkS;

    
    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        this.sorv = false;
        this.milkS = false;
        this.cobertura = null;
        this.sabor = null;
        this.qtdBolas = 0;
    }
    public String getNome(){
        return nome;
    }
    
    public float getPreco(){
        return valor;
    }
    
    public float obterValor() {
        return valor;
    }
    
    public void defSorvete() {
        this.sorv = true;
    }
    
    public void defMilkShake() {
        this.milkS = true;
    }
    
    public void defSabores(String[] sabs) {
        this.sabores = sabs;
    }
    
    public void defSabor(String sab) {
        this.sabor = sab;
    }
    
    public void defCobertura(String cob) {
        this.cobertura = cob;
    }
    
    public void defTam(int ml) {
        this.tamMl = ml;
    }
    
    public void defBolasQtd(int qtd) {
        this.qtdBolas = qtd;
    }
    
    public void atualizarValor(float s) {
        this.valor += s;
    }
    
    public String saboresToString() {
        if (this.sabores == null) return "";
        String sab = "";
        for (String sabore : this.sabores) {
            if (sabore != null)
                sab += sabore + ", ";
        }
        return sab;
    }
    
    @Override
    public String toString() {
        String res = this.nome;
        
        if (this.sorv) 
            res += 
                    " de "+this.saboresToString()+
                    " - Quantidade de bolas "+this.qtdBolas;
        
        if (this.milkS)
            res += 
                    " de "+this.sabor+
                    " - Tamanho "+this.tamMl+" Ml";
        
        if (this.cobertura != null)
            res += " - Cobertura " + this.cobertura;
        
        return res + " - Custo: " + this.valor;
    }
}
