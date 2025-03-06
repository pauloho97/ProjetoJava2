package Composicao;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco endereco = new Endereco("Rua abc", 100);
		Scanner scan = new Scanner(System.in);
		
		Pessoa joao = new Pessoa("Joao da silva", endereco);
		
		System.out.println(joao);
		System.out.println(joao.getEndereco().getRua());
		
		Pessoa maria = new Pessoa();
		System.out.println(maria);
		maria.setNome("maria da silva");
		System.out.println("maria");
		
		Endereco e = new Endereco();
		maria.setEndereco(e);
		System.out.println(maria);
		
		maria.getEndereco().setRua("Rua abc");
		maria.getEndereco().setNumero(5);
		System.out.println(maria);
		
		System.out.println("Digite seu nome: " );
		String name = scan.nextLine();
		
		System.out.println("Digite o nome da sua rua: " );
		String end = scan.nextLine();
		
		System.out.println("Digite o numero do seu endereco: " );
		int num = scan.nextInt();
		
		
		Endereco ende = new Endereco(end,num);
		Pessoa p = new Pessoa(name,ende);
		
		System.out.println(p);
		
		
		
		
	}

}
