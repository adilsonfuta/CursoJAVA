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
public abstract class Conta {
    
    protected int numero;
    protected String nomedoBanco;
    protected double saldoinicial;
    protected String data;

    public Conta(int numero, String nomedoBanco, double saldoinicial, String data) {
        this.numero = numero;
        this.nomedoBanco = nomedoBanco;
        this.saldoinicial = saldoinicial;
        this.data = data;
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
    
    
    public void deposita(float valor) {
        this.saldoinicial += valor;
        // saldoinicial=saldoinicial+valor;
    }

    public void levantar(float valor) {
        if (valor < saldoinicial) {
            this.saldoinicial -= valor;
        }
    }

    public void Transferencia(float valor, Conta c2) {
        this.levantar(valor);
        c2.deposita(valor);
    }
   
    
    
}
