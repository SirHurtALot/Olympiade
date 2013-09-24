public class main {

	/**
	 * Dieses programm gibt ganz viele Quadratzahlen aus!
	 * @param args
	 */
	public static void main(String[] args) {

		// Das ist eine Schleife
		for(int i = 1; i < 10; i++){
			System.out.println(quadratZahl(i));
		}

	}

	private static int quadratZahl(int i) {
		return i*i;
	}

}
