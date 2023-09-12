import javax.swing.JOptionPane;

public class Principal {

	 public static void main(String arg[]) {
		   
		   Object desu=JOptionPane.showInputDialog(null,"Elija Un Ejercicio",
				   "Ejercicios", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Ejercicio 1", "Ejercicio 2", "Ejercicio 3"},"Seleccione");
		   String option = String.valueOf(desu);
		   switch (option) {
		case "Ejercicio 1":
			   Procesos1 misprocesos = new Procesos1();
			break;
			
		case "Ejercicio 2":
			
			Procesos2 misprocesos2 = new Procesos2();
			
			break;
			
		case "Ejercicio 3":
			
			Procesos3 misprocesos3 = new Procesos3();
			
			break;


		default:
			break;
		}
		   

	}
	
}
