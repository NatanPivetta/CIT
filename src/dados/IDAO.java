package dados;

import java.util.List;

public interface IDAO<E> {
  
    public void inserir(E o);
    public void remover(E o);
    public void atualizar(E o);
    public E pesquisarPorID(int id);
    public List<E> listarTodos();

}
