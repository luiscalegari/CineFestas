package engenharia.cine.festa.dao;

import com.sun.beans.finder.PrimitiveWrapperMap;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import engenharia.cine.festa.util.Utilidades;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class FestaDAO implements GenericoDAO<FestaDTO> {

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
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = ""
                    + "UPDATE FESTA"
                    + " SET DTEVENTO = ?, DTCONCEPCAO = ?,"
                    + " DESCRICAO ?, ATRACAO = ?, PUBLICOESPERADO = ?,"
                    + " RESPONSAVEISEVENTO = ?, INVESTIMENTOINICIAL = ? "
                    + " WHERE CODIGO = ?";
            PreparedStatement st = connection.prepareStatement(sSQL);
            st.setDate(1, new Date(obj.getDtevento().getTime()));
            st.setDate(2, new Date(obj.getDtconcepcao().getTime()));
            st.setString(3, obj.getDescricao());
            st.setString(4, obj.getAtracao());
            st.setInt(5, obj.getPublicoEsperado());
            st.setString(6, obj.getResponsaveisEvento());
            st.setFloat(7, obj.getInvestimentoInicial());
            st.setInt(8, obj.getCodigo());
            st.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "DELETE FROM FESTA WHERE CODIGO = ?";
            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setInt(1, codigo);
            statement.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<FestaDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FestaDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        FestaDTO festaDTO = null;
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "SELECT * FROM FESTA WHERE CODIGO = ?";
            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                festaDTO = new FestaDTO();
                festaDTO.setAtracao(rs.getString("ATRACAO"));
                festaDTO.setCodigo(rs.getInt("CODIGO"));
                festaDTO.setDescricao(rs.getString("DESCRICAO"));
                festaDTO.setDtcadastro(rs.getDate("DTCADASTRO"));
                festaDTO.setDtconcepcao(rs.getDate("DTCONCEPCAO"));
                festaDTO.setDtevento(rs.getDate("DTEVENTO"));
                festaDTO.setInvestimentoInicial(rs.getFloat("INVESTIMENTOINICIAL"));
                festaDTO.setPublicoEsperado(rs.getInt("PUBLICOESPERADO"));
                festaDTO.setResponsaveisEvento(rs.getString("RESPONSAVEISEVENTO"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return festaDTO;
    }

    public List<FestaDTO> filtraFesta(String sDtEvento, String sAtracao) throws PersistenciaException {
        List<FestaDTO> listaFesta = new ArrayList<FestaDTO>();
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            boolean ultimo = false;
            String sSQL = "SELECT * FROM FESTA";
            if (!sDtEvento.equals("  /  /    ")) {
                sSQL += " WHERE DTEVENTO = ?";
                ultimo = true;
            }
            if (!sAtracao.isEmpty()) {
                if (!ultimo) {
                    sSQL += " WHERE ATRACAO LIKE ?";
                    ultimo = true;
                } else {
                    sSQL += " AND ATRACAO LIKE ?";
                }
            }
            sSQL += " ORDER BY ATRACAO";

            PreparedStatement statement = connection.prepareCall(sSQL);
            int cont = 0;
            if (!sDtEvento.equals("  /  /    ")) {
                statement.setDate(++cont, (Date) Utilidades.dateFormat.parse(sDtEvento));
            }
            if (!sAtracao.isEmpty()) {
                statement.setString(++cont, "%" + sAtracao + "%");
            }

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                FestaDTO festaDTO = new FestaDTO();
                festaDTO.setAtracao(rs.getString("ATRACAO"));
                festaDTO.setCodigo(rs.getInt("CODIGO"));
                festaDTO.setDescricao(rs.getString("DESCRICAO"));
                festaDTO.setDtcadastro(rs.getDate("DTCADASTRO"));
                festaDTO.setDtconcepcao(rs.getDate("DTCONCEPCAO"));
                festaDTO.setDtevento(rs.getDate("DTEVENTO"));
                festaDTO.setInvestimentoInicial(rs.getFloat("INVESTIMENTOINICIAL"));
                festaDTO.setPublicoEsperado(rs.getInt("PUBLICOESPERADO"));
                festaDTO.setResponsaveisEvento(rs.getString("RESPONSAVEISEVENTO"));

                listaFesta.add(festaDTO);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return listaFesta;
    }

}
