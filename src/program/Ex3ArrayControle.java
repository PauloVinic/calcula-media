/* Fazer uma classe Ex3Array com as seguintes caracter�sticas:
�  Atributos: array de inteiros e duas vari�veis para controlar o n�mero
atual e m�ximo de elementos inseridos no array
�  M�todos:
o Construtor que recebe o tamanho do array como par�metro e
inicializa o objeto (cria array, etc.)
o public boolean adicionar(int n) � adiciona elemento ao final do
array, retornando true se bem sucedido e false caso contr�rio
o public int calculaMedia() � retorna a m�dia aritm�tica dos
n�meros armazenados no array
Fazer a classe Ex3ArrayControle que:
�  Pergunta, via console, qual o tamanho N do array que o usu�rio quer
instanciar
�  Instancia um objeto da classe Ex1Array, passando N como argumento
�  Pergunta N n�meros ao usu�rio e armazena no objeto instanciado
�  Chama o m�todo para calcular a m�dia aritm�tica e mostra o resultado*/


package program;

import java.util.Scanner;

import entities.Ex3Array;

public class Ex3ArrayControle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o tamanho N do array desejado instanciar?");
		int tamanho = sc.nextInt();
		Ex3Array ex3 = new Ex3Array(tamanho);
		
		System.out.println("Digite os " + tamanho + " n�meros:");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(i+1 + "�: ");
			ex3.adicionar(sc.nextInt());
		}
	System.out.println("A m�dia dos n�meros �: " + ex3.calculaMedia());
	sc.close();
	}
	
}
