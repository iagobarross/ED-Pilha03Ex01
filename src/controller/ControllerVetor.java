/*1. Considere o vetor a seguir:
0 5 7 -4 3 5 -2 -1 10 4 3 -6 2 -9 1 -5
Fazer um algoritmo, em Java, u�lizando a biblioteca PilhaInt, inicializar uma pilha de inteiros e resolva conforme
as condições:
a. O vetor deve ser percorrido do primeiro ao úl�mo elemento
b. Caso seja um número posi�vo ou 0, fazer o push do valor
c. Caso seja um número nega�vo, fazer o pop de 2 valores, somá-los, fazer o push do número nega�vo
e o push do resultado da soma
d. Ao término do vetor, apresentar a quan�dade de valores presentes na pilha.
*/
package controller;

import br.edu.fateczl.pilhaInt.*;

public class ControllerVetor {

	public ControllerVetor() {
		super();
	}
	
	public void percorreVetor(int [] vetor) {
		int tamanho = vetor.length;
		Pilha p = new Pilha();
		
		
		for(int i = 0; i < tamanho; i++) {
			int soma = 0;
			if (vetor[i] >= 0) {
				p.push(vetor[i]);
			} else {
				if(p.size() >=2) {
					try {
						soma = p.pop() + p.pop();
						p.push(vetor[i]);
						p.push(-soma);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				} else {
					System.out.println("Não há elementos suficientes na pilha.");
				}
			}
		}
		
		System.out.println("Tamanho da pilha: " + p.size());
	}

}
