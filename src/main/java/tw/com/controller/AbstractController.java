package tw.com.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tw.com.service.IService;

public abstract class AbstractController<E, EDto> implements IController<E, EDto> {
	@Autowired
	protected IService<E> iService;
	@Autowired
	private ModelMapper modelMapper;

	private E entity;

	public AbstractController(E entity) {
		this.entity = entity;
	}

	@Override
	public E create(EDto entityDto)
	{
		modelMapper.map(entityDto, entity);
		return iService.create(entity);
	}

	@Override
	public List<E> getAll()
	{
		return iService.getAll();
	}

	@Override
	public E getById(String id) {
		return iService.getById(id);
	}

	@Override
	public E update(String id, EDto entityDto) {
		modelMapper.map(entityDto, entity);
		return iService.update(id, entity);
	}

	@Override
	public void delete(String id) {
		iService.delete(id);
	}
	
}
