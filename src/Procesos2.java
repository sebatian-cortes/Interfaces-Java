

import javax.swing.JOptionPane;

public class Procesos2 {
	
	public Procesos2() {
		
		iniciar2();
		}

	private void iniciar2() {
		int ingreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea en los dos arreglos"));
		int array[]=new int [ingreso];
		int array2[]=new int [ingreso];
		int array3[]=new int [ingreso];
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la posicion "+ i +" del primer arreglo"));
			array2[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la posicion "+ i +" del segundo arreglo"));

					};
					
		
		for (int i = 0; i < array.length; i++) {
			array3[i]=array[i]+array2[i];
		}
		
		System.out.print("Primer arreglo: | ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" | ");
		}
		System.out.println();
		
		System.out.println("Segundo arreglo : | ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array2[i]+" | ");

		}
		
		System.out.println();
		
		System.out.println("Tercer arreglo: | ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array3[i]+" | ");

		}
		

	}



		
	}
	

