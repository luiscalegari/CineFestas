package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ProdutoDTO;
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
public class ProdutoDAO implements GenericoDAO<ProdutoDTO> {

    @Override
    public void inserir(ProdutoDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(ProdutoDTO obj) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProdutoDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProdutoDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        try {
            ProdutoDTO pdto = new ProdutoDTO();
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "select * from produto where codigo = ?";
            PreparedStatement st = connection.prepareCall(sSQL);
            st.setInt(1, codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                pdto.setCodigo(rs.getInt("codigo"));
                pdto.setDescricao(rs.getString("descricao"));
                pdto.setEstoque(rs.getInt("estoque"));
                pdto.setPrecoVenda(rs.getFloat("precoVenda"));
                pdto.setPrecoCompra(rs.getFloat("precoCompra"));
                pdto.setTipo(rs.getInt("tipo"));
                pdto.setClassificacao(rs.getInt("classificacao"));
            }
            connection.close();
            return pdto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }

    public List<ProdutoDTO> filtrarProduto(String codigo, String descricao) throws PersistenciaException {
        List<ProdutoDTO> listaProduto = new ArrayList<ProdutoDTO>();
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "select * from produto";
            boolean ultimo = false;
            if (!codigo.isEmpty()) {
                sSQL += " where codigo = ?";
                ultimo = true;
            }

            if (!descricao.isEmpty()) {
                if (!ultimo) {
                    sSQL += " where descricao like ?";
                    ultimo = true;
                } else {
                    sSQL += " and descricao like ?";
                }
            }

            sSQL += " order by descricao";

            PreparedStatement st = connection.prepareCall(sSQL);
            int cont = 0;
            if (!codigo.isEmpty()) {
                st.setInt(++cont, Integer.valueOf(codigo));
            }

            if (!descricao.isEmpty()) {
                st.setString(++cont, "%" + descricao + "%");
            }

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ProdutoDTO pdto = new ProdutoDTO();
                pdto.setCodigo(rs.getInt("codigo"));
                pdto.setDescricao(rs.getString("descricao"));
                pdto.setEstoque(rs.getInt("estoque"));
                pdto.setPrecoVenda(rs.getFloat("precoVenda"));
                pdto.setPrecoCompra(rs.getFloat("precoCompra"));
                pdto.setTipo(rs.getInt("tipo"));
                pdto.setClassificacao(rs.getInt("classificacao"));

                listaProduto.add(pdto);
            }
            return listaProduto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getLocalizedMessage());
        }
    }

}
