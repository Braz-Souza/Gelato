/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geladoBuilder;

import java.util.Scanner;
import products.Gelado;

/**
 *
 * @author brazx
 */
public class sorveteBuilder implements geladoBuilder{

    Scanner input = new Scanner(System.in);
    private float valor;
    private String cobertura;
    private String[] sabores;
    private int qtdBolas;
    
    public sorveteBuilder() {
        this.cobertura = "";
        this.valor = 3.99f;
        this.qtdBolas = 1;
        this.sabores = new String[5];
    }

    public void adicionarSabor(String sabor) {
        this.sabores[this.qtdBolas] = sabor;
    }
    
    public boolean menuSabor() {
        System.out.println("+----------------------+");
        System.out.println("|   Escolha um sabor   |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Baunilha          |");
        System.out.println("|2 - Chocolate         |");
        System.out.println("|3 - Mista             |");
        System.out.println("|4 - Desistir Compra   |");
        System.out.println("+----------------------+");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        
        switch (opcao) {
            case 1:
                this.sabores[0] = ("Baunilha");
                break;
            case 2:
                this.sabores[0] = ("Chocolate");
                break;
            case 3:
                this.sabores[0] = ("Mista");
                break;
            case 4:
            default:
                return false;
        }
        return true;
    }
    
    public boolean menuBola() {
        System.out.println("+----------------------+");
        System.out.println("|   Escolha um sabor   |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Baunilha          |");
        System.out.println("|2 - Chocolate         |");
        System.out.println("|3 - Mista             |");
        System.out.println("|4 - Desistir Compra   |");
        System.out.println("+----------------------+");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        
        switch (opcao) {
            case 1:
                adicionarSabor("Baunilha");
                break;
            case 2:
                adicionarSabor("Chocolate");
                break;
            case 3:
                adicionarSabor("Mista");
                break;
            case 4:
            default:
                return false;
        }
        return true;
    }
    
    public boolean menuCobertura() {
        System.out.println("+----------------------+");
        System.out.println("| Escolha uma cobertura|");
        System.out.println("+----------------------+");
        System.out.println("|1 - Morango           |");
        System.out.println("|2 - Chocolate         |");
        System.out.println("|3 - Caramelo          |");
        System.out.println("|4 - Remover Cobertura   |");
        System.out.println("|5 - Desistir Compra   |");
        System.out.println("+----------------------+");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        
        switch (opcao) {
            case 1:
                this.cobertura = "Morango";
                break;
            case 2:
                this.cobertura = "Chocolate";
                break;
            case 3:
                this.cobertura = "Caramelo";
                break;
            case 4:
                this.cobertura = "";
            case 5:
            default:
                return false;
        }
        return true;
    }
    
    public boolean adicionarBola() {
        if (this.qtdBolas >= 3) {
            System.out.println("Muitas bolas adicionadas, sorvete caiu!!");
            return false;
        }
        if (this.menuBola()) {
            this.valor += 3;
            this.qtdBolas += 1;
            System.out.println("Bola adicionada!");
        }
        return true;
    }
    
    public void imprimirCusto() {
        System.out.println(String.format("O sorvete atual custa %.2f", this.valor));
    }
    
    @Override
    public Gelado menu() {
        System.out.println("+------------------------------+");
        System.out.println(String.format("|  Montando Sorvete  - %.2fR$  |", this.valor));
        System.out.println("+------------------------------+");
        System.out.println("|1 - Trocar sabor + 0R$        |");
        System.out.println("|2 - Adicionar Cobertura + 2R$ |");
        System.out.println("|3 - Adicionar Bola + 3R$      |");
        System.out.println("|4 - Mostrar Sorvete           |");
        System.out.println("|5 - Comprar                   |");
        System.out.println("|6 - Desistir Compra           |");
        System.out.println("+------------------------------+");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        
        while (opcao != 6) {
            switch (opcao) {
                case 1:
                    this.setSabor();
                    break;
                case 2:
                    this.setCobertura();
                    break;
                case 3:
                    if (!this.adicionarBola())
                        return new Gelado("", this.valor, this.sabores, this.cobertura);
                    break;
                case 4:
                    this.print();
                    break;
                case 5:
                    return this.comprar();
                case 6:
                    return new Gelado("", this.valor, this.sabores, this.cobertura);
                default:
            }
            System.out.println("+------------------------------+");
            System.out.println(String.format("|  Montando Sorvete  - %.2fR$  |", this.valor));
            System.out.println("+------------------------------+");
            System.out.println("|1 - Trocar sabor + 0R$        |");
            System.out.println("|2 - Adicionar Cobertura + 2R$ |");
            System.out.println("|3 - Adicionar Bola + 3R$      |");
            System.out.println("|4 - Mostrar Sorvete           |");
            System.out.println("|5 - Comprar                   |");
            System.out.println("|6 - Desistir Compra           |");
            System.out.println("+------------------------------+");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
        }
        return new Gelado("", this.valor, this.sabores, this.cobertura);
    }
    
    @Override
    public Gelado run(){
        if (this.menuSabor()) {
            return this.menu();
        }
        return new Gelado("", this.valor, this.sabores, this.cobertura);
    }

    @Override
    public Gelado comprar() {
        String nome;
        if (qtdBolas > 1)
            nome = "Sorvete de "+String.valueOf(this.qtdBolas)+" bolas";
        else
            nome = "Sorvete de "+sabores[0];
        return new Gelado(nome, this.valor, this.sabores , this.cobertura);
    }
    
    @Override
    public void print() {
        String topo = "       ()\n      (__)\n     (____)\n    ("+this.sabores[this.qtdBolas - 1]+")\n";
        for (int i = this.qtdBolas - 1; i>0; i--) {
            topo += "     (____)\n    ("+this.sabores[i-1]+")\n";
        } 
        String base = "   (________)\n  (__________)\n   \\/\\/\\/\\/\\/\n    \\/\\/\\/\\/\n     \\/\\/\\/\n      \\/\\/\n       \\/";
        System.out.println(topo+base);
    }

    @Override
    public void setSabor() {
        System.out.println("+----------------------+");
        System.out.println("|  Escolha uma camada  |");
        System.out.println("+----------------------+");
        this.print();
        int opcao1 = input.nextInt();
        
        int opcao2 = 0;
        while (opcao2 == 0) {
            System.out.println("+----------------------+");
            System.out.println("|   Escolha um sabor   |");
            System.out.println("+----------------------+");
            System.out.println("|1 - Morango           |");
            System.out.println("|2 - Chocolate         |");
            System.out.println("|3 - Caramelo          |");
            System.out.println("+----------------------+");
            System.out.print("Escolha uma opção: ");
            opcao2 = input.nextInt();

            switch (opcao2) {
                case 1:
                    this.sabores[opcao1-1] = "Morango";
                    break;
                case 2:
                    this.sabores[opcao1-1] = "Chocolate";
                    break;
                case 3:
                    this.sabores[opcao1-1] = "Caramelo";
                    break;
                default:
                    opcao2 = 0;
            }
        }
    }

    @Override
    public void setCobertura() {
        boolean temCobertura = this.cobertura != "";
        boolean temCobertura2 = this.menuCobertura();
        if (temCobertura && !temCobertura2) {
            this.valor -= 2;
            System.out.println("Cobertura removida!");
        }
        if (!temCobertura && temCobertura2) { 
            this.valor += 2;
            System.out.println("Cobertura adicionada!");
            
        }
    }
}
