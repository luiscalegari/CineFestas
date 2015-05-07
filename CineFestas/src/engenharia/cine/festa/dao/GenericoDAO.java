package engenharia.cine.festa.dao;

import engenharia.cine.festa.exception.PersistenciaException;
import java.util.List;

/**
 *
 * @author LuisFernando
 */
public interface GenericoDAO<T> {

    public void inserir(T obj) throws PersistenciaException;
    
    public void atualizar(T obj) throws PersistenciaException;
    
    public void excluir (Integer codigo) throws PersistenciaException;
    
    List<T> listarTodos() throws PersistenciaException;
    
    T buscarPorCodigo(Integer codigo) throws PersistenciaException;
}
