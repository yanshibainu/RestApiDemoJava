package tw.com.service;

import java.util.List;

public interface IService<E> {

	public E create(E entity);

	public List<E> getAll();
	public E getById(String id);

	public E update(String id, E entity);

	public void delete(String id);
	
}
