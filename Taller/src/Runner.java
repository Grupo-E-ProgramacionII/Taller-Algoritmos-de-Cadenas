import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
	
		Logic logic = new Logic();
		
		String word = JOptionPane.showInputDialog("Ingrese la palabra a buscar: ");
		JOptionPane.showMessageDialog(null, "La palabra " + word + " se encuentra " + logic.searchWord(word) + " veces");

		JOptionPane.showMessageDialog(null, "Interseccion :" + logic.intersection("colombia"));
		
		String chainCharacters= JOptionPane.showInputDialog("Ingrese la cadena de caracteres que se va a comparar y eliminar por izq. o der.");
		int address = (Integer.parseInt(JOptionPane.showInputDialog("Seleccione la dirección \n"
				+ "1. Izquierda \n"
				+ "2. Derecha")));
		if(address == 1) {
			JOptionPane.showMessageDialog(null, logic.left(chainCharacters));
		}else {
			JOptionPane.showMessageDialog(null, logic.right(chainCharacters));
		}
		
	}

}
