package br.com.jogodosanimais.dao;

import javax.swing.JOptionPane;

import br.com.jogodosanimais.model.NoArvoreBinariaModel;
import br.com.jogodosanimais.interfaces.AcoesAnimalInterface;

/**
 * 
 * @author eric
 * @since 01/09/2017 AnimalDAO
 */
public class AnimalDAO implements AcoesAnimalInterface<NoArvoreBinariaModel> {
	public static int indiceCorrente = 1;
	public static NoArvoreBinariaModel raizArvore;
	private static AnimalDAO animalDAO = null;

	private AnimalDAO() {
	}
	
	/**
	 * getInstance padrão singleton, retorna uma instância do animalDAO
	 * @return AnimalDAO animalDAO
	 */
	public static AnimalDAO getInstance() {
		if (animalDAO == null) {
			animalDAO = new AnimalDAO();
		}
		return animalDAO;
	}

	
	public NoArvoreBinariaModel retornoarArvore() {
		return raizArvore;
	}

	public void setarArvore(NoArvoreBinariaModel arvore) {
		raizArvore = arvore;
	}

	public void colocarAnimal(NoArvoreBinariaModel noArvore) {

		String animal = JOptionPane.showInputDialog(null,
				"Qual o animal que você pensou?");

		String oqueFaz = JOptionPane.showInputDialog("Um(a) " + animal
				+ "______ mas um(a) " + noArvore.getValorEmento() + " não.");

		String auxiliar = noArvore.getValorEmento();
		noArvore.setValorEmento(oqueFaz);
		noArvore.setObjetoNoRight(new NoArvoreBinariaModel(++indiceCorrente,
				animal));
		noArvore.setObjetoNoLeft(new NoArvoreBinariaModel(++indiceCorrente,
				auxiliar));

	}

	public void fazerPergunta(NoArvoreBinariaModel noArvore) {
		// verifica se o animal está correto
		int pergunta = JOptionPane.showConfirmDialog(null,
				"O animal que você pensou " + noArvore.getValorEmento(),
				"Confirme", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

		if (pergunta == 0) {
			// Se a resposta estiver correta
			if (noArvore.getObjetoNoRight() == null)
				JOptionPane.showMessageDialog(null, "Acertei de novo!");
			// Pergunta de novo afim de verificar se realmente é o animal
			// pensado
			else {

				fazerPergunta(noArvore.getObjetoNoRight());
			}
			// em caso negativo, insere um novo animal do outro lado

		} else {
			if (noArvore.getObjetoNoLeft() == null)
				colocarAnimal(noArvore);
			else {
				fazerPergunta(noArvore.getObjetoNoLeft());
			}
		}
	}
}
