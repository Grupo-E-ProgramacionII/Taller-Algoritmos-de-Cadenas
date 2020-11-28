package edu.uptc.vista;

import Logica.StringAlgorithmsV1;

import java.util.Scanner;



public class Run {
    private StringAlgorithmsV1 stringAlgorithmsV1;
    public  Run(){
        stringAlgorithmsV1 = new StringAlgorithmsV1();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Run run = new Run();
        int opcion=0;


        while (opcion<4){
            String menu ="INGRESE UNA OPCION:" +
                    "\n1.Convertir en nombre propio el" +
                    "contenido de la cadena" +
                    "\n2.Borrar caracteres" +
                    "\n3.Convertir a Fecha" +
                    "\n4.Salir";
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("ALGORITMO CONVERTIR CADENA A NOMBRE PROPIO:"+"\n"+ run.stringAlgorithmsV1.turnIntoNameSelf()+"\n-----------------------");
                    break;
                case 2:
                    System.out.println("INGRESE CARACTER A ELIMINAR");
                    String character = scanner.next();
                    System.out.println(run.stringAlgorithmsV1.deleteCharacters(character));

                    break;
                case 3:
                    System.out.println("INGRESE UNA FECHA CON FORMATO DÍA MES AÑO");
                    String date = scanner.next();
                    //System.out.println(run.stringAlgorithmsV1.turnToDate(date));
                    run.stringAlgorithmsV1.changeToDate(date);
                    break;

                default:
            }
        }
    }
}
