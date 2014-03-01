package pucrs.alpro2;

public class NovoSomador extends Somador{

	private int c;
	

	public NovoSomador() {
		super();
	}

	public NovoSomador(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public int getSoma(){
		return super.getSoma() + c;
	}
}
