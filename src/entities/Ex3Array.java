package entities;

public class Ex3Array {
	int[] numeros;
	int numeroAtual, numeroMaximo;
	
	public Ex3Array(int tamanho) {
		numeros = new int[tamanho];
		numeroAtual = 0;
		numeroMaximo = tamanho;
	}
	
	public boolean adicionar(int n) {
		if (numeroAtual < numeroMaximo) {
			numeros[numeroAtual] = n;
			numeroAtual++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int calculaMedia() {
		if (numeroAtual == 0) {
			return 0;
		}
		else {
			int soma = 0;
			for (int i = 0; i < numeroAtual; i++) {
				soma += numeros[i];
			}
			return soma / numeroAtual; 
		}
	}

}
