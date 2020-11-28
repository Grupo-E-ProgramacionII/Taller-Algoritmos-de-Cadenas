package edu.uptc.string_algorithms.logic;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;


public class StringAlgorithmsVF {
    /**
        *CONSTANTES:
        * se toma la cadena sogamoso ciudad del sol y del acero
     */
    public static  final String SENTENCE = "Sogamoso ciudad del sol y del acero";
    /*
    metodo constructor de la clase:
    */
    public StringAlgorithmsVF(){

    }
    
    //1.
    /**
    Metodo para convertir a nombre propio
    @return devuelve la cadena convertida a nombre propio
     */
    public String turnIntoNameSelf(){
        char [] characters = SENTENCE.toCharArray();
        characters[0] = Character.toUpperCase(characters[0]);
        for (int i = 0; i < SENTENCE.length()-2; i++) {
            if (characters[i] == ' ' ){

                characters[i + 1] = Character.toUpperCase(characters[i + 1]);


            }
            else {
                for (int j = 2; j < SENTENCE.length(); j++) {
                    if (characters[j - 1] == ' ' && characters[j + 1] == ' ') {
                        characters[j] = Character.toLowerCase(characters[j]);

                    }
                }
            }
        }
        return  new String(characters);

    }
    
    //2.
    /**
     * Metodo el cual es el encargado de determinar si existe una palabra o no en la cadena de caracteres
     * " sogamoso ciudad del sol y del acero" 
     * @param word recibe como parametro una palabra dijitada por el usuario
     * @return  Nos retonara la palabra digitada y el numero de veces que esta  repetida.
     */
	public int searchWord(String word) {

		int counter = 0;
		String[] words = SENTENCE.split(" ");// en esta parte se separa la chain de characters en words
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
    
    //3.
    /**
	 * Metodo que encripta una cadena de caracteres.
	 * @param str La cadena que será encriptada.
	 * @return La cadena de entrada encriptada.
	 */
	public static String encryptCharacters(String str) {
		char array[] = str.toCharArray();

		for (int i = 0; i < array.length; i++) {

			array[i] = (char) (array[i] + (char) 93);

		}
		String result = String.valueOf(array);
		return result;

	}
	
	//4.
	/**
	 * Metodo que desencripta una cadena encriptada.
	 * @param strEncrypt  La cadena que se quiere desencriptar.
	 * @return La cadena de entrada desencriptada.
	 */
	public static String decryptCharacters(String strEncrypt) {

		char arrayDecrypt[] = strEncrypt.toCharArray();

		for (int i = 0; i < arrayDecrypt.length; i++) {

			arrayDecrypt[i] = (char) (arrayDecrypt[i] - (char) 93);
		}
		String resultDecrypt = String.valueOf(arrayDecrypt); 
		return resultDecrypt;
	}
	
	//5.
	/**
	 * Metodo que concatena una cadena determinada, un numero de veces por izquierda o derecha.
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

			StringWithCharacters = c + SENTENCE;

		} else {

			StringWithCharacters = SENTENCE + c;

		}

		return StringWithCharacters;
	}
    
    
    //6.
    /**
    *metodo para eliminar un caracter ingresado ignorando mayúsculas  y minúsculas
    *@param caracterToDelete caracter para eliminar
    *@return devuelve la cadena con el caracter eliminado

     */
    public String deleteCharacters ( String caracterToDelete) {


        if (caracterToDelete.length() >=1 ) {
            String mayus = caracterToDelete.toUpperCase();
            String minus = caracterToDelete.toLowerCase();
            String textAllMinus = SENTENCE.replaceAll(mayus, minus);
            String textFinal = "";
            
            textFinal = textAllMinus.replaceAll(minus, "");
            

            return  textFinal;
        }else {
            return  "caracter invalido";
        }


    }
    //7.
    /**
	 * Metodo en el cual se emplea la interseccion de una palabra, la cual dejara una palabra sin caracteres iguales
	 * @param text la palabra a la que se le empleara la interseccion
	 * @return la interseccion
	 */
	public String intersection(String text) {
		String intersectionText = "";
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < SENTENCE.length(); j++) {
				if (text.substring(i, i + 1).equalsIgnoreCase(SENTENCE.substring(j, j + 1))) {
					if (repeatedData(text.substring(i, i + 1), intersectionText)) {
						intersectionText += SENTENCE.substring(j, j + 1);
					}
				}
			}
		}
		return intersectionText;
	}
    
    //8.
    /**
	 * Metodo que evalua una cadena de entrada y resta los caracteres que comparta con la cadena original.
	 * @param stCharacter La cadena de caracteres de entrada.
	 * @return La diferencia de caracteres de la cadena original con la de entrada.
	 */
	public static String characterSubtraction(String stCharacter) {
		ArrayList<Character> character = new ArrayList<>();
		String StringWithCharacters = "";
		for (int i = 0; i < SENTENCE.length(); i++) {
			character.add(i, SENTENCE.charAt(i));
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
	
	//9. (Se usaron 3 metodos diferentes en este punto del taller)
	
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
	 * @param word recibe como parametro una palabra digitada por el usuario
	 * @return nos retornara la cadena con los caracteres repetidos ya borrados si es que lo hubieron.
	 */
	public String left(String word) {

			String[] chaincharacters = SENTENCE.split("");
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
	 * @param word recibe como parametro una palabra digitada por el usuario
	 * @return nos retornara la cadena con los caracteres repetidos ya borrados si es que lo hubieron.
	 */

	public String right(String word) {

		String[] chainCharacters = SENTENCE.split("");
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
    
    //10.
    /**
    *metodo que convierte un string a un objeto Date, teniendo en cuenta el separador (/o-) y con formato día /mes/año
    * @param input recibe la cadena con formato fecha
    * @return devuelve un objeto Date
     */
    public Date turnToDate(String input){
        if (input.charAt(2)== '/') {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            try {
                Date date = simpleDateFormat.parse(input);

                return date;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "formato incorrecto");
                e.printStackTrace();
            }
        }else if (input.charAt(2) == '-'){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date;
            try {
                date = simpleDateFormat.parse(input);
                return  date;
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
    public Calendar changeToDate(String input){
        int year= 0;
        int month = 0;
        int day = 0;

        if (input.charAt(4)== '-' ){
            String[] parts = input.split("-");
            day = Integer.valueOf(parts[0]);
            month = Integer.valueOf(parts[1]);
            year = Integer.valueOf(parts[2]);
            Calendar calendar = new GregorianCalendar(year,month,day);
            return calendar;


        }else if (input.charAt(4)=='/'){
            String parts[] = input.split("/");
            day = Integer.valueOf(parts[0]);
            month = Integer.valueOf(parts[1]);
            year = Integer.valueOf(parts[2]);
            Calendar calendar = new GregorianCalendar(year,month,day);
            return calendar;
        }
        return null;
    }


}