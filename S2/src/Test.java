import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		long numero = 123456789123l;
		float my_float = 123123.5F;
		double d = 12312312312.56;
		short s = (short) numero;
		
		boolean myValue = true;
		boolean myFalseValue = false;
		
		char myCharValue = 'a';
		char myAValue = 97;
		
		String s1 = "   Hola Mundo  ";
		System.out.println(s1);
		
		int longitud = s1.length();
		System.out.println("Longitud de s1: " + longitud);
		
		String s2 = s1.trim();
		System.out.println("Longitud de s2: " + s2.length());
		
		System.out.println("Longitud de s1: " + s1.trim().length());
		
		System.out.println("S1 en mayúsculas: " + s1.toUpperCase());
		System.out.println("S1 en minúsculas: " + s1.toLowerCase());
		
		System.out.println("S1 en mayúsculas: " +  s1.toUpperCase() + ""
				+ ", S1 en minúsculas: " + s1.toLowerCase() + "\n");
		
		System.out.println(5 + 5  + "10");
		System.out.println("10" + 5 + 5);
		System.out.println("10" + (5 + 5));
		
		String c1 = "Hola";
		String c2 = "Hola Mundo";
		String c3 = "HOLa";
		
		int r1 = c1.compareTo(c2);
		int r2 = c1.compareTo(c3);
		int r3 = c1.compareToIgnoreCase(c3);
		
		//true | false
		boolean b1 = c1.equalsIgnoreCase(c3);
		
		
		JOptionPane.showMessageDialog(null, 
				"Longitud de s1: " + s1.length() + "\n"
				+ "Longitud de s2: " + s2.length(),
				"Sesión 2", 
				JOptionPane.ERROR_MESSAGE);
		
	}
}











