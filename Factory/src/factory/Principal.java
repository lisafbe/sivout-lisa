/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.io.IOException;

public class Principal {
	
	//private Inventario inventario;
       Concesionario ccs =  new Concesionario();
       
	public Principal() throws IOException{
		 
               
                
                calcularErrorDeEstimacion();
	}

public double calcularErrorDeEstimacion(){
		Fachada fachada = new Fachada ();
		double errorRelativo;
		double estimacion= fachada.obtenerPresupuesto();
		double realidad = fachada.obtenerTotalInventario();
		errorRelativo = Math.abs(estimacion - realidad) / realidad;
                System.out.println("El presupuesto asignado al inventario tuvo un error de " +errorRelativo);
		return errorRelativo;
		
	}


  public static void main(String[] args) throws IOException {
      
       Concesionario ccs =  new Concesionario();
       new Empleado1(ccs);
       new Empleado2(ccs);
       ccs.notifyObservers();

        
  }

}




 