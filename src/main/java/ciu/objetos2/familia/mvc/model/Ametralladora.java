package ciu.objetos2.familia.mvc.model;

public class Ametralladora extends Arma {
	
	public Ametralladora(Integer puntosDeHonorArma, Integer potenciaDestructiva) {
		super(puntosDeHonorArma, potenciaDestructiva);
	}

	public Ametralladora() {
		super(Integer.valueOf(50),Integer.valueOf(100));
	}
	
}
