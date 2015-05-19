/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ClienteDAO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.util.Utilidades;

/**
 *
 * @author Luis Calegari
 */
public class VincularComandaClienteBO {

    public boolean validaCpf(String cpf) {
        boolean ehValido = false;
        if (cpf.equals("   .   .   -  ") || Utilidades.isCpf(cpf)){
            ehValido = true;
        }
        return ehValido;
    }
    
    public boolean validaRg(String rg){
        return rg.isEmpty() || (rg.length() == 9 || rg.length() == 8);
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
}
