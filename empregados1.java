package empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Empregado {
	protected String nome;
	protected int idade;
	protected String email;
	protected String telefone;
	protected String saude;
	
	public Empregado(String nome, int idade, String email, String telefone, String saude) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.saude = saude;
		
	}
	public abstract void imprimirInfo();
}

class Celetista extends Empregado {
	private String nomeEmpresa;
	
	public Celetista(String nome, int idade, String email, String telefone, String saude, String nomeEmpresa) {
		super(nome, idade, email, telefone, saude);
		this.nomeEmpresa = nomeEmpresa;
	}
	public void imprimirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Algum(uns) problema(s) de saúde? Se sim, quais:" + saude);
		System.out.println("Empresa Contratante: " + nomeEmpresa);
	}
}
class Terceirizado extends Empregado {
	private String localizacaoAtual;
	
	public Terceirizado(String nome, int idade, String email, String telefone, String saude, String localizacaoAtual) {
		super(nome, idade, email, telefone, saude);
		this.localizacaoAtual = localizacaoAtual;
	}
	public void imprimirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Algum(uns) problema(s) de saúde? Se sim, quais:" + saude);
		System.out.println("Localização Atual: " + localizacaoAtual);
	}
}
public class empregados1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Empregado> empregados = new ArrayList<>();
		
		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adicionar Celetista");
			System.out.println("2 - Adicionar Terceirizado");
			System.out.println("3 - Listar Empregados");
			System.out.println("0 - Sair");
			
			int escolha = scanner.nextInt();
			scanner.nextLine();
			
			switch (escolha) {
			   case 1:
				   System.out.println("Nome do Celetista:");
				   String nomeCeletista = scanner.nextLine();
				   System.out.println("Idade do Celetista:");
				   int idadeCeletista = scanner.nextInt();
				   scanner.nextLine();
				   System.out.println("E-mail do Celetista:");
				   String emailCeletista = scanner.nextLine();
				   System.out.println("Telefone do Celetista:");
				   String telefoneCeletista = scanner.nextLine();
				   System.out.println("Problemas de saúde do Celetista:");
				   String saudeCeletista = scanner.nextLine();
				   System.out.println("Empresa Contratante:");
				   String nomeEmpresa = scanner.nextLine();
				   
				   Celetista celetista = new Celetista(nomeCeletista, idadeCeletista, emailCeletista, telefoneCeletista, saudeCeletista, nomeEmpresa);
				   empregados.add(celetista);
				   System.out.println("Celetista adicionado!");
				   break;
				   
				   
			   case 2:
				   System.out.println("Nome do Terceirizado:");
				   String nomeTerceirizado = scanner.nextLine();
				   System.out.println("Idade do Terceirizado:");
				   int idadeTerceirizado = scanner.nextInt();
				   scanner.nextLine();
				   System.out.println("E-mail do Terceirizado:");
				   String emailTerceirizado = scanner.nextLine();
				   System.out.println("Telefone do Terceirizado:");
				   String telefoneTerceirizado = scanner.nextLine();
				   System.out.println("Problemas de saúde do Terceirizado:");
				   String saudeTerceirizado = scanner.nextLine();
				   System.out.println("Localização Atual:");
				   String localizacaoAtual = scanner.nextLine();
				   
				   Terceirizado terceirizado = new Terceirizado(nomeTerceirizado, idadeTerceirizado, emailTerceirizado, telefoneTerceirizado, saudeTerceirizado, localizacaoAtual);
				   empregados.add(terceirizado);
				   System.out.println("Terceirizado adicionado!");
				   break;
				   
				   
			   case 3:
				   System.out.println("Lista de Empregados:");
				   for (Empregado e : empregados) {
					   e.imprimirInfo();
					   System.out.println("--------------------");
				   }
				   break;
				   
				   
			   case 0:
				   System.out.println("Encerrar Programa");
				   scanner.close();
				   return;
				   
				   
			   default:
				   System.out.println("Esse Opção não Existe. Tente Novamente com um Opção Válida.");
				   break;
				   
				
			}
		}

	}
}
