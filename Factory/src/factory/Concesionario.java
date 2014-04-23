/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observer;
import java.util.Vector;

public class Concesionario implements Observable{
	Inventario inv = Inventario.getInstance();
	private Vector observerList;
        public ArrayList<Integer> cant =new ArrayList<Integer>(Arrays.asList(10, 23, 15, 12, 9, 6));
        
        
        public Concesionario(){
            observerList = new Vector();
	 
            
	}
	
	public void agregarVehiculo(String tipo,String placa,String marca,double potencia,double peso) throws IOException{

        realizarpruebas(tipo) ;
        
        inv.adicionarVehiculoAInventario(tipo,placa,marca,potencia,peso);		
         notifyObservers();
        }
        
        public void consultarInventario(){
        
         System.out.println(inv.obtenerTotalInventario());
 
        }
      
        public void realizarpruebas(String tipo){
          System.out.println("***** Realizando Pruebas a los Componentes*****");
      
          if (tipo.equalsIgnoreCase("Bus")){
                   probarBus();
		} else if (tipo.equalsIgnoreCase("Deportivo")){
                      probardeportivo();
		} else if (tipo.equalsIgnoreCase("Familiar")){
                      probarFamiliar();
		} else if (tipo.equalsIgnoreCase("Volqueta")){
                      probarVolqueta();
		} else if (tipo.equalsIgnoreCase("Camioneta")){
                      probarCamioneta();
		} else if (tipo.equalsIgnoreCase("Campero")){
                     probarCampero();
		}
 
         }  
        
       public void probarBus(){
        PruebaVehiculo pBus=  new AdaptadorBus();
        pBus.pruebaMotor();
        pBus.pruebaControles();
        }
        
       public void probarVolqueta(){
        PruebaVehiculo pVolqueta=  new AdaptadorVolqueta();
        pVolqueta.pruebaMotor();
        pVolqueta.pruebaControles();
        }
       
       public void probardeportivo(){
        PruebaVehiculo pDeportivo=  new Deportivo();
        pDeportivo.pruebaMotor();
        pDeportivo.pruebaControles();
        }
       
          public void probarCampero(){
        PruebaVehiculo pCampero=  new Campero();
        pCampero.pruebaMotor();
        pCampero.pruebaControles();
              
              
        }
          
           public void probarFamiliar(){
        PruebaVehiculo pFamiliar=  new Familiar();
        pFamiliar.pruebaMotor();
        pFamiliar.pruebaControles();
        }  
         
        public void probarCamioneta(){
        PruebaVehiculo pCamion=  new AdaptadorCamion();
        pCamion.pruebaMotor();
        pCamion.pruebaControles();
        }

  
    public void notifyObservers() {
       for(int i=0; i< observerList.size();i++){
       Observador objservador =   (Observador) observerList.elementAt(i);
   
      objservador.refreshData(this);
       
       }
        
    }

 
    public void register(Observador obs) {
        observerList.addElement(obs);
        
    }

  
    public void unRegister(Observador obs) {
       
    }
    
    
    
    
    public int[] obtenerDisponibilidadVehiculos() {
        Agregado objAgregado = inv.getInstance();
        int[] cantidadVehiculos = new int[6];
        cantidadVehiculos = inv.obtenerDisponibilidadVehiculos();
        return cantidadVehiculos;
    }
       
}