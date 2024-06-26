package sistema_restaurante.sistema.persistencia;

public class Nodo<T> {
	// ATRIBUTO
	private T       value;
	private Nodo<T> next;
	private Nodo<T> back;
	
	
	
	// CONSTRUTOR
	public Nodo(T value) {
		this.value = value;
		next       = null;
		back       = null;
	}
	
	
	
	// GETTERS AND SETTERS
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Nodo<T> getNext() {
		return next;
	}
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	public Nodo<T> getBack() {
		return back;
	}
	public void setBack(Nodo<T> back) {
		this.back = back;
	}
}
