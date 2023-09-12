import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ModeloDatos {

HashMap<String, ArrayList<String>> mapRegistros;
HashMap<String, ArrayList<String>> mapEmpleados;
	
	public ModeloDatos() {
	mapRegistros=new HashMap<String, ArrayList<String>>();
	mapEmpleados=new HashMap<String, ArrayList<String>>();

	}
	
	public void consultarEstudiante(String documento) {
	if (mapRegistros.containsKey(documento)) {
	System.out.println(mapRegistros.get(documento));
	}else {
	JOptionPane.showMessageDialog(null, "Documento no existe",
	"Advertencia",JOptionPane.WARNING_MESSAGE);
	}
	}
	
	public HashMap<String, ArrayList<String>> getMapaEstudiantes(){
	return mapRegistros;
	}
	
	public void guardarDatos(ArrayList<String> listaRegistro) {
	mapRegistros.put(listaRegistro.get(0), listaRegistro);
	JOptionPane.showMessageDialog(null, "Registro existoso!");
	}
	
	public int getSizeMap() {
	return mapRegistros.size();
	}
	
	//Modelo de datos ejercicio 3
	

	
	public void guardarDatos3(ArrayList<String> listaEmpleados) {
		mapEmpleados.put(listaEmpleados.get(0), listaEmpleados);
		JOptionPane.showMessageDialog(null, "Registro existoso!");
		}
	
	public int getSizeMap3() {
	return mapEmpleados.size();
	}
	
	public void imprimirMapa() {
		Iterator<String> itera=mapEmpleados.keySet().iterator();
		String llave;
		while (itera.hasNext()) {
		llave =itera.next();
		System.out.println(llave + " - "+mapEmpleados.get(llave));
	
		}
	
	}}
