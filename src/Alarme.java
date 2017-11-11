
public class Alarme {

		private boolean estado; 
		private boolean sirene; 
		private byte senha; 
		public Sensor[] sensores; 
        
	

		public Alarme (int numeroSensores) { 
		this.sensores = new Sensor[numeroSensores]; 
		estado = false; 
		sirene = false; 

	

		for (int i = 0; i < numeroSensores; i++) 
		this.sensores =  new Sensor[numeroSensores];
		} 

		

		private boolean setAlarme() { 
		return this.estado = true; 
		} 

		

		private boolean Sirene() { 
		return this.sirene = true; 
		} 

	

		private byte setPassword() { 
		return this.senha; 
		} 

		

		private int totalSensores() { 
		return this.sensores.length; 
		} 

		

		private int numeroSensoresActivos() { 
		int numero = 0; 
		for (int i = 0; i < totalSensores(); i++) 
		numero++; 
		return numero; 
		} 

	

		private boolean detectaIntruso() { 
		boolean intrusao = false; 
		for (int i = 0; i < numeroSensoresActivos(); i++) { 
		if (Sirene()) 
		intrusao = true; 
		}
		return intrusao; 
		 
		
		} 

		
}
