 /* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author GabCib
 */
public final class SingletonMenu {
    
    private static SingletonMenu instancia = null;
    private Carrinho carrinho;
    
    
    
    
    
    // Construtor privado para evitar a criação direta de instâncias    
    private SingletonMenu(){
        // Inicialização do menu
    }
    
    
    // Método público para obter a instância única do menu
    public static SingletonMenu getInstancia(){
        
        if (SingletonMenu.instancia == null){
            
            SingletonMenu.instancia = new SingletonMenu();
        }
        return SingletonMenu.instancia;
    }
 
    
    
 ///////////////////////////////////////////////////////////////////////////////
    
    
    
   // LISTA DE PRODUTOS DISPONIVEIS 
   protected Produto[] agua = new Produto[]{
            new Produto("Agua - Com gas", 4f),
            new Produto("Agua - Sem gas", 3f)
   };
    
    
   protected Produto[] refri = new Produto[]{
            new Produto("Refrigerante - Guarana", 3.70f),
            new Produto("Refrigerante - Laranja", 3.80f),
            new Produto("Refrigerante - Uva", 3.80f),
            new Produto("Refrigerante - Cola", 3.20f)
   };
    
   
   protected Produto[] energ = new Produto[]{
            new Produto("Energetico - Melancia", 9.00f),
            new Produto("Energetico - Pitaya", 8.50f),
            new Produto("Energetico - Açai", 9.50f),
            new Produto("Energetico - Tradicional", 7.50f)
   };
   
   
   // FUNÇAO QUE IMPRIME OS PRODUTOS DOS VETORES
   public void listarProdutos() {
        Produto[][] todosProdutos = {agua, refri, energ};

        int id = 0;

        for (Produto[] categoria : todosProdutos) {
            for (Produto produto : categoria) {
                System.out.println("ID: " + id + " - " + produto.getNome() + " - R$" + produto.getPreco());
                id++;
            }
        }
    }
   
   
   // FUNÇAO QUE JUNTA OS ELEMENTOS DOS VETORES DE PRODUTO EM UM UNICO VETOR
    public Produto[] juntarVetoresP(){
        
        // Juntar os elementos dos vetores em um único vetor
        List<Produto> produtosList = new ArrayList<>();
        produtosList.addAll(Arrays.asList(agua));
        produtosList.addAll(Arrays.asList(refri));
        produtosList.addAll(Arrays.asList(energ));

        // Converter a lista de produtos de volta para um array, se necessário
        Produto[] todosProdutos = produtosList.toArray(new Produto[0]);

        // Agora, 'todosProdutos' contém todos os elementos dos vetores 'agua', 'refri' e 'energ'
        return todosProdutos;
    }
    
    
    
////////////////////////////////////////////////////////////////////////////////
    
    
   // METODOS IMPLEMENTADOS PARA O FUNCIONARIO
   

    
   Scanner entrada = new Scanner(System.in);
   
  
   // MENU DO FUNCIONARIO
   protected void MenuF(){
        System.out.println("\n+----------------------+");
        System.out.println("|     Funcionario      |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Adicionar produto |");
        System.out.println("|2 - Remover produto   |");
        System.out.println("|3 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("Escolha a opção desejada: ");
        
        int opcao = entrada.nextInt();
         System.out.println("--------------------------\n");   
         boolean run = true;
         while(run){
            switch (opcao) {
                
                case 1:
                    adicionar_Produto();
                    break;
                case 2:
                    remover_Produto();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    MenuF();
   }
         }
   }
   
   
   
    static void adicionarProduto(Produto[] vetor) {
     // Encontrar a primeira posição vazia no vetor
     int indice = -1;
     for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] == null) {
             indice = i;
             break;
         }
     }

     // Se houver uma posição vazia, adicionar o novo produto
     if (indice != -1) {
         
         Scanner scanner = new Scanner(System.in);

        // Solicitar ao funcionario que insira o nome do produto
        System.out.print("Digite o nome do produto: ");

        // Ler a string inserida pelo usuário
        String nome = scanner.nextLine();
        
        // Solicitar ao usuário que insira uma string
        System.out.print("Digite o valor do produto: ");

        // Ler o float inserida pelo usuário
        float valor = scanner.nextFloat();

        // Adicionar um produto ao vetor
        Produto novoProduto = new Produto(nome, valor);
         
        
         vetor[indice] = novoProduto;
         System.out.println("Produto adicionado com sucesso.");
     } else {
         System.out.println("O vetor está cheio. Não foi possível adicionar o produto.");
     }
 }

   
   
   // ADICIONA UM PRODUTO NA LISTA DE PRODUTOS DISPONIVEIS
   protected void adicionar_Produto(){
       System.out.println("Adicionar elemento\n ");
       System.out.println("|1 - Agua         |");
       System.out.println("|2 - Refrigerante |");
       System.out.println("|3 - Energetico   |");
       System.out.println("|0 - Sair         |");
       System.out.print("\nDigite a categoria que voce quer adicionar o produto: ");

       int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                Produto[] A = this.agua;
                adicionarProduto(A);
                break;
            case 2:
                Produto[] R = this.refri;
                adicionarProduto(R);
                break;
            case 3:
                Produto[] E = this.energ;
                adicionarProduto(E);
                break;
            case 0:
                MenuF();
            default:
                System.out.println("Opção inválida!\n");
                adicionar_Produto();
                break;
        }  
                    
   }
   
   
   
    static void removerProduto(Produto[] vetor, int indice) {
     if (indice >= 0 && indice < vetor.length && vetor[indice] != null) {
         System.out.println("Removendo produto: " + vetor[indice].getNome());
         vetor[indice] = null;
         System.out.println("Produto removido com sucesso.");
     } else {
         System.out.println("Índice inválido ou produto não encontrado.");
     }
    }
   
    
    
    // ADICIONA UM PRODUTO NA LISTA DE PRODUTOS DISPONIVEIS
   protected void remover_Produto(){
       
       System.out.println("Remover elemento\n");
       System.out.println("|1 - Agua         |");
       System.out.println("|2 - Refrigerante |");
       System.out.println("|3 - Energetico   |");
       System.out.println("\nDigite a categoria que voce quer remover o produto:");

       int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                Produto[] A = this.agua;
                listarProdutosPorCategoria( A, "Agua");
                System.out.print("Selecione um produto para remover: ");
                int escolha = entrada.nextInt();
                removerProduto(A, escolha);
                break;
            case 2:
                Produto[] R = this.refri;
                listarProdutosPorCategoria( R, "Refrigerante");
                System.out.print("Selecione um produto para remover: ");
                int escolha1 = entrada.nextInt();
                removerProduto(R, escolha1);
                break;
            case 3:
                Produto[] E = this.energ;
                listarProdutosPorCategoria( E, "Energetico");
                System.out.print("Selecione um produto para remover: ");
                int escolha2 = entrada.nextInt();
                removerProduto(E, escolha2);
                break;
            case 0:
                MenuF();
            default:
                System.out.println("Opção inválida!\n");
                remover_Produto();
                break;
        }  
   }
   
   
   public void listarProdutosPorCategoria(Produto[] vetor, String categoria) {
        System.out.println("Produtos da categoria: " + categoria);
        int id = 0;
        for (Produto produto : vetor) {
            
            if (produto != null) {
                System.out.println("Id:" + id + " - " + produto.getNome() + " - R$" + produto.getPreco());
            }
            id++;
        }
        System.out.println();
    }
   
   
////////////////////////////////////////////////////////////////////////////////
   
  
    // METODOS IMPLEMENTADOS PARA O CARRINHO DE COMPRAS
   
   
    Scanner input = new Scanner(System.in);
    
    // FUNÇAO PARA ATRIBUR O CARRINHO AO MENU
    protected void carrinho(Carrinho cart) {
        this.carrinho = cart;
    }
    
    // VER OS PRODUTOS DO CARRINHO
    protected void verCart() {
        carrinho.print();
    }
    
    // ADICIONAR PRODUTO NO CARRINHO
    protected void addCart() {
        
        Produto[] produto = juntarVetoresP();
        System.out.print("Escolha o número do item no cardápio para adicionar no carrinho: ");
        int opcao = input.nextInt();
        carrinho.add(produto[opcao]);
    }
    
    // REMOVER PRODUTO DO CARRINHO
    protected void delCart() {
        
        verCart();
        System.out.print("Escolha o número do item no carrinho para remover: ");
        int opcao = input.nextInt();
        carrinho.del(opcao);
    }
    
    // FINALIZAR COMPRA
    protected boolean buy() {
      if (carrinho.buy()) {
           System.out.println("Obrigado por comprar conosco!\nDeseja continuar comprando? (0 => SIM)");
           int opcao = input.nextInt();
           return opcao == 0;
       }
      return true;
   }
    
   
    
////////////////////////////////////////////////////////////////////////////////    
    
    // METODOS IMPLEMENTADOS PARA O MENU
    
    
   // Boas vindas
   protected void printWelcome() {
        System.out.println("+---------------------------------------+");
        System.out.println("| Seja Bem Vindo a Sorveteria Gelato!!! |");
        System.out.println("+---------------------------------------+");
    }
    
   
   
   // MENU PRINCIPAL
   protected void printMainMenu() { 
       
        System.out.println("\n+----------------------+");
        System.out.println("|         Cliente      |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Ver cardapio      |");
        System.out.println("|2 - Ver carrinho      |");
        System.out.println("|3 - Remover Produto   |");
        System.out.println("|4 - Finalizar compra  |");
        System.out.println("|5 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("Escolha a opção desejada: ");
        
         int opcao = input.nextInt();
         System.out.println("--------------------------\n");   
         boolean run = true;
         while(run){
            switch (opcao) {
                
                case 1:
                    verCardapio();
                    break;
                case 2:
                    this.verCart();
                    break;
                case 3:
                    this.delCart();
                    break;
                case 4:
                    run = this.buy();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    printMainMenu();
    }
   }
   }
   
   
   // CARDAPIO
   protected void verCardapio() {
       
    System.out.println("+----------------------+");
    System.out.println("|       CARDAPIO       |");
    System.out.println("+----------------------+");
    System.out.println("|1 - Ver Gelados       |");
    System.out.println("|2 - Ver Bebidas       |");
    System.out.println("|0 - Voltar ao menu    |");
    System.out.println("+----------------------+");

    System.out.println("+----------------------+");
    System.out.print("Escolha a opção desejada: ");

    int opcao = input.nextInt();
    System.out.println("+----------------------+\n");
    switch (opcao) {

            case 1:

                addGelado();
                break;

            case 2:

                mostrarBebidas();    
                break;
            
            case 0:
                
                printMainMenu();
                break;
                
            default:
                    System.out.println("Opção inválida!\n");
                    verCardapio();
            }
   }
    
   
   // CRIAR GELADOS
   
   protected void addGelado() {
      ConsoleGelado console = new ConsoleGelado();
      console.run(this.carrinho);
 }
   
   
   // VER BEBIDAS
   
   public void mostrarBebidas(){
    System.out.println("+-----------------------+");
    System.out.println("|        BEBIDAS        |");
    System.out.println("+-----------------------+");
    System.out.println("+--------------------------+");
    listarProdutos();
    System.out.println("+--------------------------+");
    System.out.println("+--------------------------------------+");
    System.out.println("|1 - Adicionar bebida                  |");
    System.out.println("|0 - Voltar ao cardapio                |");
    System.out.println("+--------------------------------------+\n");
    System.out.println("+----------------------+");
    System.out.print("Escolha a opção desejada: ");

    int opcao = entrada.nextInt();
    System.out.println("+----------------------+\n");
    switch (opcao) {

            case 1:
                
                addCart();
                break;
                
            case 0:

                verCardapio();
                break;

            default:
                    System.out.println("Opção inválida!\n");
                    mostrarBebidas();
            }
    
    
    }
}