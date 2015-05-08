package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author LuisFernando
 */
public class ClienteDAO implements GenericoDAO<ClienteDTO> {

    @Override
    public void inserir(ClienteDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = ""
                    + "INSERT INTO CLIENTE(NOME, )";
            
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void atualizar(ClienteDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClienteDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
