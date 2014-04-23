package factory;
public class FabricaDeVehiculos implements FabricaDeAutomoviles{

	 
	public Vehiculo crearVehiculo(String tipo,String placa,String marca, double potencia,double peso) {
		
		if (tipo.equalsIgnoreCase("Bus")){
                    System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Bus(placa,marca,potencia,peso);
		} else if (tipo.equalsIgnoreCase("Deportivo")){
                      System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Deportivo(placa, marca, potencia,peso);
		} else if (tipo.equalsIgnoreCase("Familiar")){
                      System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Familiar(placa, marca, potencia,peso);
		} else if (tipo.equalsIgnoreCase("Volqueta")){
                      System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Volqueta(placa, marca, potencia,peso);
		} else if (tipo.equalsIgnoreCase("Camioneta")){
                      System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Camioneta(placa, marca, potencia,peso);
		} else if (tipo.equalsIgnoreCase("Campero")){
                      System.out.println("Creado vehiculo de tipo: "+tipo);
			return new Campero(placa, marca, potencia,peso);
		}
		return null;
				
	}

}