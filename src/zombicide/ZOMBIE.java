package zombicide;

//Al convertirse, Eugiene ha visto que un zombie pertenece autom�ticamente a
//una HORDA. Eso creo que debe significar que la clase ZOMBIE tiene un new
//dentro.

public class ZOMBIE {
	HORDA horda = new HORDA();
	private int da�o = 1;
	private int movimiento = 3;
	private TipodeZombie tipo = TipodeZombie.CAMINANTE;
	
	//Y adem�s, cu�ndo un zombie se crea autom�ticamente empieza a caminar, eso
	//significa que est� dispuesto a morder.
	
	
	public ZOMBIE() {
		horda.camina();
	}
	
	// super() llama al constructor padre sin argumentos.
	
	public ZOMBIE(int da�o, int movimiento, TipodeZombie tipo) {
		super();
		this.da�o = da�o;
		this.movimiento = movimiento;
		this.tipo = tipo;
		horda.camina();
	}
	
	//GETTERS
	public HORDA getHorda() {
		return horda;
	}

	public int getDa�o() {
		return da�o;
	}
	
	public int getMovimiento() {
		return movimiento;
	}
	
	public TipodeZombie getTipo() {
		return tipo;
	}
	
	
	
	//SETTERS
	public void setHorda(HORDA horda) {
		this.horda = horda;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setTipo(TipodeZombie tipo) {
		this.tipo = tipo;
	}


	

	

}
