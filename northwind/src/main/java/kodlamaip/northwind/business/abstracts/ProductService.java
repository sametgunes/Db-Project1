package kodlamaip.northwind.business.abstracts;

import java.util.List;

import kodlamaip.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
	
}
