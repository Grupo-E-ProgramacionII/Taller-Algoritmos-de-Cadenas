package edu.uptc.string_algorithms.view;

import edu.uptc.string_algorithms.logic.StringAlgorithms;

public class Runner {

	public static void main(String[] args) {
		
			
		System.out.println("Encriptar: \n"+StringAlgorithms.encryptCharacters("Sogamoso ciudad del sol y del acero"));
		System.out.println("Desencriptar: \n"+StringAlgorithms.decryptCharacters("°ÌÄ¾ÊÌÐÌ}ÀÆÒÁ¾Á}ÁÂÉ}ÐÌÉ}Ö}ÁÂÉ}¾ÀÂÏÌ"));
		System.out.println("Llenar caracteres: \n"+StringAlgorithms.fillCharacters('A', 4, true));
		System.out.println("Diferencia:");
		System.out.println(StringAlgorithms.characterSubtraction("Colombia"));

	}

}
