package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ComandaClienteDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class ComandaClienteDAO implements GenericoDAO<ComandaClienteDTO>{

    @Override
    public void inserir(ComandaClienteDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(ComandaClienteDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ComandaClienteDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComandaClienteDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
