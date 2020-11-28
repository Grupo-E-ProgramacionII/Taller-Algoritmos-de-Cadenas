package Logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StringAlgorithmsV1 {
    /*
        *CONSTANTES:
        * se toma la cadena sogamoso ciudad del sol y del acero
     */
    public static  final String SENTENCE = "Sogamoso ciudad del sol y del acero";
    /*
    metodo constructor de la clase:
    */
    public StringAlgorithmsV1(){

    }
    /*
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
    /*
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
            System.out.println("texto todo en minuscula:____"+textFinal);
            textFinal = textAllMinus.replaceAll(minus, "");
            System.out.println("caracter en mayuscula: " + mayus);

            return  textFinal;
        }else {
            return  "caracter invalido";
        }


    }
    /*
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
                System.out.println("formato incorrecto");
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
    public void changeToDate(String input){
        int year= 0;
        int month = 0;
        int day = 0;

        if (input.charAt(2)== '-' || input.charAt(3)=='-'){
            String[] parts = input.split("-");
            if (Integer.parseInt(parts[0]) <=12) {
                day = Integer.parseInt(parts[0]);
                for (int i = 0; i < parts.length; i++) {
                    System.out.println("parte: " + (i + 1) + "__" + parts[i]);
                }
            }

        }
       // return  null;
    }


}
