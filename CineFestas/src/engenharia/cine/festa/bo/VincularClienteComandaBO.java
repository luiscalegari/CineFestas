package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import engenharia.cine.festa.util.Utilidades;

/**
 *
 * @author Luis Calegari
 */
public class VincularClienteComandaBO {

    public boolean validaCpf(String cpf) {
        boolean ehValido = false;
        if (cpf.equals("   .   .   -  ") || Utilidades.isCpf(cpf)) {
            ehValido = true;
        }
        return ehValido;
    }

    public boolean validaRg(String rg) {
        return rg.isEmpty() || (rg.length() == 9 || rg.length() == 8);
    }

    public boolean validaComanda(String comanda) throws ValidacaoException {
        boolean ehValido = true;
        if (comanda.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Digite um número de comanda !!!");
        }
        return ehValido;
    }

    public ClienteDTO buscarCpfRg(String cpf, String rg) throws NegocioException {
        ClienteDTO cdto = null;
        try {
            ClienteDAO cdao = new ClienteDAO();
            cdto = cdao.buscarPorCpfRg(cpf, rg);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
        return cdto;
    }

    public void vincularComanda(String sComanda, String sCodigo) throws NegocioException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.vincularComanda(sComanda, sCodigo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }
}
