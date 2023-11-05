package geladoBuilder;

import products.Gelado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brazx
 */
public interface geladoBuilder {
    
    public void setSabor();
    public void setCobertura();
    public Gelado comprar();
    public void print();
    public Gelado run();
    public Gelado menu();
    
}
