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
public class Banco implements Interface{
   
   private Cliente pessoaBanco[];

    public Banco(int tamanho) {
        
        this.pessoaBanco=new Cliente[tamanho];
    }

    public Cliente[] getPessoaBanco() {
        return pessoaBanco;
    }

    public void setPessoaBanco(Cliente[] pessoaBanco) {
        this.pessoaBanco = pessoaBanco;
    }

    @Override
    public void sms() {
       int t=pessoaBanco.length;
       
        for (int i = 0; i < t; i++) {
            System.out.println(pessoaBanco[i].getNome() +" "
            +pessoaBanco[i].getNovoConta().getSaldoinicial());
        }

    }

    @Override
    public void SMS_Especial(int n) {
     int t=pessoaBanco.length;
     int pg=0;
      for (int i = 0; i < t; i++) {
          pg=pessoaBanco[i].getNovoConta().getNumero();
                        
          if(pg==n)
            System.out.println(pessoaBanco[i].getNome() +" "
            +pessoaBanco[i].getNovoConta().getSaldoinicial());
        }

    }
   
    
   
   
   
    
    
    
    
    
}
