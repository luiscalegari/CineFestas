package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class FestaDAO implements GenericoDAO<FestaDTO>{

    @Override
    public void inserir(FestaDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = ""
                    + "INSERT INTO FESTA("
                    + " DTEVENTO, DTCONCEPCAO, DTCADASTRO, DESCRICAO, ATRACAO, PUBLICOESPERADO, RESPONSAVEISEVENTO, INVESTIMENTOINICIAL)"
                    + " VALUES(?, ?, CURDATE(), ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setDate(1, new Date(obj.getDtevento().getTime()));
            statement.setDate(2, new Date(obj.getDtconcepcao().getTime()));
            statement.setString(3, obj.getDescricao());
            statement.setString(4, obj.getAtracao());
            statement.setInt(5, obj.getPublicoEsperado());
            statement.setString(6, obj.getResponsaveisEvento());
            statement.setFloat(7, obj.getInvestimentoInicial());
            
            statement.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void atualizar(FestaDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FestaDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FestaDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
