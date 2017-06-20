package zombicide;

//Al convertirse, Eugiene ha visto que un zombie pertenece automáticamente a
//una HORDA. Eso creo que debe significar que la clase ZOMBIE tiene un new
//dentro.

public class ZOMBIE {
	HORDA horda = new HORDA();
	private int daño = 1;
	private int movimiento = 3;
	private TipodeZombie tipo = TipodeZombie.CAMINANTE;
	
	//Y además, cuándo un zombie se crea automáticamente empieza a caminar, eso
	//significa que está dispuesto a morder.
	
	
	public ZOMBIE() {
		horda.camina();
	}
	
	// super() llama al constructor padre sin argumentos.
	
	public ZOMBIE(int daño, int movimiento, TipodeZombie tipo) {
		super();
		this.daño = daño;
		this.movimiento = movimiento;
		this.tipo = tipo;
		horda.camina();
	}
	
	//GETTERS
	public HORDA getHorda() {
		return horda;
	}

	public int getDaño() {
		return daño;
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

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setTipo(TipodeZombie tipo) {
		this.tipo = tipo;
	}


	

	

}
