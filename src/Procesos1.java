import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos1 {

	ModeloDatos miData;
	ArrayList<String> listaRegistro;
	int cantMayores=0,cantMenores=0;
	
	public Procesos1() {
		miData=new ModeloDatos();
		iniciar();
		}

	private void iniciar() {
		String op;
     do {
    	 
    	 Object des=JOptionPane.showInputDialog(null,"Seleccione Una Funcionalidad",
				   "Eleccion", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Registrar Personas", "Total Registros", "Mayores De Edad", "Menores De Edad","Salir" },"Seleccione");
		 op=String.valueOf(des);
		switch (op) {
		case "Registrar Personas":
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de personas que desea registrar"));
			
			for (int i = 0; i < cantidad; i++) {
				IngresarDatos();
			}

			break;
			
     case "Total Registros":
			int total=miData.getSizeMap();
			
			System.out.println("El total de personas registradas es: "+total);
			break;
			
     case "Mayores De Edad":
			System.out.println("el total de personas mayores de edad es: "+cantMayores);
			break;
			
     case "Menores De Edad":
			System.out.println("Cantidad de personas menores de edad es: "+cantMenores);
			break;
			
		default:
			break;
		}
	} while (op!="Salir");
		
	}

	private void IngresarDatos() {
       
		listaRegistro=new ArrayList<String>();
		
		String nombre = JOptionPane.showInputDialog("Ingrese El Nombre");
		String documento = JOptionPane.showInputDialog("Ingrese el documento");
		String edad = validarEdad();
		String profesion = JOptionPane.showInputDialog("Ingrese la profesion");
		
		listaRegistro.add(nombre);
		listaRegistro.add(documento);
		listaRegistro.add(edad);
		listaRegistro.add(profesion);
		
		miData.guardarDatos(listaRegistro);
		
		System.out.println("Nombre: "+nombre+", Documento: "+documento+", Edad: "+edad+" Profesion "+profesion);


	}

	private String validarEdad() {

         int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
         
         if (edad >=18) {
			
        	 cantMayores++;
        	 
		} else {
			cantMenores++;
		}
         
         String edadF = String.valueOf(edad);
		
		return edadF;
	}
	
}
