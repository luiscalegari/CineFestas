/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.cine.festa.dao;

import engenharia.cine.festa.dto.FuncionarioDTO;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.jdbc.ConexaoUtil;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO implements GenericoDAO<FuncionarioDTO> {

    @Override
    public void inserir(FuncionarioDTO obj) throws PersistenciaException {
        try {
            Connection conexao = ConexaoUtil.getInstance().getConnection();
            String sql = "INSERT INTO CLIENTE (nome, CEP, endereco, bairro, cidade, cpf, rg, sexo, dtnascimento, dtCadastro, inadinplencia) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, curdate(), ?)";

            PreparedStatement statement = conexao.prepareCall(sql);
            statement.setString(1, obj.getNome());
            statement.setString(1, obj.getCep());
            statement.setString(1, obj.getEndereco());
            statement.setString(1, obj.getBairro());
            statement.setString(1, obj.getCidade());
            statement.setString(1, obj.getCpf());
            statement.setString(1, obj.getRg());
            statement.setString(1, obj.getSexo().toString());
            statement.setDate(1, (java.sql.Date) obj.getDtNascimento());
            statement.setBoolean(1, obj.isInadimplencia());

            statement.execute();
            conexao.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new PersistenciaException(ex.getMessage(), ex);
        }

    }

    @Override
    public void atualizar(FuncionarioDTO obj) throws PersistenciaException {

    }

    @Override
    public void excluir(Integer codigo) throws PersistenciaException {

    }

    @Override
    public List<FuncionarioDTO> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FuncionarioDTO buscarPorCodigo(Integer codigo) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
