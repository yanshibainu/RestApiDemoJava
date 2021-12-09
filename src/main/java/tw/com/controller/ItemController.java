package tw.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.dto.ItemDto;
import tw.com.entities.Item;

@RestController
@RequestMapping("/item")
public class ItemController extends AbstractController<Item, ItemDto>{
    public ItemController() {
        super(new Item());
    }
}
