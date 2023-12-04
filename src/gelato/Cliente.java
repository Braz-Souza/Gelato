/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author GabCib
 */
public class Cliente {
    
    private String usuario;
    private String senha;
    
    public Cliente(String usuario,String senha){
        
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
