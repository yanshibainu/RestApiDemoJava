package tw.com.service;

import java.util.Map;

public interface IService<E> {

	public E create(E entity);

	public Map<Integer, E> getAll();
	public E getById(int id);

	public E update(int id, E entity);

	public void delete(int id);
	
}
