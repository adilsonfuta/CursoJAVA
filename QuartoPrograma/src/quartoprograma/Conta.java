/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartoprograma;

/**
 *
 * @author adilson
 */
public class Conta {
    private int numero;
    private String nomedoBanco;
    private double saldoinicial;
    private String data;
    private String nomedocliente;

    public Conta(int numero, String nomedoBanco, double saldoinicial, String data, String nomedocliente) {
        this.numero = numero;
        this.nomedoBanco = nomedoBanco;
        
        if(saldoinicial>0){
         this.saldoinicial = saldoinicial;
        }        
        this.data = data;
        this.nomedocliente = nomedocliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomedoBanco() {
        return nomedoBanco;
    }

    public void setNomedoBanco(String nomedoBanco) {
        this.nomedoBanco = nomedoBanco;
    }

    public double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomedocliente() {
        return nomedocliente;
    }

    public void setNomedocliente(String nomedocliente) {
        this.nomedocliente = nomedocliente;
    }
    
    public void deposita (float valor){
    this.saldoinicial += valor;
    }
    public void levantar (float valor){
        if(valor<saldoinicial)
    this.saldoinicial -= valor;
    }
    
    public void TransferenciaOnline(float valor,Conta c2){
        double saldoAtual;
        saldoAtual=saldoinicial-valor;
        saldoinicial=saldoAtual;
        c2.deposita(valor);        
    }
    
      public void TransferenciaXyquilaMoney(float valor,Conta c2){
          this.levantar(valor);
          c2.deposita(valor);
    }
    
    public double Consulta(){
        return saldoinicial;
    }
    
    
    
}
