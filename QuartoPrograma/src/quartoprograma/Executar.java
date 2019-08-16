/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartoprograma;

import java.util.Scanner;

/**
 *
 * @author adilson
 */
public class Executar {
    
    public static void main(String[] args) {
        
    Conta c1=new Conta(1, "xyquilamoney", 100, "16/08/19", "beto");
    c1.levantar(10);    
    System.out.println(" resto "+c1.getSaldoinicial());
    c1.deposita(150);
    System.out.println(" resto "+c1.getSaldoinicial());
    
    
    Conta c2=new Conta(2, "BFA", 0, "17/08/2019", "SACASSOLA");
    
    c1.TransferenciaXyquilaMoney(200, c2);
    
        System.out.println(" saldo da conta 2 "+c2.getSaldoinicial() );
         System.out.println(" resto da conta 1 : "+c1.getSaldoinicial());
    
    
    
         
        
        
        
    }
    
    
 public void usandoCliente() {
        Cliente cl = new Cliente();
        cl.sms();

        String nome;
        String sexo;
        String ondevives;
        int fone;

        Scanner cuca = new Scanner(System.in);

        System.out.println(" Diga o nome ");
        nome = cuca.nextLine();

        Cliente cl1 = new Cliente(nome, "MASCULINO", "ZANGO 3", 939043384);
        Cliente cl2 = new Cliente(" BRUNO ", "MASCULINO", "ZANGO 3");

//   cl1.sms();
        System.out.println("  " + cl1.getTelefone());
        System.out.println("  " + cl2.getTelefone());
//

    }
    
}
