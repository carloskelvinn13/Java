package br.com.generation.Heranca;

import java.util.Scanner;

public class TestaTodomundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionario: ");
		String nome = entrada.next();
		System.out.println("Digite a idade do Funcionario: ");
		int idade = entrada.nextInt();
		System.out.println("Digite o salario do Funcionario: ");
		double salario = entrada.nextInt();
		
		Professor pf1 = new Professor();
		
	pf1.setNome("Cortella");	
	pf1.setIdade(50);
	pf1.setEndereco("Rua 2 de julho - 30");
	pf1.setDisciplina("Históri");
    pf1.setSalario(1000.0);
    
    double salarioModificado = salario * 1.10;
    pf1.setSalario(salarioModificado);
    
    
    System.out.println("Nome: " + pf1.getNome());
    System.out.println("Idade: " + pf1.getIdade());
    System.out.println("Endereço: " + pf1.getEndereco());
    System.out.println("Disciplina: " + pf1.getDisciplina());
    System.out.println("Salario: " + pf1.getSalario());
	
	
	}

}
