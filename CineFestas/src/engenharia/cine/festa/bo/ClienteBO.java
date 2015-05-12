package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;

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

    public boolean validaCep(String cep) throws ValidacaoException {
        boolean ehValido = true;
        if (cep == null || cep == "") {
            ehValido = false;
            throw new ValidacaoException("Campo CEP é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaCidade(String cidade) throws ValidacaoException {
        boolean ehValido = true;
        if (cidade == null || cidade == "") {
            ehValido = false;
            throw new ValidacaoException("Campo cidade é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaCpf(String cpf) throws ValidacaoException {
        boolean ehValido = true;
        if (cpf == null || cpf == "") {
            ehValido = false;
            throw new ValidacaoException("Campo CPF é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaNome(String nome) throws ValidacaoException {
        boolean ehValido = true;
        if (nome == null || nome == "") {
            ehValido = false;
            throw new ValidacaoException("Campo nome é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaRg(String rg) throws ValidacaoException {
        boolean ehValido = true;
        if (rg == null || rg == "") {
            ehValido = false;
            throw new ValidacaoException("Campo RG é obrigatório !!!");
        }
        return ehValido;
    }

    public boolean validaDtNasc(String dtNasc) throws ValidacaoException {
        boolean ehValido = true;
        if (dtNasc == null || dtNasc == "") {
            ehValido = false;
            throw new ValidacaoException("Campo Dt. Nasc. é obrigatório !!!");
        }
        return ehValido;
    }
}
