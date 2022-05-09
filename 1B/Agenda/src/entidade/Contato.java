package entidade;

import repositorio.PilhaEstatica;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;
  

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    @Override
    public String toString() {
        return " Contato (Id=" + id + ", Nome=" + nome + ", Telefone=" + telefone + ", E-mail=" + email + ")";
    }

    

    

    
    
}
