package abstractClass;

import java.util.List;

public abstract class CrudGenerico {
	public void adicionar() {
	}

	public void remover() {
	}

	public void buscar() {
	}

	public void alterar() {
	}

	public void listar() {
	}
	
	@SuppressWarnings("unused")
	public List<Object> obterLista(){
		return null;}
	
	@SuppressWarnings("unused")
	public void obterDados() {}
}
