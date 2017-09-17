import javax.swing.JOptionPane;

public class Sesion3 {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Ingresa tu nombre");
		
		//JOptionPane.showMessageDialog(null, "Nombre ingresado es " + valor.toUpperCase());
			
		int edad;
		String myAge =  JOptionPane.showInputDialog("¿Cuál es tu edad?");
		edad = Integer.parseInt(myAge);
		
		JOptionPane.showMessageDialog(null, 
				"La edad de " + valor.toUpperCase() + " es de " + edad + " años");
		
		int exponencial = (int) Math.pow(2, 3);
		
		double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Dame velocidad"));
		/*
		 * asdasd
		 * asd
		 * asdasdasdasd
		 * ads
		 */
	}
}
