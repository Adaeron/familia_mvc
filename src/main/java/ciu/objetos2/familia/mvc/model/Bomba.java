package ciu.objetos2.familia.mvc.model;

public class Bomba extends Arma {
	
	private static final Integer POTENCIA_DESTRUCTIVA = Integer.valueOf(1000);
	private static final Integer PUNTOS_DE_HONOR = Integer.valueOf(0);
	
	public Bomba(Integer puntosDeHonorArma, Integer potenciaDestructiva) {
		super(PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}
	
	public Bomba(){
		super(PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}
}
