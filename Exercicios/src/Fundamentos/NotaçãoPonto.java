package Fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
	
		String x = "Leo".toUpperCase();
		System.out.println(x);
	
		String y = "Bom Dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
	
	}
}