package edu.uptc.string_algorithms.logic;

import java.util.ArrayList;


public class StringAlgorithms {

	private final static String CHARACTERS = "Sogamoso ciudad del sol y del acero";

	/**
	 * Método que encripta una cadena de caracteres.
	 * @return La cadena de entrada encriptada.
	 */
	public static String encryptCharacters() {
		char array[] = CHARACTERS.toCharArray();

		for (int i = 0; i < array.length; i++) {

			array[i] = (char) (array[i] + (char) 93);

		}
		return String.valueOf(array);

	}

	/**
	 * Método que desencripta una cadena encriptada.
	 * @return La cadena de entrada desencriptada.
	 */
	public static String decryptCharacters() {

		char arrayDecrypt[] = encryptCharacters().toCharArray();

		for (int i = 0; i < arrayDecrypt.length; i++) {

			arrayDecrypt[i] = (char) (arrayDecrypt[i] - (char) 93);
		}
		return String.valueOf(arrayDecrypt);
	}

	/**
	 * Método que concatena una cadena determinada, un número de veces por izquierda o derecha.
	 * @param character El caracter que se va a imprimir.
	 * @param number El número de veces que se va imprimir e.
	 * @param side   El lado en el que se va a imprimir la letra (izquierdo-derecho).
	 * @return Una cadena concatenada con el carácter n veces por izquierda o por derecha
	 */
	public static String fillCharacters(char character, int number, boolean side) {
		String c = "";
		String StringWithCharacters = "";

		for (int i = 0; i < number; i++) {
			c += character;
		}

		if (side == true) {

			StringWithCharacters = c + CHARACTERS;

		} else {

			StringWithCharacters = CHARACTERS + c;

		}

		return StringWithCharacters;
	}

	/**
	 * Método que evalua una cadena de entrada y resta los caracteres que comparta con la cadena original.
	 * @param stCharacter La cadena de caracteres de entrada.
	 * @return La diferencia de caracteres de la cadena original con la de entrada.
	 */
	public static String characterSubtraction(String stCharacter) {
		ArrayList<Character> character = new ArrayList<>();
		String StringWithCharacters = "";
		for (int i = 0; i < CHARACTERS.length(); i++) {
			character.add(i, CHARACTERS.charAt(i));
		}
		for (int i = 0; i < stCharacter.length(); i++) {
			for (int j = 0; j < character.size(); j++) {

				if (String.valueOf(stCharacter.charAt(i)).equalsIgnoreCase(String.valueOf(character.get(j)))) {

					character.remove(j);

				}
			}
		}
		for (int a = 0; a < character.size(); a++) {
			StringWithCharacters += character.get(a);
			StringWithCharacters.toUpperCase();
		}

		return StringWithCharacters;
	}

}
