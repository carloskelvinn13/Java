package br.com.generation.Heranca;

public class Pessoa {
    // Atributos privados --> para encapsulamento
	private String nome;
	private int idade;
	private String endereco;
	
	//Métodos de acesso e recuperação.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



}
