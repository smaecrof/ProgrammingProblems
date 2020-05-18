
public class ComplexNumber {

	private double imaginary; 
	private double real; 
	
	public ComplexNumber(double i, double r) {
		this.imaginary = i; 
		this.real = r; 
	}
	
	
	public double getReal() {
		return this.real; 
	}
	
	public double getImaginary() {
		return this.imaginary; 
	}
	
	public void add(double i, double r) {
		this.imaginary = this.imaginary + i; 
		this.real = this.real + r; 
	}
	
	public void add(ComplexNumber cx) {
		this.imaginary = this.imaginary + cx.getImaginary(); 
		this.real = this.real + cx.getReal(); 
	}
	
	public void subtract(double i, double r) {
		this.imaginary = this.imaginary - i; 
		this.real = this.real - r; 
	}
	
	public void subtract(ComplexNumber cx) {
		this.imaginary = this.imaginary - cx.getImaginary(); 
		this.real = this.real - cx.getReal(); 
	}
}
