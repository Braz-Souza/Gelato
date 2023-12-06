/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import java.util.Scanner;

/**
 *
 * @author brazx
 */
public class Console {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    
    public Console() {
    }
    
    // "DUAS" INSTANCIAS DO SINGLETON
    SingletonMenu menuC = SingletonMenu.getInstancia();
    SingletonMenu menuF = SingletonMenu.getInstancia();

    
    // LISTA DE FUNCIONARIOS
    private Cliente[] c = new Cliente[]{
            new Cliente("Braz", "Braz10"),
            new Cliente("Gabriel", "Gabriel9")
   };
    
    // LISTA DE CLIENTES    
    private Funcionario[] f = new Funcionario[]{
            new Funcionario("Braz", "Braz10"),
            new Funcionario("Gabriel", "Gabriel9")
   };
    
    
    public void run() {
        this.printWelcome();
        boolean run = true;
        
        
        this.login();
        int opcao = input.nextInt();
        while (run) {
            switch (opcao) {
                case 1:
                    senha(1);
                    break;
                case 2:
                    senha(2);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
            if (run) {
                this.login();
                opcao = input.nextInt();
            }
        }
    }
    
    private void printWelcome() {
        System.out.println("+---------------------------------------+");
        System.out.println("| Seja Bem Vindo a Sorveteria Gelato!!! |");
        System.out.println("+---------------------------------------+");
    }
    
    private void login() {
        System.out.println("+----------------------+");
        System.out.println("|     Tela de Login    |");
        System.out.println("+----------------------+");
        System.out.println("|Entrar como:          |");        
        System.out.println("|1 - Cliente           |");
        System.out.println("|2 - Funcionario       |");
        System.out.println("|0 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("Escolha a opção desejada: ");
    }
    
    private void senha(int escolha){
       
        if (escolha == 1){
            
            System.out.println("+-----------------------------+");
            System.out.println("|   Tela de Login - Cliente   |");
            System.out.println("+-----------------------------+");       

            String usuario = InsUsuario();


            if(usuario != null){
                String senha = InsSenha();


                System.out.println("+-----------------------------+"); 

                boolean R = verificarSenhaCliente(c, usuario, senha);

                if(R == true){
                                System.out.println("Entrando........");
                                menuC.mainMenu();
                            }
                else{
                    System.out.println("Opçao invalida!!!");
                    senha(1);
                }   
        }
        
        }
        else if(escolha == 2){
        
        System.out.println("+-----------------------------+");
        System.out.println("| Tela de Login - Funcionario |");
        System.out.println("+-----------------------------+");       
        
        String usuario = InsUsuario();
        
        if(usuario != null){
            String senha = InsSenha();

            System.out.println("+-----------------------------+"); 

            boolean R = verificarSenhaFuncionario(f, usuario, senha);

            if(R == true){
                            System.out.println("Entrando........");
                            menuF.MenuF();
                        }
            else{
                System.out.println("Opçao invalida!!!");
                senha(2);
            }   
        }
    }
    }
    
    
    
    private boolean verificarSenhaCliente(Cliente[] vetor, String usuario, String senha) {
        
        for (Cliente cliente : vetor) {
            
            if (cliente != null) {
                
                if(cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senha)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean verificarSenhaFuncionario(Funcionario[] vetor, String usuario, String senha) {
        
        for (Funcionario fun : vetor) {
            
            if (fun != null) {
                
                if(fun.getSenha().equals(senha) && fun.getFun().equals(usuario)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    private String InsUsuario(){
        
        System.out.print("|Inserir usuario: ");
        String usuario = input2.nextLine();
        
        return usuario;
    }
    
    private String InsSenha(){
        
        System.out.print("\n|Inserir senha: ");
        String senha = input2.nextLine();
        
        return senha;
    }
}
