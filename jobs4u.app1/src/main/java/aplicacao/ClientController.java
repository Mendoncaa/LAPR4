/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import isep.eapli.dominio.GrupoAutomovel;
import isep.eapli.persistencia.GrupoAutomovelRepositorio;
import isep.eapli.persistencia.GrupoAutomovelRepositorioJPAImpl;
import java.util.List;

/**
 *
 * @author eapli
 */
public class ClientController {

    public GrupoAutomovel registarGrupoAutomovel(String nome, int portas,
            String classe) throws InstantiationException {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe);
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.add(grupo1);
    }
    
    public List<GrupoAutomovel> listarGruposAutomoveis() {
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.findAll();
	}

	public GrupoAutomovel procurarGrupoAutomovel(long id) {
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.findById(id);
	}

        /*  Versão  sem usar padrão repositório
	 private GrupoAutomovel gravarGA(GrupoAutomovel gAuto) {

	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 manager.getTransaction().begin();
	 manager.persist(gAuto);
	 manager.getTransaction().commit();

	 manager.close();
	 return gAuto;
	 }

	 private List<GrupoAutomovel> listarTodos() {


	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 Query query = manager.createQuery("select ga from GrupoAutomovel ga");
	 List<GrupoAutomovel> results = query.getResultList();

	 for (GrupoAutomovel result : results) {
	 System.out.println(result);
	 }

	 manager.close();
	 return results;
	 }

	 private EntityManager criarEntityManager(String persistenceUnit) {
	 EntityManagerFactory factory = Persistence.
	 createEntityManagerFactory(persistenceUnit);
	 EntityManager manager = factory.createEntityManager();
	 return manager;
	 }
	 */
}
