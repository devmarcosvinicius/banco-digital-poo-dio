package com.marcosviniciusdev;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Marcos", "123456789-00", "10/07/1998");
        Cliente c2 = new Cliente("Fernanda", "123456789-01", "05/12/1986");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c2);

        cc.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println(cc.getCliente().getNome());
        System.out.println(poupanca.getCliente().getNome());

    }

}
