package zombicide;


public class Supervivientes {
	Arma arma;
	private int vidas=3;
	private int nivel=0;
	private SkillPersonaje skill=SkillPersonaje.RAPIDO;
	private TipoArma tipoarma=TipoArma.SARTEN;
	
// Por defecto
public Supervivientes(){
	
}

// A�adir cada parametro

public Supervivientes(int vidas, int nivel) {
	this.vidas = vidas;
	this.nivel = nivel;
}

public Supervivientes(int vidas, int nivel, SkillPersonaje skill){
	this.vidas = vidas;
	this.nivel = nivel;
	this.skill = skill;

}

public Supervivientes(int vidas, int nivel, SkillPersonaje skill, TipoArma tipoarma) {
	this.vidas = vidas;
	this.nivel = nivel;
	this.skill = skill;
	this.tipoarma = tipoarma;
}


// GETTERS
public Arma getArma() {
	return arma;
}
public int getVidas(){
	return vidas;
}
public int getNivel(){
	return nivel;
}
public SkillPersonaje getSkill(){
return skill;
}
public TipoArma getTipoArma() {
	return tipoarma;
}

// SETTERS

public void setArma(Arma arma) {
	this.arma = arma;
}

public void setVidas(int vidas){
	this.vidas = vidas;
}
public void setNivel(int nivel){
	this.nivel = nivel;
}
public void setSkill(SkillPersonaje skill){
	this.skill = skill;
}
public void setTipoArma(TipoArma tipo) {
	this.tipoarma = tipo;
}




// METODOS

// -tieneArma: M�todo que nos dir� si el superviviente est� armado o no
public boolean tieneArma(){
    if(this.arma != null){
    	// Tiene arma
        return true;
    }else{
    	// No tiene arma
        return false;
    }
}

//-deleteArma: M�todo que elimina el arma al superviviente, porque ya
//no es merecedor de nuestra confianza.

public void deleteArma(){
    this.arma = null;
}
}







