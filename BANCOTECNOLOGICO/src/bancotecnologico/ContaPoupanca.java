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
public class ContaPoupanca extends Conta {
    
    private float taxajuro;

    public ContaPoupanca(float taxajuro, int numero, String nomedoBanco, double saldoinicial, String data) {
        super(numero, nomedoBanco, saldoinicial, data);
        this.taxajuro = taxajuro;
    }

    public float getTaxajuro() {
        return taxajuro;
    }

    public void setTaxajuro(float taxajuro) {
        this.taxajuro = taxajuro;
    }

    @Override
    public void Transferencia(float valor, Conta c2) {

        taxajuro = (float) 0.7;

        this.levantar(valor);
        valor = (valor * taxajuro) + valor;
        c2.deposita(valor);
    }
    
    
}
