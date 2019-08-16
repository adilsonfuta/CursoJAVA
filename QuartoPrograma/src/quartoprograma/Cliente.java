/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartoprograma;


public class Cliente {
    
    private String nome;
    private String genero;
    private String morada;
    private int telefone;

   
   public Cliente(String nome, String genero, String morada, int telefone) {
        this.nome = nome;
        this.genero = genero;
        this.morada = morada;
        this.telefone = telefone;
    }
   
      public Cliente(String nome, String genero, String morada) {
        this.nome = nome;
        this.genero = genero;
        this.morada = morada;
        
    }

    public Cliente() {
        
    }
   
    public void sms(){
        
        System.out.println(" testado o cliente "+this.nome);
   
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getMorada() {
        return morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String a) {
        this.nome = a;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
