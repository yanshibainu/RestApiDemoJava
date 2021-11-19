package tw.com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<E> {
	
	@PostMapping
	public E create(@RequestBody E entity);
	
	@GetMapping
	public List<E> getAll();
	@GetMapping("/{id}")
	public E getById(@PathVariable String id);
	
	@PatchMapping("/{id}")
	public E update(@PathVariable String id, @RequestBody E enity);
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id);
}
