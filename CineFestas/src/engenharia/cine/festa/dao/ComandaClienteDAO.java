package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ComandaClienteDTO;
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
public class ComandaClienteDAO implements GenericoDAO<ComandaClienteDTO> {

    @Override
    public void inserir(ComandaClienteDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(ComandaClienteDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "update comandacliente set ";
            sSQL += " total = ?, valorPago = ? ";
            sSQL += "where comanda = ? and cliente = ? and festa = ?";
            PreparedStatement ps = connection.prepareStatement(sSQL);
            ps.setFloat(1, obj.getTotal());
            ps.setFloat(2, obj.getValorPago());
            ps.setInt(3, obj.getComanda());
            ps.setInt(4, obj.getCliente());
            ps.setInt(5, obj.getFesta());
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
            throw new PersistenciaException(e.getLocalizedMessage());
        }
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

    public ComandaClienteDTO buscaPorComanda(Integer comanda) throws PersistenciaException {
        try {
            ComandaClienteDTO ccdto = new ComandaClienteDTO();
            Connection c = ConexaoUtil.getInstance().getConnection();
            String sSQL = "";
            sSQL = "select com.numero, cc.cliente, cc.festa, f.codigo, cc.total, cc.valorPago from comandacliente cc";
            sSQL += " inner join festa f on f.codigo = cc.festa";
            sSQL += " inner join comanda com on com.numero = cc.comanda";
            sSQL += " where curdate() in (f.dtEvento) and com.numero = ?";

            PreparedStatement st = c.prepareStatement(sSQL);
            st.setInt(1, comanda);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ccdto.setComanda(rs.getInt("numero"));
                ccdto.setCliente(rs.getInt("cliente"));
                ccdto.setFesta(rs.getInt("festa"));
                ccdto.setTotal(rs.getFloat("total"));
                ccdto.setValorPago(rs.getFloat("valorPago"));
            }
            c.close();
            return ccdto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }

}
