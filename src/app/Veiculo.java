package app;

public class Veiculo {
	IMotor motor;
	
	Veiculo(IMotor m){
		this.motor= m;
	}
	public String acelerar() {
		return this.motor.acelerar();
	}
}