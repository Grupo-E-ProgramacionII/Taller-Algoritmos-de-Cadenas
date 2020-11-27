package Logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Scanner;
import java.util.Date;

public class Ejercicio1 {

    public String turnIntoNameSelf(String input){
        char [] characters = input.toCharArray();
        characters[0] = Character.toUpperCase(characters[0]);
        for (int i = 0; i < input.length()-2; i++) {
            if (characters[i] == ' ' ){

                    characters[i + 1] = Character.toUpperCase(characters[i + 1]);


            }
            else {
                for (int j = 2; j < input.length(); j++) {
                    if (characters[j - 1] == ' ' && characters[j + 1] == ' ') {
                        characters[j] = Character.toLowerCase(characters[j]);

                    }
                }
            }
        }
    return  new String(characters);

    }
    public String deleteCharacters (String text, String caracterToDelete) {

        if (caracterToDelete.length() != 0) {
            String textFinal = "";
            textFinal = text.replaceAll(caracterToDelete, "");
            return textFinal;
        }
        return "f";
    }
    public Date turnToDate(String input){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = simpleDateFormat.parse(input);

            return date;
        } catch (ParseException e) {
            System.out.println("formato incorrecto");
            e.printStackTrace();
        }
    return null;
    }

 

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("INGRESE UNA CADENA A CONVERTIR EN NOMBRE PROPIO");
        //System.out.println("INGRESE UNA CADENA");
        //String input = scanner.nextLine();
        //System.out.println("INGRESE EL CARACTER QUE DESEA ELIMINAR");
      //  String character = scanner.nextLine();
       // System.out.println(new Ejercicio1().turnIntoNameSelf(input));
        //new Ejercicio1().turnToDate(input);


      //  System.out.println(new Ejercicio1().UpperCaseWords("sogamoso ciudad del sol y del acero"));
        System.out.println(new Ejercicio1().turnIntoNameSelf("sogamoso ciudad del sol y del acero"));

    }
}
