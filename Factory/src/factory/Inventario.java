/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;


import java.util.ArrayList;
import java.util.List;

public class Inventario implements Agregado {
	private static Inventario instance;
	private FabricaDeAutomoviles fabrica;
	public ArrayList<Vehiculo> vehiculos = null;
	
	private Inventario(){
		setFabrica(new FabricaDeVehiculos());
		vehiculos = new ArrayList<Vehiculo>();
	}
	
  
        
	public static Inventario getInstance(){
		if(instance==null){
			instance = new Inventario();
		}
		return instance;
	}
	
	public void adicionarVehiculoAInventario(String tipo,String placa, String marca, double potencia, double peso){
		vehiculos.add(getFabrica().crearVehiculo(tipo,placa,marca,potencia,peso));
        
        //System.out.println(vehiculos.get(0).getClass().getSimpleName());
	}

    
	/**
	 * @return the fabrica
	 */
	public FabricaDeAutomoviles getFabrica() {
		return fabrica;
	}

	/**
	 * @param fabrica the fabrica to set
	 */
	public void setFabrica(FabricaDeAutomoviles fabrica) {
		this.fabrica = fabrica;
	}
            
    
    
    //cambiar
    public double obtenerTotalInventario (){
		return 4000;
	}

    
    public Iterador obtenerIterador(){
        return new IteradorConcreto(getInstance()) ;
    }
    
    public int[] obtenerDisponibilidadVehiculos() {
        int [] cantidadVehiculos= new int[6];
        
        int bus = 0,camioneta = 0,campero = 0,deportivo = 0,familiar = 0,volqueta = 0;
        
        while( obtenerIterador().hayMas() == true )
        {
        if(obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Bus"))
        {
          bus++;
        }
        else 
        {
          if(obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Camioneta"))
          { 
            camioneta++;
          }
          else 
          { 
            if (obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Campero"))
            {
              campero++;
            }
            else 
            {
              if (obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Deportivo"))
              {
                deportivo++;
              }
              else 
              {
                if (obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Familiar"))
                {
                  familiar++;
                }
                else
                {
                  if (obtenerIterador().obtenerElementoActual().getClass().getSimpleName().equalsIgnoreCase("Volqueta"))
                  {
                    volqueta++;
                  }
                  else
                  {
                      obtenerIterador().obtenerSiguienteElemento();
                  }
                }
              }
            }
          } 
        }
       }
       
        cantidadVehiculos[0]= bus;
        cantidadVehiculos[1]= camioneta;
        cantidadVehiculos[2]= campero;
        cantidadVehiculos[3]= deportivo;       
        cantidadVehiculos[4]= familiar;
        cantidadVehiculos[5]= volqueta;
        
        return cantidadVehiculos;
    }
}

         

