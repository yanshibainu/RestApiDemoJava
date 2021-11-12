package tw.com.service;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractService<E> implements IService<E>{
	
	protected Map<Integer, E> map = new HashMap<>();
	
	@Override
	public E create(E entity) {
		map.put(map.size(), entity);
		return entity;
	}
	
	@Override
	public Map<Integer, E> getAll(){
		return map;
	}
	
	@Override
	public E getById(int id) {
		return map.get(id);
	}
	
	@Override
	public E update(int id, E entity) {
		map.replace(id, entity);
		return map.get(id);
	}
	
	@Override
	public void delete(int id) {
		map.remove(id);
	}
	
}
