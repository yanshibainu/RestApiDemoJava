package tw.com.service;

import org.springframework.stereotype.Service;

import tw.com.dao.ItemRepository;
import tw.com.entities.Item;

@Service
public class ItemService extends AbstractService<Item>{

	public ItemService(ItemRepository itemRepository) {
		super(itemRepository);
	}

	@Override
	public Item update(String id, Item entity) {
		entity.setId(id);
		return super.update(id, entity);
	}
}
