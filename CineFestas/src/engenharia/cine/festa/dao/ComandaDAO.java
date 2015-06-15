package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ComandaDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class ComandaDAO implements GenericoDAO<ComandaDTO> {

    @Override
    public void inserir(ComandaDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(ComandaDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "update comanda set numero = ?, status = ? where numero = ?";
            PreparedStatement ps = connection.prepareStatement(sSQL);
            ps.setInt(1, obj.getNumero());
            ps.setBoolean(2, obj.isStatus());
            ps.setInt(3, obj.getNumero());
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ComandaDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComandaDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        try {
            ComandaDTO cdto = new ComandaDTO();
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "select numero, status from comanda where numero = ?";
            PreparedStatement ps = connection.prepareStatement(sSQL);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cdto.setNumero(rs.getInt("numero"));
                cdto.setStatus(rs.getBoolean("status"));
            }
            connection.close();
            return cdto;
        } catch (Exception e) {
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }

}
