package edu.uptc.string_algorithms.view;

import edu.uptc.string_algorithms.logic.*;
import javax.swing.JOptionPane;

public class Run {
	private StringAlgorithmsVF stringAlgorithmsVF;

	public Run() {
		stringAlgorithmsVF = new edu.uptc.string_algorithms.logic.StringAlgorithmsVF();
	}

	public static void main(String[] args) {
		Run run = new Run();
		String encr = null;
		int menu = 0;

		do {

			menu = Integer.parseInt(JOptionPane.showInputDialog(
					"INGRESE UNA OPCION:" + "\n1.Convertir en nombre propio el" + "contenido de la cadena"
							+ "\n2.Buscar Cadena de caracteres" + "\n3.Encriptar" + "\n4.Desencriptar"
							+ "\n5.Llenar caracteres" + "\n6.Borrar caracteres" + "\n7.Intersección" + "\n8.Diferencia"
							+ "\n9.Borrar caracteres izquierda o derecha" + "\n10.Convertir a Fecha" + "\n11.Salir"));

			switch (menu) {
			case 1:
				JOptionPane.showMessageDialog(null, "ALGORITMO CONVERTIR CADENA A NOMBRE PROPIO:" + "\n"
						+ run.stringAlgorithmsVF.turnIntoNameSelf() + "\n-----------------------");
				break;
			case 2:
				String word = JOptionPane.showInputDialog("Ingrese la palabra a buscar: ");
				JOptionPane.showMessageDialog(null, "La palabra " + word + " se encuentra " + run.stringAlgorithmsVF.searchWord(word) + " veces");

				break;
			case 3:
				encr = JOptionPane.showInputDialog("Ingrese la cadena que desea encriptar");
				JOptionPane.showMessageDialog(null,"Encriptar: \n" + StringAlgorithmsVF.encryptCharacters(encr));
				break;

			case 4:
				if (encr != null) {
					JOptionPane.showMessageDialog(null, "Para mas comodidad se pondra la cadena encriptada en la consola así podrá copiarla");
					System.out.println(StringAlgorithmsVF.encryptCharacters(encr));
					String desencr= JOptionPane.showInputDialog("Ingrese la cadena que desea desencriptar");
					JOptionPane.showMessageDialog(null,"Desencriptar: \n" + StringAlgorithmsVF.decryptCharacters(desencr));
				} else {
					JOptionPane.showMessageDialog(null, "Por favor encripte una palabra primero con la opción de 'Encriptar' dada en el menú");

				}
				
							
				break;

			case 5:
				JOptionPane.showMessageDialog(null,
						"Llenar caracteres: \n" + StringAlgorithmsVF.fillCharacters('A', 4, true));
				break;

			case 6:
				String character;
				character = (JOptionPane.showInputDialog("INGRESE CARACTER A ELIMINAR"));
				JOptionPane.showMessageDialog(null, run.stringAlgorithmsVF.deleteCharacters(character));

				break;

			case 7:
				JOptionPane.showMessageDialog(null, "Interseccion :" + run.stringAlgorithmsVF.intersection("colombia"));
				break;

			case 8:
				String c=JOptionPane.showInputDialog("Ingrese la palabra a la que desea hallarle la diferencia de caracteres de la\r\n" + 
						"cadena original ");
				JOptionPane.showMessageDialog(null, "Diferencia: "+StringAlgorithmsVF.characterSubtraction(c));
				break;

			case 9:
				String chainCharacters= JOptionPane.showInputDialog("Ingrese la cadena de caracteres que se va a comparar y eliminar por izq. o der.");
				int address = (Integer.parseInt(JOptionPane.showInputDialog("Seleccione la direcci�n \n"
						+ "1. Izquierda \n"
						+ "2. Derecha")));
				if(address == 1) {
					JOptionPane.showMessageDialog(null, run.stringAlgorithmsVF.left(chainCharacters));
				}else {
					JOptionPane.showMessageDialog(null, run.stringAlgorithmsVF.right(chainCharacters));
				}
				break;

			case 10:
				String date = JOptionPane.showInputDialog("INGRESE UNA FECHA CON FORMATO   yyyy/mm/dd");

				JOptionPane.showMessageDialog(null, "Realizado:" + run.stringAlgorithmsVF.changeToDate(date));
				break;

			case 11:

				JOptionPane.showMessageDialog(null, "Gracias");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción invalida, intente de nuevo");
				break;
			}
		} while (menu != 11);
	}
}
