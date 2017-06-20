package zombicide;


// Cuando un superviviente demuestre valor podra tener un Arma y cuando le demos el arma
// ser� SARTEN, adem�s el arma tendr� valores de da�o=1 , distancia=0

public class Arma {
	private int da�o = 1;
    private int distancia = 0;
    private TipoArma tipoarma = TipoArma.SARTEN;

    //public Arma() {
        //this(1, 0 , TipoArma.SARTEN);
    //}
    
    public Arma(){
    	// constructor donde se inicie con SARTEN
    }

    public Arma(int da�o, int distancia) {
        this.da�o=da�o;
        this.distancia=distancia;
    }

    public Arma(int da�o, int distancia, TipoArma tipoarma) {
        this.da�o = da�o;
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
    
    public int getDa�o() {
        return da�o;
    }

    public int getDistancia() {
        return distancia;
    }

    public TipoArma getTipo() {
        return tipoarma;
    }

    public void setDa�o(int da�o) {
        this.da�o = da�o;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setTipo(TipoArma tipoarma) {
        this.tipoarma = tipoarma;
    }

   


}
