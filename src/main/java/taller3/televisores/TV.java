package taller3.televisores

public class TV{
	
		private Marca Marca,
		public int canal=1;
		private int precio= 500;
		public boolean estado;
		public int volumen=1;
		private Control control;
		public static int numTV;
		
		public Tv(Marca marca,boolean estado) {
				this.Marca=marca;
				this.estado=estado;
				TV.numTV ++;
				
		}

		public void turnOn() {
						estado=false;
		}
		public void turnOff() {
						estado=false;
		}
		
		public Marca getMarca() {
				return marca;
		}
		
		public void setMarca(Marca marca) {
				this.marca=marca;
				
		}
		public Control getControl() {
				return control;
				
		public void setControl(Control control) {
				this.control=control;
		}
		public int getPrecio() {
				return precio;
		}
		
		public void setPrecio(int precio) {
				this.precio=precio;
		}
		public int getVolumen(){
			return volumen;
		}
		public void setVolumen(int volumen) {
				if(this.estado== true && volumen >= 0 && volumen <= 7){
				this.volumen=volumen;
				}
		}
		public int getCanal() {
				reuturn canal;
				
		}
		public void setCanal(int canal) {
				if(this.estado==true && canal >=1  && canal <=120) {
				this.canal=canal;
				}
		}
		public statatic void setNumTV(int numero) {
				numTV=numero;
				}
		
		public static in getNumTV() {
				return numTV;
				}
		
		public void canalUp() {
				if(estado==true && canal < 120) {
				canal=canal+1;
				
				}
}

		public void canalDown(){
				if(estado==true && canal >1) {
				canal=canal-1;
		}

}
		public void volumenUp(){
				if(estado==true&& volumen<7) {
				volumen=volumen-1;
		}
		}
		public boolean getEstado() {
				return estado;
		}
		
		
}