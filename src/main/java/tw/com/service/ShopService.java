package tw.com.service;

import org.springframework.stereotype.Service;

import tw.com.dao.ShopRepository;
import tw.com.entities.Shop;

@Service
public class ShopService extends AbstractService<Shop>{

	public ShopService(ShopRepository shopRepository) {
		super(shopRepository);
	}
	
}
