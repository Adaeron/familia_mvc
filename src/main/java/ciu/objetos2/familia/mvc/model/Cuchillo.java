package ciu.objetos2.familia.mvc.model;

public class Cuchillo extends Arma {
	
	public Cuchillo(Integer puntosDeHonorArma, Integer potenciaDestructiva) {
		super(puntosDeHonorArma, potenciaDestructiva);
	}

	public Cuchillo() {
		super(Integer.valueOf(10),Integer.valueOf(1));
	}

}
