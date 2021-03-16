/*
Imagine uma lâmpada que possa ter três estados: apagada, acessa e meia-luz.
Desenvolva um programa que instancie 3 lâmpadas. A primeira deverá ficar apagada, a segunda deverá ficar acessa e a terceira deverá ficar meia-luz.
Dica: pode-se implementar o “estado” como um atributo String da classe. Na classe haverá três métodos: Acender(), Apagar() e AcenderMeiaLuz().
*/

class Main {
  public static void main(String[] args) {
    Lampada l1 = new Lampada("l1", "apagada");
		Lampada l2 = new Lampada("l2", "acesa");
		Lampada l3 = new Lampada("l3", "meia-luz");
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

	public void Acender(Lampada l) {
		estado = "acesa";
	}
	public void Apagar(Lampada l) {
		estado = "apagada";
	}
	public void AcenderMeiaLuz(Lampada l) {
		estado = "meia-luz";
	}
}