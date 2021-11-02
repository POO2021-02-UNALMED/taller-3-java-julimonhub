package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1, precio = 500, volumen = 1 ;
	private boolean estado;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) { 
		this.marca = marca;
		this.estado = estado;
		numTV = numTV + 1;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}	
	public void setControl(Control control) {
		this.control = control;	
	}
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	public void setVolumen(int volumen) {
		if(this.estado == true && volumen >= 0 && volumen <= 7) {
		this.volumen = volumen;	
		}
	}
	public void setCanal(int canal) {
		if(this.estado == true && canal >= 1 && canal <= 120) {
		this.canal = canal;
		}
	}
	public static void setNumTV(int numero) {
		numTV = numero;	
	}
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if(estado == true && canal < 120){
			canal = canal + 1;			
		}
	}
	
	public void canalDown() {
		if(estado == true && canal > 1){
			canal = canal - 1;
		}
		
	}
	
	public void volumenUp() {
		if(estado == true && volumen < 7){
			volumen = volumen + 1;
		}		
	}
	
	public void volumenDown() {
		if(estado == true && volumen > 0){
			volumen = volumen - 1;
		}
	}
}