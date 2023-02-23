/* Fazer uma classe Ex3Array com as seguintes características:
·  Atributos: array de inteiros e duas variáveis para controlar o número
atual e máximo de elementos inseridos no array
·  Métodos:
o Construtor que recebe o tamanho do array como parâmetro e
inicializa o objeto (cria array, etc.)
o public boolean adicionar(int n) – adiciona elemento ao final do
array, retornando true se bem sucedido e false caso contrário
o public int calculaMedia() – retorna a média aritmética dos
números armazenados no array
Fazer a classe Ex3ArrayControle que:
·  Pergunta, via console, qual o tamanho N do array que o usuário quer
instanciar
·  Instancia um objeto da classe Ex1Array, passando N como argumento
·  Pergunta N números ao usuário e armazena no objeto instanciado
·  Chama o método para calcular a média aritmética e mostra o resultado*/


package program;

import java.util.Scanner;

import entities.Ex3Array;

public class Ex3ArrayControle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o tamanho N do array desejado instanciar?");
		int tamanho = sc.nextInt();
		Ex3Array ex3 = new Ex3Array(tamanho);
		
		System.out.println("Digite os " + tamanho + " números:");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(i+1 + "º: ");
			ex3.adicionar(sc.nextInt());
		}
	System.out.println("A média dos números é: " + ex3.calculaMedia());
	sc.close();
	}
	
}
