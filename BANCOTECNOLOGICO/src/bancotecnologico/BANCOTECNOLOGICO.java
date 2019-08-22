/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotecnologico;

/**
 *
 * @author adilson
 */
public class BANCOTECNOLOGICO {

    
    
    
    public static void main(String[] args) {
      
        Conta conta1=new ContaCorrente(001, "BFA", 1000, "12/07/2000");
        Cliente c1=new Cliente("Mingo", 18, Sexo.Femenino, 923456789, conta1);
    }
    
}
