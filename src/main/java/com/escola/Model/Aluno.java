package com.escola.Model;

public class Aluno {
    String nome;
    String cpf;
    String email;
    int anoNascimento;

    
    public Aluno(String nome, String cpf, String email, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

@Override
public String toString(){
    return "Aluno: " + nome + "," + cpf + "," + email + "," + anoNascimento;
}
    
}
