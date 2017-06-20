package zombicide;


// Cuando un superviviente demuestre valor podra tener un Arma y cuando le demos el arma
// será SARTEN, además el arma tendrá valores de daño=1 , distancia=0

public class Arma {
	private int daño = 1;
    private int distancia = 0;
    private TipoArma tipoarma = TipoArma.SARTEN;

    //public Arma() {
        //this(1, 0 , TipoArma.SARTEN);
    //}
    
    public Arma(){
    	// constructor donde se inicie con SARTEN
    }

    public Arma(int daño, int distancia) {
        this.daño=daño;
        this.distancia=distancia;
    }

    public Arma(int daño, int distancia, TipoArma tipoarma) {
        this.daño = daño;
        this.distancia = distancia;
        this.tipoarma = tipoarma;
    }
    
    // Frase de llamado

    public void armarse(){
        System.out.println(
                "SOLO LOS COBARDES SE QUEDAN A MIRAR !"
        );
    }

    //GETTERS
    
    public int getDaño() {
        return daño;
    }

    public int getDistancia() {
        return distancia;
    }

    public TipoArma getTipo() {
        return tipoarma;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setTipo(TipoArma tipoarma) {
        this.tipoarma = tipoarma;
    }

   


}
