package LojaEletronicos;

public class Eletronico {
	private String nome;
	private String marca;
	private String modelo;
	
	public Eletronico(String nome, String marca, String modelo) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;	
	}
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Marca: "     + this.marca     + "\n";
		retorno += "Modelo: "     + this.modelo     + "\n";
		
	}

}
