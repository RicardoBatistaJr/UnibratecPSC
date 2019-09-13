package Interfaces;

public interface InterfaceDAO {
	public void inserir(InterfaceEntidade pEntidade);

	public void alterar(InterfaceEntidade pEntidade);

	public void excluirPorChavePrimaria(Class pClasse, Object pPrimaryKey);

	public void excluirPorObjeto(InterfaceEntidade pEntidade);

	public InterfaceEntidade consultarPorChavePrimaria(Class pClasse,
			Object pPrimaryKey);

	public InterfaceEntidade consultarPorObjeto(InterfaceEntidade pEntidade);
}
