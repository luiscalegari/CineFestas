package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
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
                    + "insert into cliente("
                    + " nome, cep, endereco, bairro, cidade, cpf, rg, sexo, dtnascimento, dtcadastro, inadimplencia, estado, telefone, celular )"
                    + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, curdate(), ?, ?, ?, ?)";

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
                    + "update cliente"
                    + " set nome = ?,"
                    + " cep = ?,"
                    + " endereco = ?,"
                    + " bairro = ?,"
                    + " cidade = ?,"
                    + " cpf = ?,"
                    + " rg = ?,"
                    + " sexo = ?,"
                    + " dtnascimento = ?,"
                    + " inadimplencia = ?,"
                    + " telefone = ?,"
                    + " celular = ?,"
                    + " estado = ?"
                    + " where codigo = ?";

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
            statement.setString(11, obj.getTelefone());
            statement.setString(12, obj.getCelular());
            statement.setString(13, obj.getEstado());
            statement.setInt(14, obj.getCodigo());

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
            String sSQl = "delete from cliente where codigo  = ?";
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
            String sSQL = "select * from cliente where codigo = ?";
            PreparedStatement statement = connection.prepareStatement(sSQL);
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                clienteDTO = new ClienteDTO();
                clienteDTO.setBairro(rs.getString("bairro"));
                clienteDTO.setCep(String.valueOf(rs.getInt("cep")));
                clienteDTO.setCidade(rs.getString("cidade"));
                clienteDTO.setCodigo(rs.getInt("codigo"));
                clienteDTO.setCpf(rs.getString("cpf"));
                clienteDTO.setDtCadastro(rs.getDate("dtcadastro"));
                clienteDTO.setDtNascimento(rs.getDate("dtnascimento"));
                clienteDTO.setEndereco(rs.getString("endereco"));
                clienteDTO.setInadimplencia(rs.getBoolean("inadimplencia"));
                clienteDTO.setNome(rs.getString("nome"));
                clienteDTO.setRg(rs.getString("rg"));
                clienteDTO.setSexo(rs.getString("sexo").charAt(0));
                clienteDTO.setEstado(rs.getString("estado"));
                clienteDTO.setTelefone(rs.getString("telefone"));
                clienteDTO.setCelular(rs.getString("celular"));
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
                    + "select * from cliente";
            boolean ultimo = false;
            if (!nome.isEmpty()) {
                sSQL += " where nome like ?";
                ultimo = true;
            }

            if (!cpf.equals("   .   .   -  ")) {
                if (!ultimo) {
                    sSQL += " where cpf = ?";
                    ultimo = true;
                } else {
                    sSQL += " and cpf = ?";
                }
            }

            if (!rg.isEmpty()) {
                if (!ultimo) {
                    sSQL += "where rg = ?";
                    ultimo = true;
                } else {
                    sSQL += " and rg = ?";
                }
            }
            sSQL += " order by nome";

            PreparedStatement statement = connection.prepareStatement(sSQL);
            int cont = 0;
            if (!nome.isEmpty()) {
                statement.setString(++cont, "%" + nome + "%");
            }

            if (!cpf.equals("   .   .   -  ")) {
                statement.setString(++cont, cpf);
            }

            if (!rg.isEmpty()) {
                statement.setString(++cont, rg);
            }

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setBairro(rs.getString("bairro"));
                clienteDTO.setCep(String.valueOf(rs.getInt("cep")));
                clienteDTO.setCidade(rs.getString("cidade"));
                clienteDTO.setCodigo(rs.getInt("codigo"));
                clienteDTO.setCpf(rs.getString("cpf"));
                clienteDTO.setDtCadastro(rs.getDate("dtcadastro"));
                clienteDTO.setDtNascimento(rs.getDate("dtnascimento"));
                clienteDTO.setEndereco(rs.getString("endereco"));
                clienteDTO.setInadimplencia(rs.getBoolean("inadimplencia"));
                clienteDTO.setNome(rs.getString("nome"));
                clienteDTO.setRg(rs.getString("rg"));
                clienteDTO.setSexo(rs.getString("sexo").charAt(0));
                clienteDTO.setEstado(rs.getString("estado"));
                clienteDTO.setTelefone(rs.getString("telefone"));
                clienteDTO.setCelular(rs.getString("celular"));

                listaCliente.add(clienteDTO);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return listaCliente;
    }

    public ClienteDTO buscarPorCpfRg(String cpf, String rg) throws PersistenciaException {
        ClienteDTO cdto = null;
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = ""
                    + "select codigo, nome, cpf, rg from cliente";
            boolean ultimo = false;
            if (!cpf.equals("   .   .   -  ")) {
                sSQL += " where cpf = ?";
                ultimo = true;
            }

            if (!rg.isEmpty()) {
                if (ultimo) {
                    sSQL += " and rg = ?";
                } else {
                    sSQL += " where rg = ?";
                }
            }

            PreparedStatement st = connection.prepareStatement(sSQL);
            int cont = 0;
            if (!cpf.equals("   .   .   -  ")) {
                st.setString(++cont, cpf);
            }
            if (!rg.isEmpty()) {
                st.setString(++cont, rg);
            }
            if (!cpf.equals("   .   .   -  ") || !rg.isEmpty()) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    cdto = new ClienteDTO();
                    cdto.setCodigo(rs.getInt("codigo"));
                    cdto.setCpf(rs.getString("cpf"));
                    cdto.setRg(rs.getString("rg"));
                    cdto.setNome(rs.getString("nome"));
                }
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
        return cdto;
    }

    public void vincularComanda(String sComanda, String sCodigo) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sSQL = "CALL PRC_VINCULAR_COMANDA(?, ?, ?)";
            CallableStatement statement = connection.prepareCall(sSQL);
            statement.setInt(1, Integer.parseInt(sComanda));
            statement.setInt(2, Integer.parseInt(sCodigo));
            statement.registerOutParameter(3, Types.INTEGER);
            statement.execute();

            Integer param = statement.getInt(3);
            if (param == 1) throw new PersistenciaException("Comanda já está em uso!");
            if (param == 2) throw new PersistenciaException("Comanda inválida!");
            if (param == 3) throw new PersistenciaException("Falha ao buscar festa!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

}
