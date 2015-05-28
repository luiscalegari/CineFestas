package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ItensVendaDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class ItensVendaDAO implements GenericoDAO<ItensVendaDTO> {

    @Override
    public void inserir(ItensVendaDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "insert into itensvenda(venda, produto, qtde, valor) values(?, ?, ?, ?)";
            PreparedStatement st = connection.prepareStatement(sSQL);
            st.setInt(1, obj.getVenda());
            st.setInt(2, obj.getProduto());
            st.setInt(3, obj.getQtde());
            st.setFloat(4, obj.getValor());
            st.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }

    @Override
    public void atualizar(ItensVendaDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItensVendaDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItensVendaDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ItensVendaDTO> filtrarComanda(int comanda) throws PersistenciaException {
        try {
            List<ItensVendaDTO> listItensVendaDTO = new ArrayList<ItensVendaDTO>();
            Connection c = ConexaoUtil.getInstance().getConnection();
            String sSQl = "";
            sSQl = "select iv.venda, iv.produto, iv.qtde, iv.valor from itensvenda iv"
                    + " inner join venda ven on ven.numero = iv.venda"
                    + " inner join comanda com on com.numero = ven.comanda and com.numero = ?"
                    + " inner join comandacliente cc on cc.comanda = com.numero"
                    + " inner join festa f on f.codigo = cc.festa and curdate() in (f.dtEvento)";

            PreparedStatement st = c.prepareStatement(sSQl);
            st.setInt(1, comanda);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ItensVendaDTO ivdto = new ItensVendaDTO();
                ivdto.setVenda(rs.getInt("venda"));
                ivdto.setProduto(rs.getInt("produto"));
                ivdto.setQtde(rs.getInt("qtde"));
                ivdto.setValor(rs.getFloat("valor"));

                listItensVendaDTO.add(ivdto);
            }
            c.close();
            return listItensVendaDTO;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }
}
