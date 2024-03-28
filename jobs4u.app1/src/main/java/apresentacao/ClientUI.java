/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import isep.eapli.aplicacao.GrupoAutomovelController;
import isep.eapli.dominio.GrupoAutomovel;
import isep.eapli.util.Console;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ClientUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();

    public void registarGA() throws InstantiationException {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.registarGrupoAutomovel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
		List<GrupoAutomovel> lista = controller.listarGruposAutomoveis();
        for (GrupoAutomovel ga : lista) {
            System.out.println(ga);
        }
	}

	public void procurarGAPorID() {
        long id = Console.readInteger("Por favor introduza o ID do Grupo Automóvel:");
        GrupoAutomovel ga = controller.procurarGrupoAutomovel(id);
        if (ga != null) {
            System.out.println(ga);
        } else {
            System.out.println("Grupo Automóvel não encontrado");
        }
	}
}
