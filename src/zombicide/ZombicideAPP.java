package zombicide;


public class ZombicideAPP {
	
public static void main (String[] args){
	
	//Recluta a 5 supervivientes, cada uno con diferentes habilidades de personaje.
	//Recuerda ajustar las armas para que tengan diferentes daños
	//y distancias: 
	
	// ARMA(daño,distancia,tipoarma)
		
		
		Arma SARTEN = new Arma(1, 0, TipoArma.SARTEN);
		Arma PISTOLA = new Arma(3, 1, TipoArma.PISTOLA);
		Arma ESCOPETA = new Arma(7, 2, TipoArma.ESCOPETA);
		Arma KATANA = new Arma(4, 0, TipoArma.KATANA);
		Arma BAZOKA = new Arma(15, 6, TipoArma.BAZOKA);
		
		
	// Supervivientes (Superviviente,vida,nivel,skills)	
		
		Supervivientes Glenn = new Supervivientes();
		Glenn.setArma(SARTEN);
		Supervivientes Daryl = new Supervivientes(3,2,SkillPersonaje.BUSCADOR,TipoArma.PISTOLA);
		Daryl.setArma(PISTOLA);;
		Supervivientes Negan = new Supervivientes(2,3,SkillPersonaje.AMBIDIESTRO,TipoArma.ESCOPETA);
		Negan.setArma(ESCOPETA);
		Supervivientes Rick = new Supervivientes(2,6,SkillPersonaje.FORTACHON,TipoArma.KATANA);
		Rick.setArma(KATANA);
		Supervivientes Carl = new Supervivientes(1,4,SkillPersonaje.ESCURRIDIZO,TipoArma.BAZOKA);
		Carl.setArma(BAZOKA);
		
		
	// También c rea 5 zombies en un ArrayList y assignales valores:

		
		
		ZOMBIE CAMINANTE1 = new ZOMBIE(2, 1, TipodeZombie.CAMINANTE);
		ZOMBIE CAMINANTE2 = new ZOMBIE(3, 2, TipodeZombie.CAMINANTE);
		ZOMBIE CAMINANTE3 = new ZOMBIE(3, 1, TipodeZombie.CAMINANTE);
		ZOMBIE CAMINANTE4 = new ZOMBIE(2, 3, TipodeZombie.CAMINANTE);
		ZOMBIE CAMINANTE5 = new ZOMBIE(5, 1, TipodeZombie.CAMINANTE);
	
		System.out.println("Superviviente 1;");
		System.out.println("Glenn");
		System.out.println("Vidas: " + Glenn.getVidas());
		System.out.println("Nivel: " + Glenn.getNivel());
		System.out.println("Skills: " + Glenn.getSkill());
		System.out.println("Arma: " + Glenn.getTipoArma());
		System.out.println("        Daño" + Glenn.getArma().getDaño());
		System.out.println("        Distancia" + Glenn.getArma().getDistancia());
		System.out.println();
		
		System.out.println("Superviviente 2;");
		System.out.println("Daryl");
		System.out.println("Vidas: " + Daryl.getVidas());
		System.out.println("Nivel: " + Daryl.getNivel());
		System.out.println("Skills: " + Daryl.getSkill());
		System.out.println("Arma: " + Daryl.getTipoArma());
		System.out.println("        Daño" + Daryl.getArma().getDaño());
		System.out.println("        Distancia" + Daryl.getArma().getDistancia());
		System.out.println();
		
		System.out.println("Superviviente 3;");
		System.out.println("Negal");
		System.out.println("Vidas: " + Negan.getVidas());
		System.out.println("Nivel: " + Negan.getNivel());
		System.out.println("Skills: " + Negan.getSkill());
		System.out.println("Arma: " + Negan.getTipoArma());
		System.out.println("        Daño" + Negan.getArma().getDaño());
		System.out.println("        Distancia" + Negan.getArma().getDistancia());
		System.out.println();
		
		System.out.println("Superviviente 4;");
		System.out.println("Rick");
		System.out.println("Vidas: " + Rick.getVidas());
		System.out.println("Nivel: " + Rick.getNivel());
		System.out.println("Skills: " + Rick.getSkill());
		System.out.println("Arma: " + Rick.getTipoArma());
		System.out.println("        Daño" + Rick.getArma().getDaño());
		System.out.println("        Distancia" + Rick.getArma().getDistancia());
		System.out.println();
		
		System.out.println("Superviviente 5;");
		System.out.println("Carl");
		System.out.println("Vidas: " + Carl.getVidas());
		System.out.println("Nivel: " + Carl.getNivel());
		System.out.println("Skills: " + Carl.getSkill());
		System.out.println("Arma: " + Carl.getTipoArma());
		System.out.println("        Daño" + Carl.getArma().getDaño());
		System.out.println("        Distancia" + Carl.getArma().getDistancia());
		System.out.println();
		
		System.out.println("**************************************** ZOMBIES ****************************************");
		
		System.out.println("Zombie1");
		System.out.println("Daño: " + CAMINANTE1.getDaño());
		System.out.println("Movimiento: " + CAMINANTE1.getMovimiento());
		System.out.println("Tipo: " + CAMINANTE1.getTipo());
		System.out.println("Horda:");
		System.out.println("        Respawn" + CAMINANTE1.getHorda().getRespawn());
		System.out.println();
		
		System.out.println("Zombie2");
		System.out.println("Daño: " + CAMINANTE2.getDaño());
		System.out.println("Movimiento: " + CAMINANTE2.getMovimiento());
		System.out.println("Tipo: " + CAMINANTE2.getTipo());
		System.out.println("Horda:");
		System.out.println("        Respawn" + CAMINANTE2.getHorda().getRespawn());
		System.out.println();
		
		System.out.println("Zombie3");
		System.out.println("Daño: " + CAMINANTE3.getDaño());
		System.out.println("Movimiento: " + CAMINANTE3.getMovimiento());
		System.out.println("Tipo: " + CAMINANTE3.getTipo());
		System.out.println("Horda:");
		System.out.println("        Respawn" + CAMINANTE3.getHorda().getRespawn());
		System.out.println();
		
		System.out.println("Zombie4");
		System.out.println("Daño: " + CAMINANTE4.getDaño());
		System.out.println("Movimiento: " + CAMINANTE4.getMovimiento());
		System.out.println("Tipo: " + CAMINANTE4.getTipo());
		System.out.println("Horda:");
		System.out.println("        Respawn" + CAMINANTE4.getHorda().getRespawn());
		System.out.println();
		
		System.out.println("Zombie5");
		System.out.println("Daño: " + CAMINANTE5.getDaño());
		System.out.println("Movimiento: " + CAMINANTE5.getMovimiento());
		System.out.println("Tipo: " + CAMINANTE5.getTipo());
		System.out.println("Horda:");
		System.out.println("        Respawn" + CAMINANTE5.getHorda().getRespawn());
		System.out.println();
		
		
		
		
		
		
		
		
		


	}

}
