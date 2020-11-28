
public class Logic {
	
	private String chain = "sogamoso ciudad del sol y del acero"; 
	
    /**
     * Metodo el cual es el encargado de determinar si existe una palabra o no en la cadena de caracteres
     * " sogamoso ciudad del sol y del acero" 
     * @param  recibe como parametro una palabra dijitada por el usuario
     * @return  Nos retonara la palabra digitada y el numero de veces que esta  repetida.
     */
	public int searchWord(String word) {

		int counter = 0;
		String[] words = chain.split(" ");// en esta parte se separa la chain de characters en words
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(word)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean repeatedData(String caracter,String string) {
		int indicator = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.substring(i, i+1).equalsIgnoreCase(caracter)) {
				indicator++;
			}
		}
		if(indicator>0)return false;
		else return true;
	}
	
	/**
	 * Metodo en el cual se emplea la interseccion de una palabra, la cual dejara una palabra sin caracteres iguales
	 * @param text
	 * @return 
	 */
	public String intersection(String text) {
		String intersectionText = "";
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < chain.length(); j++) {
				if (text.substring(i, i + 1).equalsIgnoreCase(chain.substring(j, j + 1))) {
					if (repeatedData(text.substring(i, i + 1), intersectionText)) {
						intersectionText += chain.substring(j, j + 1);
					}
				}
			}
		}
		return intersectionText;
	}
	
	/**
	 * Metodos empleados para borrar caracteres de izquieda o derecha
	 * @param chainCharacters
	 * @return
	 */
	
	private String complete(String[] chainCharacters) {
		String resultado = new String();
		for (int i = 0; i < chainCharacters.length; i++) {
			resultado += chainCharacters[i];
		}
		return resultado;
	}
	
	/**
	 * Metodo empleado para borrar caracteres de izquierda a derecha, hasta que encuentre un caracter que no existe en la cadena de entrada
	 *  segun la palabra digitada por el usuario,
	 * @param recibe como parametro una palabra digitada por el usuario
	 * @return nos retornara la cadena con los caracteres repetidos ya borrados si es que lo hubieron.
	 */
	public String left(String word) {

			String[] chaincharacters = chain.split("");
			String[] characters = word.split("");
			for (int i = 0; i < chaincharacters.length; i++) {
				boolean repeat = false;
				for (int j = 0; j < characters.length; j++) {
					if (chaincharacters[i].equalsIgnoreCase(characters[j])) {
						chaincharacters[i] = "";
						repeat = true;
						break;
					}
				}
				if (repeat == false) {
					break;
				}
			}
			return complete(chaincharacters);
	}
	/**
	 * Metodo empleado para borrar caracteres de derecha a izquierda, hasta que encuentre un caracter que no existe en la cadena de entrada 
	 * segun la palabra digitada por el usuario.
	 * @param recibe como parametro una palabra digitada por el usuario
	 * @return nos retornara la cadena con los caracteres repetidos ya borrados si es que lo hubieron.
	 */

	public String right(String word) {

		String[] chainCharacters = chain.split("");
		String[] characters = word.split("");
		for (int i = chainCharacters.length - 1; i >= 0; i--) {
			boolean repeat = false;
			for (int j = characters.length - 1; j >= 0; j--) {
				if (chainCharacters[i].equalsIgnoreCase(characters[j])) {
					chainCharacters[i] = "";
					repeat = true;
					break;
				}
			}
			if (repeat == false) {
				break;
			}
		}
		return complete(chainCharacters);
     }

}
