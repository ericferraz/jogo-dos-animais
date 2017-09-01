package br.com.jogodosanimais.view;

import javax.swing.JOptionPane;

import br.com.jogodosanimais.controller.AnimalController;
import br.com.jogodosanimais.model.NoArvoreBinariaModel;

/**
 * Classe que representa o objeto de visualização do sistema
 * @author eric
 * @since 01/09/2017
 *
 */
public class AnimalView {

	public static void main(String[] args) {
		AnimalController animalController = AnimalController.getInstance();
		JOptionPane.showMessageDialog(null, "Pense em um Animal");

		// se estiver vazio, instância
		if (animalController.retornoarArvore() == null) {
			animalController.setarArvore(new NoArvoreBinariaModel(AnimalController.indiceInicial, "vive na agua"));
			animalController.retornoarArvore().setObjetoNoLeft(new NoArvoreBinariaModel(++AnimalController.indiceInicial, "Macaco"));
			animalController.retornoarArvore().setObjetoNoRight(new NoArvoreBinariaModel(++AnimalController.indiceInicial, "Tubarão"));
			
		}
		int saiDoSistema = 1;
		
		do {
			int numeroDaResposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + animalController.retornoarArvore().getValorEmento(),
					"Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if (numeroDaResposta == 0) {
				animalController.fazerPergunta(animalController.retornoarArvore().getObjetoNoRight());
			} else {
				animalController.fazerPergunta(animalController.retornoarArvore().getObjetoNoLeft());
			}
			// sai do sistema
			if (numeroDaResposta == JOptionPane.CLOSED_OPTION) {
				saiDoSistema = 0;
			}

		} while (saiDoSistema == 1);

	}

}
