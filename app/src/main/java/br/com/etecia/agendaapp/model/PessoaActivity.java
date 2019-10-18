package br.com.etecia.agendaapp.model;

import java.util.Calendar;

public class PessoaActivity {

    private long id;
    private String nome;
    private Calendar dataNascimento;
    private ContatoActivity contato;
    private EnderecoActivity endereco;

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ContatoActivity getContato() {
        return contato;
    }

    public void setContato(ContatoActivity contato) {
        this.contato = contato;
    }

    public PessoaActivity(long id, String nome, Calendar dataNascimento, ContatoActivity contato, EnderecoActivity endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.endereco = endereco;
    }
}
