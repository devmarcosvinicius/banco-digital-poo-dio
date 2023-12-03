package com.marcosviniciusdev;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Cliente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

}
