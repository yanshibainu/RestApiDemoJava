package tw.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.entities.Shop;

@RestController
@RequestMapping("/shop")
public class ShopController extends AbstractController<Shop>{

}
