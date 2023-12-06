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
        boolean run = true;
        while(run){
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
            }
            
         }
   }
   
   
   
    static Produto[] adicionarProduto(Produto[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao funcionario que insira o nome do produto
        System.out.print("Digite o nome do produto: ");

        // Ler a string inserida pelo usuário
        String nome = scanner.nextLine();
        
        // Solicitar ao usuário que insira uma string
        System.out.print("Digite o valor do produto: ");

        // Ler o float inserida pelo usuário
        float valor = scanner.nextFloat();

        // Cria um novo Produto e adiciona ao vetor
        Produto novoProduto = new Produto(nome, valor);

        // Cria um novo vetor com tamanho aumentado
        Produto[] novoVetor = new Produto[vetor.length + 1];

        // Copia os elementos do vetor antigo para o novo vetor
        System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);

        // Adiciona o novo Produto ao final do novo vetor
        novoVetor[novoVetor.length - 1] = novoProduto;

        // Atualiza o vetor
        vetor = novoVetor;
        

        return vetor;
 }

   
   
   // ADICIONA UM PRODUTO NA LISTA DE PRODUTOS DISPONIVEIS
   protected void adicionar_Produto(){
       System.out.println("\n+----------------------+");
       System.out.println("|   Adicionar elemento |");
       System.out.println("+----------------------+");
       System.out.println("|1 - Agua              |");
       System.out.println("|2 - Refrigerante      |");
       System.out.println("|3 - Energetico        |");
       System.out.println("|0 - Sair              |");
       System.out.println("+----------------------+");
       System.out.print("\nDigite a categoria que voce quer adicionar o produto: ");

       int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                agua = adicionarProduto(agua);
                break;
            case 2:
                Produto[] R = refri;
                refri = adicionarProduto(refri);
                break;
            case 3:
                Produto[] E = energ;
                energ = adicionarProduto(energ);
                break;
            case 0:
                MenuF();
            default:
                System.out.println("Opção inválida!\n");
                adicionar_Produto();
                break;
        }  
                    
   }
   
   
   
    static Produto[] removerProduto(Produto[] vetor, int indice) {
     
        int index = indice;

        if (index >= 0 && index < vetor.length) {
            // Cria um novo vetor com tamanho reduzido
            Produto[] novoVetor = new Produto[vetor.length - 1];

            // Copia os elementos do vetor antigo para o novo vetor, excluindo o elemento a ser removido
            System.arraycopy(vetor, 0, novoVetor, 0, index);
            System.arraycopy(vetor, index + 1, novoVetor, index, vetor.length - index - 1);

            // Atualiza o vetor
            vetor = novoVetor;
        
    }
    // Se o índice for inválido, retorna o vetor original sem alterações
    return vetor;
    }
    
    
    // ADICIONA UM PRODUTO NA LISTA DE PRODUTOS DISPONIVEIS
   protected void remover_Produto(){
       
       System.out.println("\n+----------------------+");
       System.out.println("|   Remover elemento   |");
       System.out.println("+----------------------+");
       System.out.println("|1 - Agua              |");
       System.out.println("|2 - Refrigerante      |");
       System.out.println("|3 - Energetico        |");
       System.out.println("\nDigite a categoria que voce quer remover o produto:");

       int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                listarProdutosPorCategoria( agua, "Agua");
                System.out.print("Selecione o indice do produto para remove-lo: ");
                int escolha = entrada.nextInt();
                
                agua = removerProduto(agua, escolha);
                break;
            case 2:
                listarProdutosPorCategoria( refri, "Refrigerante");
                System.out.print("Selecione o indice do produto para remove-lo: ");
                int escolha1 = entrada.nextInt();
                
                refri = removerProduto(refri, escolha1);
                break;
            case 3:
                listarProdutosPorCategoria( energ, "Energetico");
                System.out.print("Selecione o indice do produto para remove-lo: ");
                int escolha2 = entrada.nextInt();
                
                energ = removerProduto(energ, escolha2);
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
        
    System.out.println("\n+-------------------------+");
    System.out.println("|1 - Adicionar produtos   |");
    System.out.println("|2 - Remover produtos     |");
    System.out.println("|0 - Voltar ao menu       |");
    System.out.println("+-------------------------+");
    System.out.print("\nEscolha a opção desejada: ");
    
    int opcao = input.nextInt();
    switch (opcao) {
                
                case 1:
                    verCardapio();
                    break;
                case 2:
                    this.delCart();
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Opção inválida!\n");

    }
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
        
        System.out.print("\nEscolha o número do item no carrinho para remover: ");
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
    
    // METODOS IMPLEMENTADOS PARA O MENU DO CLIENTE
    
    
   // Boas vindas
   protected void printWelcome() {
        System.out.println("+---------------------------------------+");
        System.out.println("| Seja Bem Vindo a Sorveteria Gelato!!! |");
        System.out.println("+---------------------------------------+");
    }
    
   private int printMainMenu() {
        System.out.println("\n+----------------------+");
        System.out.println("|         Cliente      |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Ver cardapio      |");
        System.out.println("|2 - Ver carrinho      |");
        System.out.println("|3 - Finalizar compra  |");
        System.out.println("|4 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("\nEscolha a opção desejada: ");
        
        int opcao = input.nextInt();
        return opcao;
   }
   
   // MENU PRINCIPAL
   protected void mainMenu() { 
       
        int opcao = printMainMenu();
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
                    run = this.buy();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
            if (run) opcao = printMainMenu();
        }
   }
   
   
   // CARDAPIO
   protected void verCardapio() {
       
    System.out.println("\n+----------------------+");
    System.out.println("|       CARDAPIO       |");
    System.out.println("+----------------------+");
    System.out.println("|1 - Ver Gelados       |");
    System.out.println("|2 - Ver Bebidas       |");
    System.out.println("|0 - Voltar ao menu    |");
    System.out.println("+----------------------+");

    System.out.println("+----------------------+");
    System.out.print("\nEscolha a opção desejada: ");

    int opcao = input.nextInt();
    switch (opcao) {

            case 1:

                addGelado();
                break;

            case 2:

                mostrarBebidas();    
                break;
            
            case 0:
                
                mainMenu();
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
    System.out.println("\n+-----------------------+");
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
    System.out.print("\nEscolha a opção desejada: ");

    int opcao = entrada.nextInt();
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