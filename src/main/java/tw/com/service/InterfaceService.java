package tw.com.service;

import java.util.List;

public interface InterfaceService<E> {

	public E add(E entity);

	public List<E> getAll();
	public E getById(int id);

	public List<E> update(E entity, int id);

	public List<E> delete(int id);
	
}
