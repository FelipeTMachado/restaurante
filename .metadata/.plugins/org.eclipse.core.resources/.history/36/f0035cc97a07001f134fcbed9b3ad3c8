package sistema_restaurante.sistema.persistencia;

public class Lista<T> {
	// ATRIBUTO
	private Nodo<T> begin;
	private Nodo<T> active;
	

	
	// CONSTRUTOR
	public Lista() {
		begin = null;
	}
	
	
	
	// METODOS FUNCIONAIS
	public void insertBegin(T value) {
		Nodo<T> newNodo = new Nodo<T>(value);
	
		if (isEmpty()) {
			begin = newNodo;
			newNodo.setNext(null);
			newNodo.setBack(null);
		} else {
			newNodo.setNext(begin);
			begin.setBack(newNodo);
			begin = newNodo;
		}
		
		active = begin;
	}

	public void deleteEnd() {
		Nodo<T> aux = begin;
		//TODO 
		if (size() > 1) {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			
			aux.getBack().setNext(null);
		} else {
			if (size() == 1) {
				begin = null;
			}
		}
		
		active = begin;
	}
	
	public void deleteByIndex(Integer index) {
		
	}
	
	public void deleteByItem(T item) {
		Nodo<T> aux = begin;
		
		while (aux != null) {
			if (aux.getValue().equals(item)) {
				if(aux == begin) {
					begin = begin.getNext();
					if (begin != null) {
						begin.setBack(null);
					}
				} else {
					if (aux.getNext() != null) {
						aux.getNext().setBack(aux.getBack());
						aux.getBack().setNext(aux.getNext());
					} else {
						aux.getBack().setNext(null);
					}
				}
			}
			
			aux = aux.getNext();
		}
		
		active = begin;
	}

	public T findItem(T item) {
		T retorno = null;
		
		while (hasNext()) {
			T aux = next();
			if (aux.equals(item)) {
				retorno = aux;
			}
		}
		
		return retorno;
	}
	
	public T findIndex(Integer index) {	
		int cont = 0;
		
		while (hasNext()) {
			T dataAux = next();
			
			if (cont == index) {
				active = begin;
				return dataAux;
			}
			
			cont++;
		}
		
		return null;
	}
	
	public void insertEnd(T value) {
		Nodo<T> newNodo = new Nodo<T>(value);
		
		if (isEmpty()) {
			begin = newNodo;
			begin.setNext(null);
			begin.setBack(null);
		} else {
			Nodo<T> aux = begin;
			
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			
			aux.setNext(newNodo);
			newNodo.setBack(aux);
		}
		
		active = begin;
	}
	
	public void deleteIndex() {
		
	}
	
	public boolean isEmpty() {
		return begin == null;
	}
	 
	public boolean hasNext() {
		if (active == null) {
			active = begin;
			return false;
		} else {
			return true;
		}
	}
		
	public int size() {
		int cont = 0;
		while (hasNext()) {
			next();
			cont++;
		}
		
		return cont;
	}
	
	public T next() {
		Nodo<T> aux = active;
		active = aux.getNext();
		return aux.getValue();
	}
	
	public void showAll() {
		while(hasNext()) {
			System.out.println(next().toString());
		}
	}
	
	// GETTERS AND SETTERS
	public Nodo<T> getBegin() {
		return begin;
	}
	public void setBegin(Nodo<T> begin) {
		this.begin = begin;
	}
	public Nodo<T> getActive() {
		return active;
	}
	public void setActive(Nodo<T> active) {
		this.active = active;
	}
}
