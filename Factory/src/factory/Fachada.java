/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
public class Fachada {
	
	public Fachada () {
		
	}
	
	public double obtenerTotalInventario () {	
	
	    Inventario inv = Inventario.getInstance();
	    return inv.obtenerTotalInventario();
	   
	}
	
	public double obtenerPresupuesto () {	
	    
	    EstadoFinanciero ef = new EstadoFinanciero ();
	    return ef.obtenerPresupuesto();
	    
	}

}