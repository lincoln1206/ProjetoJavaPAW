package abstractDAO;

import java.util.List;

public abstract class CrudGenerico <T> {
	
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
	public List<T> obterLista(){
		return null;}
	
	@SuppressWarnings("unused")
	public void obterDados() {}
}
