package com.azgiampaoli;

public interface IConta {

    void depositar(double valor);

    void sacar(double valor);

    void tranferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
