/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author GabCib
 */
public class Funcionario {
    
    private String fun;
    private String senha;
    
    public Funcionario(String fun,String senha){
        
        this.fun = fun;
        this.senha = senha;
    }
    
    public String getFun(){
        return fun;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setFun(String fun){
        this.fun = fun;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
