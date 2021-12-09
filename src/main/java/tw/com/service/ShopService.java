package tw.com.service;

import org.springframework.stereotype.Service;

import tw.com.dao.ShopRepository;
import tw.com.entities.Shop;

@Service
public class ShopService extends AbstractService<Shop>{

	public ShopService(ShopRepository shopRepository) {
		super(shopRepository);
	}

	@Override
	public Shop update(String id, Shop entity) {
		entity.setId(id);
		return super.update(id, entity);
	}
}
