import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos3 {
	
	ModeloDatos miData;
   
	ArrayList<String> listaEmpleados;

public Procesos3() {
	
	miData=new ModeloDatos();
		
		iniciar3();
		}

private void iniciar3() {
	String op;
    do {
   	 
   	 Object des=JOptionPane.showInputDialog(null,"Seleccione La Accion Que Desea Realizar",
				   "Procedimiento", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Registrar Persona", "Registro Descuentos","Salir" },"Seleccione");
		 op=String.valueOf(des);
		switch (op) {
		case "Registrar Persona":
				IngresarDatos();
			break;
			
    case "Registro Descuentos":
			int total=miData.getSizeMap3();
			
			System.out.println("El Total De Descuentos Hechos Es: "+total+"\n");
			
			miData.imprimirMapa();
			
			
			break;
			

		default:
			break;
		}
	} while (op!="Salir");
 }

public void IngresarDatos() {
	
	listaEmpleados=new ArrayList<String>();
	
	String nombre = JOptionPane.showInputDialog("Ingrese El Nombre");
	int estracto = validarEstracto();
	double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
	
	double descuentoE = descuento(estracto,salarioBase);
	
	double salarioF = salarioBase - descuentoE;
	
	String estractoS = String.valueOf(estracto);
	String salarioBasico = String.valueOf(salarioBase);
	String descuentoS = String.valueOf(descuentoE);
	String salarioFinal = String.valueOf(salarioF);
	
	
	
	listaEmpleados.add(nombre);
	listaEmpleados.add(estractoS);
	listaEmpleados.add(salarioBasico);
	listaEmpleados.add(descuentoS);
	listaEmpleados.add(salarioFinal);

	miData.guardarDatos3(listaEmpleados);
	

	
}

public int validarEstracto() {
	int estracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estracto"));
	
	while (estracto <0 && estracto >7) {
		System.out.println("estracto no valido");
		
		estracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estracto"));
	}
		
		
	
		return estracto;
	
}

public double descuento(int estracto, double salario) {
	
	double valorD = 0;
	
	
	
	  if (estracto >=1 && estracto <=2 ) {
	        valorD = 0.02 * salario ;

	    } else if(estracto >=3 && estracto <=4 ) {
	        valorD = 0.04*salario ;
	    } else if(estracto == 5 ) {
	        valorD = 0.08*salario ;
	}else if(estracto ==6 ) {
	    valorD =0.1*salario ;
	}
	  return valorD;
	    }

  

	
}

