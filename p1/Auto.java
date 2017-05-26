
public class Auto {
	private String nombre;
	private String color;
	private int potencia;

	public void acelerar() {
		System.out.println("Acelerando...");
	}

	public void frenar() {
		System.out.println("Frenando...");
	}

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		System.out.println("Hello everyone...");
	}
}
