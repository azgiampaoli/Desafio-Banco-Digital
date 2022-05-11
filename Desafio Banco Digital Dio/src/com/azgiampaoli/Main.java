package com.azgiampaoli;

public class Main {

    public static void main(String[] args) {

        Cliente Angela = new Cliente();
        Angela.setNome("Angela");
        Cliente Joao = new Cliente();
        Joao.setNome("João");

        Conta cc = new ContaCorrente(Angela);
        Conta poupanca = new ContaPoupanca(Angela);
        Conta cc1 = new ContaCorrente(Joao);



        cc.tranferir(100.00, poupanca);
        cc.sacar(50.00);

        cc.imprimirExtrato();


        cc.depositar(200.00);
        cc.imprimirExtrato();
        cc.tranferir(100.00, cc1);


        cc.imprimirExtrato();
        cc1.imprimirExtrato();

        cc1.depositar(300.00);
        cc1.imprimirExtrato();
        cc1.tranferir(150.00, poupanca);
        cc1.imprimirExtrato();
        cc1.sacar(50.00);
        cc1.imprimirExtrato();
        poupanca.imprimirExtrato();






    }
}
