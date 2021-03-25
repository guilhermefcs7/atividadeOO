package application;

import java.util.Scanner;

import domain.Enfermeira;
import domain.Medico;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		obterMenu();
	}

	private static void obterMenu() {
		System.out.println("Qual tipo de funcionario deseja cadastrar ? : ");
		System.out.print("\n(1)Médico");
		System.out.print("\n(2)Enfermeira");
		System.out.println("\nDigite aqui sua resposta ? :");
		int res = in.nextInt();

		switch (res) {
		case 1:
			instanciarMedico();
			break;
		case 2:
			instanciarEnfermeira();
			break;
		default:
			System.out.println("Valor inválido!");
			break;
		}
	}

	public static void instanciarMedico() {
		System.out.println("Digite a matricula :");
		String matricula = in.next();
		System.out.println("Digite o nome :");
		String nome = in.nextLine();
		in.nextLine();
		System.out.println("Digite o ano de admissão :");
		int ano = in.nextInt();
		System.out.println("Digite o salário :");
		double salario = in.nextDouble();
		System.out.println("Digite o numero de inscrição no CRM :");
		int numeroInscricaoCRM = in.nextInt();
		System.out.println("Digite o nome das especialidades :");
		in.nextLine();
		String nomeEspecialidades = in.nextLine();
		
		Medico medico = new Medico(matricula, nome, ano, salario, numeroInscricaoCRM, nomeEspecialidades);
		System.out.println(medico);
	}

	public static void instanciarEnfermeira() {
		System.out.println("Digite a matricula :");
		String matricula = in.next();
		System.out.println("Digite o nome :");
		in.nextLine();
		String nome = in.nextLine();
		System.out.println("Digite o ano de admissão :");
		int ano = in.nextInt();
		System.out.println("Digite o salário :");
		double salario = in.nextDouble();
		System.out.println("Digite o número de inscrição no COREM :");
		int numeroInscricaoCOREM = in.nextInt();
		System.out.println("Digite o tipo de atuação :");
		String tipoAtuacao = in.next();
		System.out.println("Digite a carga horaria :");
		int cargaHoraria = in.nextInt();
		
		Enfermeira enfermeira = new Enfermeira(matricula, nome, ano, salario, numeroInscricaoCOREM, tipoAtuacao, cargaHoraria);
		System.out.println(enfermeira);
	}
	
	
}
