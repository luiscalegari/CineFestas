package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
            String sSQL = ""
                    + "INSERT INTO CLIENTE("
                    + " NOME, CEP, ENDERECO, BAIRRO, CIDADE, CPF, RG, SEXO, DTNASCIMENTO, DTCADASTRO, INADIMPLENCIA, ESTADO, TELEFONE, CELULAR )"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, CURDATE(), ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setString(1, obj.getNome());
            statement.setInt(2, Integer.parseInt(obj.getCep().replace("-", "")));
            statement.setString(3, obj.getEndereco());
            statement.setString(4, obj.getBairro());
            statement.setString(5, obj.getCidade());
            statement.setString(6, obj.getCpf());
            statement.setString(7, obj.getRg());
            statement.setString(8, obj.getSexo().toString());
            statement.setDate(9, new Date(obj.getDtNascimento().getTime()));
            statement.setBoolean(10, false);
            statement.setString(11, obj.getEstado());
            statement.setString(12, obj.getTelefone());
            statement.setString(13, obj.getCelular());

            statement.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void atualizar(ClienteDTO obj) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sSQL = ""
                    + "UPDATE CLIENTE"
                    + " SET NOME = ?, CEP = ?, ENDERECO = ?, BAIRRO = ?,"
                    + " CIDADE = ?, CPF = ?, RG = ?, SEXO = ?, DTNASCIMENTO = ?,"
                    + " DTCADASTRO = ?, INADIMPENCIA = ?, TELEFONE = ?, CELULAR = ?, ESTADO = ?"
                    + " WHERE CODIGO = ?";

            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setString(1, obj.getNome());
            statement.setInt(2, Integer.parseInt(obj.getCep().replace("-", "")));
            statement.setString(3, obj.getEndereco());
            statement.setString(4, obj.getBairro());
            statement.setString(5, obj.getCidade());
            statement.setString(6, obj.getCpf());
            statement.setString(7, obj.getRg());
            statement.setString(8, obj.getSexo().toString());
            statement.setDate(9, new Date(obj.getDtNascimento().getTime()));
            statement.setBoolean(10, false);
            statement.setString(11, obj.getEstado());
            statement.setString(12, obj.getTelefone());
            statement.setString(13, obj.getCelular());

            statement.execute();
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
            String sSQl = "DELETE FROM CLIENTE WHERE CODIGO  = ?";
            PreparedStatement statement = connection.prepareStatement(sSQl);
            statement.setInt(1, codigo);
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<ClienteDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        ClienteDTO clienteDTO = null;
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "SELECT * FROM CLIENTE WHERE CODIGO = ?";
            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                clienteDTO = new ClienteDTO();
                clienteDTO.setBairro(rs.getString("BAIRRO"));
                clienteDTO.setCep(String.valueOf(rs.getInt("CEP")));
                clienteDTO.setCidade(rs.getString("CIDADE"));
                clienteDTO.setCodigo(rs.getInt("CODIGO"));
                clienteDTO.setCpf(rs.getString("CPF"));
                clienteDTO.setDtCadastro(rs.getDate("DTCADASTRO"));
                clienteDTO.setDtNascimento(rs.getDate("DTNASCIMENTO"));
                clienteDTO.setEndereco(rs.getString("ENDERECO"));
                clienteDTO.setInadimplencia(rs.getBoolean("INADIMPLENCIA"));
                clienteDTO.setNome(rs.getString("NOME"));
                clienteDTO.setRg(rs.getString("RG"));
                clienteDTO.setSexo(rs.getString("SEXO").charAt(0));
                clienteDTO.setEstado(rs.getString("ESTADO"));
                clienteDTO.setTelefone(rs.getString("TELEFONE"));
                clienteDTO.setCelular(rs.getString("CELULAR"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return clienteDTO;
    }

    public List<ClienteDTO> filtraCliente(String nome, String cpf, String rg) throws PersistenciaException {
        List<ClienteDTO> listaCliente = new ArrayList<ClienteDTO>();
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = ""
                    + "SELECT * FROM CLIENTE";
            boolean ultimo = false;
            if (!nome.isEmpty()) {
                sSQL += " WHERE NOME LIKE ?";
                ultimo = true;
            }

            if (!cpf.equals("   .   .   -  ")) {
                if (!ultimo) {
                    sSQL += " WHERE CPF = ?";
                    ultimo = true;
                } else {
                    sSQL += " AND CPF = ?";
                }
            }

            if (!rg.equals("  .   .   - ")) {
                if (!ultimo) {
                    sSQL += "WHERE RG = ?";
                    ultimo = true;
                } else {
                    sSQL += " AND RG = ?";
                }
            }
            sSQL += " ORDER BY NOME";

            PreparedStatement statement = connection.prepareStatement(sSQL);
            int cont = 0;
            if (!nome.isEmpty()) {
                statement.setString(++cont, "%" + nome + "%");
            }

            if (!cpf.equals("   .   .   -  ")) {
                statement.setString(++cont, cpf);
            }

            if (!rg.equals("  .   .   - ")) {
                statement.setString(++cont, rg);
            }

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setBairro(rs.getString("BAIRRO"));
                clienteDTO.setCep(String.valueOf(rs.getInt("CEP")));
                clienteDTO.setCidade(rs.getString("CIDADE"));
                clienteDTO.setCodigo(rs.getInt("CODIGO"));
                clienteDTO.setCpf(rs.getString("CPF"));
                clienteDTO.setDtCadastro(rs.getDate("DTCADASTRO"));
                clienteDTO.setDtNascimento(rs.getDate("DTNASCIMENTO"));
                clienteDTO.setEndereco(rs.getString("ENDERECO"));
                clienteDTO.setInadimplencia(rs.getBoolean("INADIMPLENCIA"));
                clienteDTO.setNome(rs.getString("NOME"));
                clienteDTO.setRg(rs.getString("RG"));
                clienteDTO.setSexo(rs.getString("SEXO").charAt(0));
                clienteDTO.setEstado(rs.getString("ESTADO"));
                clienteDTO.setTelefone(rs.getString("TELEFONE"));
                clienteDTO.setCelular(rs.getString("CELULAR"));

                listaCliente.add(clienteDTO);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return listaCliente;
    }

}
