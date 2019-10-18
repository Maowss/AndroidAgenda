package br.com.etecia.agendaapp.model;

public class ContatoActivity {

    private long id;
    private String email;
    private String telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContatoActivity(long id, String email, String telefone) {
        this.id = id;
        this.email = email;
        this.telefone = telefone;
    }
}
