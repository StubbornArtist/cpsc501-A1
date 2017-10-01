
public class ComplexNumber {

	private int real;
	private int imaginary;
	
	
	public ComplexNumber(){
		this(0,0);
	}
	
	public ComplexNumber(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber(ComplexNumber other){
		this(other.getRealPart(), other.getImaginaryPart());
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
		if (c1 == null || c2 == null) {
			System.out.println("Error: Object is null");
			System.exit(0);
		}
		
		return new ComplexNumber(c1.getRealPart() + c2.getRealPart(), 
				c1.getImaginaryPart() + c2.getImaginaryPart());
	}
	
	public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2){
		if (c1 == null || c2 == null) {
			System.out.println("Error: Object is null");
			System.exit(0);
		}
		
		return new ComplexNumber(c1.getRealPart() - c2.getRealPart(), 
				c1.getImaginaryPart() - c2.getImaginaryPart());	
	}
	
	public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2){
		if (c1 == null || c2 == null) {
			System.out.println("Error: Object is null");
			System.exit(0);
		}
		int real1 = c1.getRealPart();
		int real2 = c2.getRealPart();
		int imag1 = c1.getImaginaryPart();
		int imag2 = c2.getImaginaryPart();
		
		return new ComplexNumber((real1 * real2) + (imag1 * imag2),
				(real1 * imag2) + (real2 * imag1));	
	}
	
	public static ComplexNumber divide(ComplexNumber c1, ComplexNumber c2){
		if (c1 == null || c2 == null) {
			System.out.println("Error: Object is null");
			System.exit(0);
		}
		
		int real1 = c1.getRealPart();
		int real2 = c2.getRealPart();
		int imag1 = c1.getImaginaryPart();
		int imag2 = c2.getImaginaryPart();
		
		int denom = real2 * real2 + imag2 * imag2;
		
		return new ComplexNumber((( real1 * real2) + (imag1 * imag2))/denom, 
				((imag1 * real2) - (real1 * imag2))/denom);
	}
	
	public static ComplexNumber negate(ComplexNumber c){
		if (c == null) {
			System.out.println("Error: Object is null");
			System.exit(0);
		}
		
		return new ComplexNumber( -1 * c.getRealPart(), -1 * c.getImaginaryPart());
	}
	
	public void add(ComplexNumber c){
		setAll(add(this, c));
	}
	
	public void subtract(ComplexNumber c){
		setAll(subtract(this, c));
	}
	
	public void multiply(ComplexNumber c){
		setAll(multiply(this, c));
	}
	
	public void divide(ComplexNumber c){
		setAll(divide(this, c));
	}
	
	public void negate(){
		setAll(negate(this));
	}
	
	public int getRealPart(){
		
		return this.real;
	}
	
	public void setRealPart(int real){
		this.real = real;
	}
	
	public int getImaginaryPart(){
		return this.imaginary;
	}
	
	public void setImaginaryPart(int imaginary){
		this.imaginary = imaginary;
	}
	
	public void setAll(ComplexNumber c){
		this.real = c.getRealPart();
		this.imaginary = c.getImaginaryPart();
	}
	
	public String ToString(){
		if(real == 0 && imaginary == 0){
			return "0";
		}
		else if(real == 0) {
			return "i" + imaginary;
		}
		else if(imaginary == 0){
			return "" + real;
		}
		return real + " + i" + imaginary;  
	}
	
	
	public boolean equals(ComplexNumber other){
		if(other == null){
			return false;
		}
		 return imaginary == other.getImaginaryPart()
				 && real == other.getRealPart();	
	}
	
}
