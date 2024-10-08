package br.com.casadocodigo.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // metodo para mostrar detalhes do autor( atributos,  no caso)
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do br.com.casadocodigo.livraria.Autor");
        System.out.println("Nome do br.com.casadocodigo.livraria.Autor: " + nome);
        System.out.println("Email: " + email);
       System.out.println("CPF: " + cpf);
    }
}
