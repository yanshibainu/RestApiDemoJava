package tw.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tw.com.dao.IRepository;

public abstract class AbstractService<E> implements IService<E>{
	
	private IRepository<E, String> iRepository;
	
	@Autowired
	public AbstractService(IRepository<E, String> iRepository) {
		this.iRepository = iRepository;
	}

	@Override
	public E create(E entity) {
		iRepository.save(entity);
		return entity;
	}
	
	@Override
	public List<E> getAll(){
		return iRepository.findAll();
	}
	
	@Override
	public E getById(String id) {
		return iRepository.findById(id).get();
	}
	
	@Override
	public E update(String id, E entity) {
		if(iRepository.findById(id).get() == null) {
			return null;
		}else {
			return iRepository.save(entity);
		}	
	}
	
	@Override
	public void delete(String id) {
		iRepository.deleteById(id);
	}
	
}
