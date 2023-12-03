package com.marcosviniciusdev;

import lombok.Data;

@Data
public abstract class Conta implements iConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor de saque deve ser maior que zero.");
            return;
        }

        if (valor > this.getSaldo()) {
            System.out.println("O valor de saque é maior que o seu saldo.");
            return;
        }

        this.saldo += valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de deposito deve ser maior que zero.");
            return;
        }

        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (contaDestino == null) {
            System.out.println("Conta invalida.");
            return;
        }

        if (valor <= 0) {
            System.out.println("O valor de transferencia é invalido.");
            return;
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("Transferencia de R$" + valor + " feita com sucesso.");

    }

    public void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

}
