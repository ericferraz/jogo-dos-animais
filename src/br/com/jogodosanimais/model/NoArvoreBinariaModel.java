package br.com.jogodosanimais.model;


/**
 * 
 * @author eric
 * @since 01/09/2017
 * Objeto modelo que representa um nó da árvore
 *
 */
public class NoArvoreBinariaModel {
	public Integer elementoCorrente;
	public NoArvoreBinariaModel objetoNoLeft;
	public NoArvoreBinariaModel objetoNoRight;
	public String valorEmento;
	
	public NoArvoreBinariaModel(){}
	public NoArvoreBinariaModel(Integer elementoCorrente){
		setElementoCorrente(elementoCorrente);
	}
	public NoArvoreBinariaModel(String valorEmento){
		setValorEmento(valorEmento);
	}
	
	public NoArvoreBinariaModel(Integer elementoCorrente,String valorEmento){
		setElementoCorrente(elementoCorrente);
		setValorEmento(valorEmento);
	}
	
	public Integer getElementoCorrente() {
		return elementoCorrente;
	}
	public void setElementoCorrente(Integer elementoCorrente) {
		this.elementoCorrente = elementoCorrente;
	}
	public NoArvoreBinariaModel getObjetoNoLeft() {
		return objetoNoLeft;
	}
	public void setObjetoNoLeft(NoArvoreBinariaModel objetoNoLeft) {
		this.objetoNoLeft = objetoNoLeft;
	}
	public NoArvoreBinariaModel getObjetoNoRight() {
		return objetoNoRight;
	}
	public void setObjetoNoRight(NoArvoreBinariaModel objetoNoRight) {
		this.objetoNoRight = objetoNoRight;
	}
	public String getValorEmento() {
		return valorEmento;
	}
	public void setValorEmento(String valorEmento) {
		this.valorEmento = valorEmento;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((elementoCorrente == null) ? 0 : elementoCorrente.hashCode());
		result = prime * result
				+ ((objetoNoLeft == null) ? 0 : objetoNoLeft.hashCode());
		result = prime * result
				+ ((objetoNoRight == null) ? 0 : objetoNoRight.hashCode());
		result = prime * result
				+ ((valorEmento == null) ? 0 : valorEmento.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoArvoreBinariaModel other = (NoArvoreBinariaModel) obj;
		if (elementoCorrente == null) {
			if (other.elementoCorrente != null)
				return false;
		} else if (!elementoCorrente.equals(other.elementoCorrente))
			return false;
		if (objetoNoLeft == null) {
			if (other.objetoNoLeft != null)
				return false;
		} else if (!objetoNoLeft.equals(other.objetoNoLeft))
			return false;
		if (objetoNoRight == null) {
			if (other.objetoNoRight != null)
				return false;
		} else if (!objetoNoRight.equals(other.objetoNoRight))
			return false;
		if (valorEmento == null) {
			if (other.valorEmento != null)
				return false;
		} else if (!valorEmento.equals(other.valorEmento))
			return false;
		return true;
	}
	

}
