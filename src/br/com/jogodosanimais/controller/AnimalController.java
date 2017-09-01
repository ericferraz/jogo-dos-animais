package br.com.jogodosanimais.controller;

import br.com.jogodosanimais.dao.AnimalDAO;
import br.com.jogodosanimais.model.NoArvoreBinariaModel;

/**
 * 
 * @author eric
 * @since 01/09/2017
 * Classe controladora que far� a interliga��o do modelo com a visualiza��o
 *
 */
public class AnimalController  {
	public static int indiceInicial = 1;
	public static NoArvoreBinariaModel raizArvore;
	private static AnimalController animalController = null;
	private AnimalController(){}
	
	/**
	 * Retorna uma �nica inst�ncia do objeto, padr�o singleton
	 * @return AnimalController
	 */
	public static AnimalController getInstance(){
		if(animalController == null){
			animalController = new AnimalController();
		}
		return animalController;
	}

	public void colocarAnimal(NoArvoreBinariaModel elemento) {
		AnimalDAO.getInstance().colocarAnimal(elemento);
		
	}

	public void fazerPergunta(NoArvoreBinariaModel elemento) {
		AnimalDAO.getInstance().fazerPergunta(elemento);
	}

	public NoArvoreBinariaModel retornoarArvore() {
		return AnimalDAO.getInstance().retornoarArvore();
	}

	public void setarArvore(NoArvoreBinariaModel elemento) {
		AnimalDAO.getInstance().setarArvore(elemento);
		
	}

}
