/*
Imagine uma lâmpada que possa ter três estados: apagada, acessa e meia-luz.
Desenvolva um programa que instancie 3 lâmpadas. A primeira deverá ficar apagada, a segunda deverá ficar acessa e a terceira deverá ficar meia-luz.
Dica: pode-se implementar o “estado” como um atributo String da classe. Na classe haverá três métodos: Acender(), Apagar() e AcenderMeiaLuz().
*/

import java.util.*;

class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao, opcDispositivo;
		boolean fecha = false;

    Lampada l1 = new Lampada("L1", "apagada");
		Lampada l2 = new Lampada("L2", "acesa");
		Lampada l3 = new Lampada("L3", "meia-luz");
		Lampada dispositivo = l1;

		List<Lampada> lampadas=new ArrayList<Lampada>();
		lampadas.add(l1);
		lampadas.add(l2);
		lampadas.add(l3);

		while (!fecha) {

			listaLampadas(lampadas);
			opcao = escolheOpcao();

			if (opcao != 4) {
				opcDispositivo = escolheDispositivo();
				if (opcDispositivo == 1) {
					dispositivo  = l1;
				} else if (opcDispositivo == 2) {
					dispositivo  = l2;
				} else if (opcDispositivo == 3) {
					dispositivo  = l3;
				}
			}

			switch (opcao) {
				case 1: //1 - acender
					System.out.println("*** Acendendo ***\n");
					Lampada.Acender(dispositivo);
					break;
				case 2: //2 - apagar
					System.out.println("*** Apagando ***\n");
					Lampada.Apagar(dispositivo);
					break;
				case 3: //3 - meia-luz
					System.out.println("*** Meia-luz ***\n");
					Lampada.AcenderMeiaLuz(dispositivo);
					break;
				case 4: //5 – Sair do programa
					System.out.println("*** OBRIGADO. VOLTE SEMPRE!!! ***");
					fecha = true;
					break;
			}
		}

  }

	public static void listaLampadas(List<Lampada> l) {
		System.out.println("\n\n*** LÂMPADAS -- ESTADO");
		for(Lampada x:l) {
			System.out.println((l.indexOf(x)+1) + " * " + x.nome + " -------- " + x.estado);
		}
	}

	public static int escolheOpcao() {
		Scanner sc = new Scanner(System.in);
		int o=0;
		try {
			System.out.print("\n\n*** Escolha uma ação ***\n    1 - Acender\n    2 - Apagar\n    3 - Meia-luz\n    4 - Sair do Programa\n>> ");
			o = sc.nextInt();
		} catch (InputMismatchException erro1) {
			System.out.println("Digite uma opção válida!");
			sc.nextLine();
		}
		return o;
	}

	public static int escolheDispositivo() {
		Scanner sc = new Scanner(System.in);
		int d=0;
		try {
			//listaLampadas();
			System.out.print("Digite o nº da lâmpada desejada >> ");
			d = sc.nextInt();
		} catch (InputMismatchException erro1) {
			System.out.println("Digite uma opção válida!");
			sc.nextLine();
		}
		return d;
	}
}

class Lampada {
	String nome, estado;

	public Lampada() {
		nome = "Nova Lâmpada";
		estado = "apagada";
	}
	public Lampada(String n, String e) {
		nome = n;
		estado = e;
	}

	public static void Acender(Lampada l) {
		l.estado = "acesa";
	}
	public static void Apagar(Lampada l) {
		l.estado = "apagada";
	}
	public static void AcenderMeiaLuz(Lampada l) {
		l.estado = "meia-luz";
	}
}