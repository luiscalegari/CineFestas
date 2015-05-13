package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import engenharia.cine.festa.util.Utilidades;

/**
 *
 * @author LuisFernando
 */
public class ClienteBO {

    public void cadastrar(ClienteDTO clienteDTO) throws NegocioException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserir(clienteDTO);
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }

    public boolean validaNome(String nome) throws ValidacaoException {
        boolean ehValido = true;
        if (nome.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo nome é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaCpf(String cpf) throws ValidacaoException {
        boolean ehValido = true;
        if (cpf.equals("   .   .   -  ")) {
            ehValido = false;
            throw new ValidacaoException("Campo CPF é obrigatório !!!");
        } else if (!Utilidades.isCpf(cpf)){
            ehValido = true;
            throw new ValidacaoException("CPF inválido !!!");
        }
        return ehValido;
    }
    
    public boolean validaRg(String rg) throws ValidacaoException {
        boolean ehValido = true;
        if (rg.equals("  .   .   - ")) {
            ehValido = false;
            throw new ValidacaoException("Campo RG é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaCidade(String cidade) throws ValidacaoException {
        boolean ehValido = true;
        if (cidade.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo cidade é obrigatório !!!");
        }
        return ehValido;
    }
    
    public boolean validaCep(String cep) throws ValidacaoException {
        boolean ehValido = true;
        if (cep.equals("     -   ")) {
            ehValido = false;
            throw new ValidacaoException("Campo CEP é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaDtNasc(String dtNasc) throws ValidacaoException {
        boolean ehValido = true;
        if (dtNasc.equals("  /  /    ")) {
            ehValido = false;
            throw new ValidacaoException("Campo Dt. Nasc. é obrigatório !!!");
        }
        return ehValido;
    }
}
