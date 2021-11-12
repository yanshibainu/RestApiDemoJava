package tw.com.service;

import java.util.Map;

public interface IService<E> {

	public E add(E entity);

	public Map<Integer, E> getAll();
	public E getById(int id);

	public E update(E entity, int id);

	public void delete(int id);
	
}
