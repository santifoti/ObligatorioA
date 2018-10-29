

public class Sistema implements ISistema {

	@Override
	public Retorno inicializarSistema (int maxPuntos, Double coordX, Double coordY) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}
	
	@Override
	public Retorno destruirSistema() {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarAfiliado(String cedula, String nombre, String email) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno buscarAfiliado(String CI) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno listarAfiliados() {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarCanalera(String chipid, String CIafiliado, Double coordX, Double coordY) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarNodo(String nodoid, Double coordX, Double coordY) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarTramo(Double coordXi, Double coordYi, Double coordXf, Double coordYf, int perdidaCalidad) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno modificarTramo(Double coordXi, Double coordYi, Double coordXf, Double coordYf,
			int nuevoValorPerdidaCalidad) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno calidadCanalera(Double coordX, Double coordY) {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno nodosCriticos() {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno dibujarMapa() {
		return new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
	}

	
	
	
}
