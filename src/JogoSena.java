import java.util.ArrayList;
import java.util.Random;

public class JogoSena {

	public static void main(String[] args) {

		Random gerador = new Random();
		ArrayList<Integer> numerosSena = new ArrayList<Integer>(5);
		ArrayList<Integer> numerosJogo = new ArrayList<Integer>(5);
		int i = 0, aux = 0, counter = 0;
		boolean igual = false;

		while (i < 6) {
			aux = gerador.nextInt(60);
			igual = false;
			if (aux != 0) {
				for (int j = 0; j < numerosSena.size(); j++) {
					if (aux == numerosSena.get(j)) {
						igual = true;
					}
				}
				if (igual == false) {
					numerosSena.add(aux);
					i++;
				}
			}
		}

		System.out.println("Números sorteados da Mega-Sena: " + numerosSena);
		System.out.println("Seu jogo: " + jogo(gerador, numerosJogo, igual));

		for (int x = 0; x < 6; x++) {
			for (int y = 0; y < 6; y++) {
				if (numerosJogo.get(x) == numerosSena.get(y)) {
					counter++;
				}
			}
		}

		if (counter == 6) {
			System.out.println("Parabéns, você ganhou na Mega-Sena!");
		} else {
			if (counter == 1) {
				System.out.println("Você acertou " + counter + " número.");
			} else {
				System.out.println("Você acertou " + counter + " números.");
			}
		}
	}

	public static ArrayList<Integer> jogo(Random gerador, ArrayList<Integer> numerosJogo, boolean igual) {

		int i = 0, aux = 0;

		while (i < 6) {
			aux = gerador.nextInt(60);
			igual = false;
			if (aux != 0) {
				for (int j = 0; j < numerosJogo.size(); j++) {
					if (aux == numerosJogo.get(j)) {
						igual = true;
					}
				}
				if (igual == false) {
					numerosJogo.add(aux);
					i++;
				}
			}
		}
		return numerosJogo;
	}
}
