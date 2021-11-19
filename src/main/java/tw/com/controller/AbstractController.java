package tw.com.controller;

import java.util.List;

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
	public List<E> getAll() {
		return iService.getAll();
	}

	@Override
	public E getById(String id) {
		return iService.getById(id);
	}

	@Override
	public E update(String id, E enity) {
		return iService.update(id, enity);
	}

	@Override
	public void delete(String id) {
		iService.delete(id);
	}
	
}
