package Drone;

public class PID {
	
	private double p;
	private double i;
	private double d;
	private double previous_error = 0;
	private double integral = 0;
	private double dt = 1;
	
	public PID(double p, double i, double d, double dt) {
		super();
		this.p = p;
		this.i = i;
		this.d = d;
		this.previous_error = 0;
		this.integral = 0;
		this.dt = dt;
	}
	
	public double compute(double measurment) {
		this.integral += measurment*this.dt;
		//System.out.println("integral : " + this.integral);
		//if (this.integral > 1000) {this.integral = 100;}
		double u_t = this.p * measurment + this.i * this.integral + this.d * (measurment-this.previous_error)/this.dt;
		this.previous_error = measurment;
		return u_t;
	}

	public double getIntegral() {
		return integral;
	}

	public void setIntegral(double integral) {
		this.integral = integral;
	}
	
	
	
	
}
