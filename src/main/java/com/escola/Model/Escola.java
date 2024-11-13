package com.escola.Model;

import java.util.ArrayList;

public class Escola {
    String nomeEscola;
    int codigoEscola;
    ArrayList<Aluno> alunos;

public Escola(String nomeEscola, int codigoEscola, Aluno[] alunos) {
        this.nomeEscola = nomeEscola;
        this.codigoEscola = codigoEscola;
        this.alunos = new ArrayList<Aluno>();
    }

public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public int getCodigoEscola() {
        return codigoEscola;
    }

    public void setCodigoEscola(int codigoEscola) {
        this.codigoEscola = codigoEscola;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

public boolean adicionarAluno(Aluno a){
    for(Aluno alunoExistente : alunos){
        if(a.getCpf().equals(alunoExistente.getCpf())){
            return false;
        }
    }
    alunos.add(a);
    return true;
}  

public Aluno buscarAlunoNome(String nome){
    for(Aluno alunoExistente : alunos){
        if(alunoExistente.getNome().equals(nome)){
            return alunoExistente;
        }
    }
    return null;
}
public Aluno buscarAlunoCpf(String cpf){
    for(Aluno alunoExistente : alunos){
        if(alunoExistente.getCpf().equals(cpf)){
            return alunoExistente;
        }
    }
    return null;
}
public boolean removerAluno(String cpf) throws ErroRemoverAluno{
    for(Aluno alunoExistente : alunos){
        if(alunoExistente.getCpf().equals(cpf)){
        boolean removido = alunos.remove(alunoExistente);
            if (!removido) {
                throw new ErroRemoverAluno("Falha ao remover o aluno com CPF: " + cpf);
            }
        return true;
        }
    }
return false;
}
public String listar(){
    return alunos.toString();
}
}
