package pucrs.alpro2;

public class Somador {
	private int a;
	private int b;
	
	public Somador(){
	}
	
	public Somador(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSoma(){
		return a + b;
	}
	@Override
	public String toString() {
		return String.format("Somador [a=%s, b=%s]", a, b);
	}
	
}
