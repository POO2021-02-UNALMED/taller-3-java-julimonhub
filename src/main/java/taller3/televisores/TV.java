package taller3.televisores;

public class Control{
	TV tv;
	
	pulic void enlazar(TV tv) {
		this.tv=tv
		tv.setControl(this);
	}
	
	public void setTv){
		this.tv=tv;
}
	
	public TV getTV() {
		return tv;
	}
	
	public void canalup() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff(){
		tv.turnOff();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
}