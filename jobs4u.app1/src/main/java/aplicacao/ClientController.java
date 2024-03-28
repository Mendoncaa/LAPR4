/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import persistence.impl.jpa.ClientEntity;
import persistence.impl.jpa.ClientEntityRepositorio;
import persistence.impl.jpa.ClientEntityRepositorioJPAImpl;
import java.util.List;

public class ClientController {

    public ClientEntity registarClient(String nome, int portas,
            String classe) throws InstantiationException {
        ClientEntity clientEntity = new ClientEntity(nome, portas, classe);
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.add(clientEntity);
    }
    
    public List<ClientEntity> listarGruposAutomoveis() {
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.findAll();
	}

	public ClientEntity procurarGrupoAutomovel(long id) {
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.findById(id);
	}
}
