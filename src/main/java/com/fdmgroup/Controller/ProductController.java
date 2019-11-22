package com.fdmgroup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.models.ProductModel;
@Controller
@RequestMapping(value = "product")
public class ProductController {
	@GetMapping("/product")
	public String product() {
		return "product";
	}
		@RequestMapping(method = RequestMethod.GET)
		public String index(ModelMap modelMap) {
			ProductModel productModel = new ProductModel();
			modelMap.put("products", productModel.findAll());
			return "product";
		}

	}

