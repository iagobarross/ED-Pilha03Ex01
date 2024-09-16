package view;

import controller.ControllerVetor;

public class Main {

	public static void main(String[] args) {
		int [] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		ControllerVetor contVet = new ControllerVetor();
		
		contVet.percorreVetor(vetor);
		
		
	}

}
