package edu.uptc.string_algorithms.view;

import edu.uptc.string_algorithms.logic.StringAlgorithms;

public class Runner {

	public static void main(String[] args) {
		
			
		System.out.println("Encriptar: \n"+StringAlgorithms.encryptCharacters());
		System.out.println("Desencriptar: \n"+StringAlgorithms.decryptCharacters());
		System.out.println("Llenar caracteres: \n"+StringAlgorithms.fillCharacters('A', 4, true));
		System.out.println("Diferencia:");
		System.out.println(StringAlgorithms.characterSubtraction("Colombia"));

	}

}
