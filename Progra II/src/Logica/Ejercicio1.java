package Logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Scanner;
import java.util.Date;

public class Ejercicio1 {
    private static  final String caracter = "Sogamoso ciudad del sol y del acero";

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

    public String UpperCaseWords(String line)
    {
        line = line.trim().toLowerCase();
        String data[] = line.split("\\s");
        line = "";
        for(int i =0;i< data.length;i++)
        {
            if(data[i].length()>1)
                line = line + data[i].substring(0,1).toUpperCase()+data[i].substring(1)+" ";
            else
                line = line + data[i].toUpperCase();
        }
        return line.trim();
    }
    public String deleteCharacters (String text, String caracterToDelete) {

        if (caracterToDelete.length() != 0) {
            String textFinal = "";
            textFinal = text.replaceAll(caracterToDelete, "");
            return textFinal;
        }
        return "no detecto ningun caracter";
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion !=4){
            System.out.println("INGRESE UNA OPCION:" +
                    "\n1.Convertir en nombre Propio el" +
                    "contenido de la cadena" +
                    "\n2.Borrar caracteres" +
                    "\n3.Convertir a Fecha" +
                    "\n4.Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(new Ejercicio1().turnIntoNameSelf(caracter));
                    break;
                case 2:
                    System.out.println("INGRESE EL CARACTER QUE DESEA ELIMINAR");
                    String character = scanner.next();
                    System.out.println(new Ejercicio1().deleteCharacters(caracter, character));
                    break;
                case 3:
                    System.out.println("INGRESE UNA FECHA");
                    String date = scanner.next();
                    System.out.println(new Ejercicio1().turnToDate(date));


                    break;
                default:
                    System.out.println("no ha digitado una opcion correcta");
                }
            }



    }
}
