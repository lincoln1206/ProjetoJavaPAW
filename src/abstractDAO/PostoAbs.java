package abstractDAO;

import entidades.Posto;

public abstract class PostoAbs extends CrudGenerico<Posto> {

	@SuppressWarnings("unused")
	public void verificaPosto24horas() {
	}

	@SuppressWarnings("unused")
	public void obterDadosPosto() {
	}

	@SuppressWarnings("unused")
	private boolean temCombustivelMaisBarato() {
		return false;
	}

}
