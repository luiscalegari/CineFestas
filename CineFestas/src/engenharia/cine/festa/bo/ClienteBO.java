package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import engenharia.cine.festa.util.Utilidades;
import java.util.List;

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
        } else if (!Utilidades.isCpf(cpf)) {
            ehValido = false;
            throw new ValidacaoException("CPF inválido !!!");
        }
        return ehValido;
    }

    public boolean validaRg(String rg) throws ValidacaoException {
        boolean ehValido = true;
        if (rg.isEmpty()) {
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

    public boolean validaFone(String fone) throws ValidacaoException {
        boolean ehValido = true;
        if (fone.equals("(  ) -         (  ) -          ")) {
            ehValido = false;
            throw new ValidacaoException("Pelo menos um dos campos Telefone ou Celular devem ser preenchidos !!!");
        }
        return ehValido;
    }

    /**
     * Metodo que cria uma matriz de valores para ser exibida em JTable
     *
     * @param sNome Filtro por nome.
     * @param sCpf Filtro por cpf.
     * @param sRg Filtro por RG.
     * @param listaCodigo Retorna todos ID´s referente a tabela do banco de
     * dados.
     * @return Retorna uma matriz com dados da tabela do banco de dados.
     * @throws NegocioException
     */
    public String[][] listaPesquisa(String sNome, String sCpf, String sRg, List<Integer> listaCodigo) throws NegocioException {
        int numCols = 6;
        String[][] listaRetorno = null;
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            List<ClienteDTO> listaCliente = clienteDAO.filtraCliente(sNome, sCpf, sRg);
            listaRetorno = new String[listaCliente.size()][numCols];
            for (int i = 0; i < listaCliente.size(); i++) {
                ClienteDTO cliente = listaCliente.get(i);
                listaCodigo.add(cliente.getCodigo());
                listaRetorno[i][0] = cliente.getNome();
                listaRetorno[i][1] = cliente.getCpf();
                listaRetorno[i][2] = cliente.getRg();
                listaRetorno[i][3] = cliente.getSexo().toString();
                listaRetorno[i][4] = Utilidades.dateFormat.format(cliente.getDtNascimento());
                listaRetorno[i][5] = "Selecionar";
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
        return listaRetorno;
    }

    public void removeCliente(Integer codigo) throws NegocioException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.excluir(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }

    public ClienteDTO selecionaPorCodigo(Integer codigo) throws NegocioException {
        ClienteDTO clienteDTO = null;
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDTO = clienteDAO.buscarPorCodigo(codigo);
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
        return clienteDTO;
    }

    public void salvar(ClienteDTO clienteDTO) throws NegocioException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.atualizar(clienteDTO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }

    public void excluir(int codigo) throws NegocioException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.excluir(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }
}
