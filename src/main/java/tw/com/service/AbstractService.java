package tw.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tw.com.dao.IRepository;

public abstract class AbstractService<E> implements IService<E>{
	@Autowired
	protected IRepository<E, String> iRepository;
	
	public AbstractService(IRepository<E, String> iRepository) {
		this.iRepository = iRepository;
	}

	@Override
	public E create(E entity) {
		return iRepository.save(entity);
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
		return iRepository.save(entity);	
	}
	
	@Override
	public void delete(String id) {
		iRepository.deleteById(id);
	}
	
}
