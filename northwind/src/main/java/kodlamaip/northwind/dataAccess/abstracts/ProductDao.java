package kodlamaip.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaip.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	

}
