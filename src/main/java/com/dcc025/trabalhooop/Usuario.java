package com.dcc025.trabalhooop;

public class Usuario {
    protected String nome;
    protected String telefone;
    protected String email;

    public Usuario(String nome, String telefone, String email)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getName() {
        return nome;
    }

    public String getPhone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
