package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;

/**
 *
 * @author LuisFernando
 */
public class ClienteBO {

    public void cadastrar(ClienteDTO clienteDTO) throws NegocioException {
        try {
            if (clienteDTO.getNome().isEmpty()) {
                throw new NegocioException("Nome do cliente é obrigatório");
            } else {
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.inserir(clienteDTO);
            }
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }
}
