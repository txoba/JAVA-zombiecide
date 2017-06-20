package zombicide;

public class HORDA {
	
	// Un ZOMBIE pertenece a una HORDA
	
private int respawn;

// super() llama al constructor padre sin argumentos.
	
	public HORDA() {
		super();
	}

	public int getRespawn() {
		return respawn;
	}
	
	public void setRespawn(int respawn) {
		this.respawn = respawn;
	}
	
	
	// METODOS:
	
	//-camina: M�todo que hace que el respawn de un zombie reste 1 paso
	//para su siguiente ataque.
	
	public void camina(){
		respawn--;
	}
	
	//-resetRespawn: M�todo que despu�s de morder un zombie reinicializa
	//su respawn.

	public void resetRespawn(){
		respawn = 3;
	}
	
	
	
	

}
