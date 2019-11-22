package com.fdmgroup.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.finalproject.Item;
import com.fdmgroup.models.ProductModel;

@Controller
public class CartController {
	@GetMapping(value= {"/"})
	public String cart() {
		return "cart";
	}
	@RequestMapping(value = "cart", method = RequestMethod.GET)
	public String index() {
		return "cart";
	}

	@RequestMapping(value = "/buy/{id}", method = RequestMethod.POST)
	public String buy(@PathVariable("id") String id, HttpSession session, @RequestParam String quantity) {
		ProductModel productModel = new ProductModel();
		if (session.getAttribute("cart") == null) {
			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(productModel.find(id), Integer.parseInt(quantity)));
			session.setAttribute("cart", cart);
		} else {
			List<Item> cart = (List<Item>) session.getAttribute("cart");
			int index = this.exists(id, cart);
			if (index == -1) {
				cart.add(new Item(productModel.find(id), Integer.parseInt(quantity)));
			} else {
				int q = cart.get(index).getQuantity() + Integer.parseInt(quantity);
				cart.get(index).setQuantity(q);
			}
			session.setAttribute("cart", cart);
		}
		return "cart";
	}

	
	

	private int exists(String id, List<Item> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getProduct().getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}


}
