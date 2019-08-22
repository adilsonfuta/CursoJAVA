/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotecnologico;


public class Cliente {
    
  private String nome;
  private int idade;
  private Sexo genero;
  private int Telefone;
  
  private Conta novoConta;

    public Cliente(String nome, int idade, Sexo genero, int Telefone) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.Telefone = Telefone;
    }

    public Cliente(String nome, int idade, Sexo genero, int Telefone, Conta novoConta) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.Telefone = Telefone;
        this.novoConta = novoConta;
    }

    public Conta getNovoConta() {
        return novoConta;
    }

    public void setNovoConta(Conta novoConta) {
        this.novoConta = novoConta;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getGenero() {
        return genero;
    }

    public void setGenero(Sexo genero) {
        this.genero = genero;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
  
  
  

  
    
    
}
