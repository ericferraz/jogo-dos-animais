package br.com.jogodosanimais.interfaces;
/**
 * @author eric
 * @since 01/09/2017
 */
public interface AcoesAnimalInterface<T> {
	
	public void colocarAnimal(T elemento);
	public void fazerPergunta(T elemento);
	public T retornoarArvore();
	public void setarArvore(T elemento);
}
