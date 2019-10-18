package br.com.etecia.agendaapp.model;

public class EnderecoActivity {

    private long id;
    private String logradouro;
    private String cep;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) { this.cep = cep; }

    public EnderecoActivity(long id, String logradouro, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
    }
}
