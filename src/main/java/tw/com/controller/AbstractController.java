package tw.com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import tw.com.service.IService;

public abstract class AbstractController<E> implements IController<E> {
	@Autowired
	protected IService<E> iService;
	
	@Override
	public E create(E entity) {
		return iService.create(entity);
	}

	@Override
	public Map<Integer, E> getAll() {
		return iService.getAll();
	}

	@Override
	public E getById(int id) {
		return iService.getById(id);
	}

	@Override
	public E update(int id, E enity) {
		return iService.update(id, enity);
	}

	@Override
	public void delete(int id) {
		iService.delete(id);
	}
	
}
