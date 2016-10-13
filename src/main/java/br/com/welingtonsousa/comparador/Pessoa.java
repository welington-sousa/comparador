package br.com.welingtonsousa.comparador;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;
    private String cargo;

    public Pessoa(String nome, String sobreNome, int idade, String cargo) {
	this.nome = nome;
	this.sobreNome = sobreNome;
	this.idade = idade;
	this.cargo = cargo;
    }

    public String getNome() {
	return nome;
    }

    public String getSobreNome() {
	return sobreNome;
    }

    public int getIdade() {
	return idade;
    }

    public String getCargo() {
	return cargo;
    }

}
