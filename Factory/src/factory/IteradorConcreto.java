package factory;


public class IteradorConcreto implements Iterador {

    private Inventario objInventario ;
    private int posicionActual = 0;
    private int cantidadActual = 0;
    
    public IteradorConcreto(Inventario inventario)
    {
        objInventario = inventario;
    }

  
    public Object obtenerPrimerElemento() {
       Object obj = null;
       if(objInventario.vehiculos.isEmpty() == false )
       {
          posicionActual = 0;
          obj = objInventario.vehiculos.get(0);
       }
       return obj;
    }

    
    public Object obtenerSiguienteElemento() {
       Object obj = null;
       if(posicionActual < objInventario.vehiculos.size())
       {
          obj =objInventario.vehiculos.get(posicionActual);
          posicionActual = posicionActual + 1;
       } 
       return obj;
    }

    
    public Object obtenerElementoActual() {
       Object obj = null;
       if(posicionActual < objInventario.vehiculos.size())
       {
          obj =objInventario.vehiculos.get(posicionActual);
       }
       return obj;
    }

    
    public boolean hayMas()
    {
       boolean ok = false;
       if(posicionActual < (objInventario.vehiculos.size()))  
       {
          ok = true;
       }
        return ok;
    }
    
    public int obtenerDisponibilidadVehiculos(){
        
        objInventario.vehiculos.get(0).getClass().getName();
        return 1;
        
    }
    
}
