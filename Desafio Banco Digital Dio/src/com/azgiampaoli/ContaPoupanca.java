package com.azgiampaoli;


public class ContaPoupanca extends Conta{


    Cliente cliente;


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Poupança");
        System.out.println("------------------------");
        super.imprimirInfos();
    }
}
