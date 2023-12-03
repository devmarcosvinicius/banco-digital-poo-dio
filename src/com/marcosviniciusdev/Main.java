package com.marcosviniciusdev;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Marcos");
        Cliente c2 = new Cliente("Fernanda");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c2);

        cc.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
