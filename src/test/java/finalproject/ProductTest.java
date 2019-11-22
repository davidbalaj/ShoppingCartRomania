package finalproject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.finalproject.Item;
import com.fdmgroup.finalproject.Product;
import com.fdmgroup.models.ProductModel;


public class ProductTest {
	Product testProduct;
	Item testItem;
	ProductModel model;
	private ArrayList<Product> products;
	@Before
	public void setUp() throws Exception {
	testProduct = new Product(null, null, null, null, 0);
	testProduct.setDescription(null);
	testProduct.setId(null);
	testProduct.setName(null);
	testProduct.setPhoto(null);
	testProduct.setPrice(0);
	
	testItem = new Item(null,0);
	testItem.setProduct(null);
	testItem.setQuantity(0);
	
	model.findAll();
	model.find(null);
	}

	@Test
	public void Test_GetIdReturnNullIfIdDoesNotExist() {
			
			
			String productId = testProduct.getId();
			assertNull(productId);
		
	}
	
	@Test
	public void Test_GetNameReturnNullIfNameDoesNotExist() {
			
			String productName = testProduct.getName();
			assertNull(productName);
		
	}
	@Test
	public void Test_GetDescriptionReturnNullIfDescriptionDoesNotExist() {
			
		String productDescription = testProduct.getDescription();
		assertNull(productDescription);
		
	}
	@Test
	public void Test_GetPhotoReturnNullIfPhotoDoesNotExist() {
			
		String productPhoto = testProduct.getPhoto();
		assertNull(productPhoto);
		
	}
	@Test
	public void Test_GetPriceReturnNullIfPriceDoesNotExist() {
			
		double productPrice = testProduct.getPrice();
		assertEquals(0, productPrice, .000001);
		
	}
	@Test
	public void Test_GetProductReturnNullIfProductDoesNotExist() {
			
			
			Product product = testItem.getProduct();
			assertNull(product);
		
	}

	@Test
	public void Test_GetQuantityReturnNullIfProductDoesNotExist() {
			
			
			int product = testItem.getQuantity();
			assertEquals(0, product, 0.001);
		
	}
	
	@Test
	public void Test_FindReturnsNullIfProductModelDoesNotFindId() {
			List<Product> products = null;
			
			Product find = model.find(null);
			equals(find.equals(null));
			
			
		
	}
	}

