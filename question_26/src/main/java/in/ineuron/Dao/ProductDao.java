package in.ineuron.Dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Products;

public interface ProductDao extends CrudRepository<Products,Integer> {

}
