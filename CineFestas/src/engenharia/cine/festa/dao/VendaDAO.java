package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.VendaDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class VendaDAO implements GenericoDAO<VendaDTO> {

    @Override
    public void inserir(VendaDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(VendaDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendaDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VendaDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int inserirEPegaCodigo(VendaDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            int generatedkey;
            String sSQL = ""
                    + "insert into venda (comanda, total)"
                    + " values(?, ?)";
            PreparedStatement st = connection.prepareStatement(sSQL, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getComanda());
            st.setFloat(2, obj.getTotal());
            st.execute();

            ResultSet rs = st.getGeneratedKeys();
            generatedkey = rs.next() ? rs.getInt(1) : -1;
            connection.close();
            return generatedkey;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }
}
