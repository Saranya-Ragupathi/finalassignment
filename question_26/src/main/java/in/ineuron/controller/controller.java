package in.ineuron.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.Dao.ProductDao;
import in.ineuron.model.Products;

@RestController
@CrossOrigin
public class controller {

	@Autowired
	private ProductDao repo;
	@PostMapping("/register")
	public ResponseEntity<String> Register(@RequestBody Products customer){
		repo.save(customer);
		return new ResponseEntity<String>("Customer Registered",HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> Register(@PathVariable("id") Integer id){
		repo.deleteById(id);
		return new ResponseEntity<String>("Customer Deleted",HttpStatus.OK);
	}
	@GetMapping("/findAll")
	public ResponseEntity<?> displayCustomerDetails() {

		List<Products> list = (List<Products>) repo.findAll();
		return new ResponseEntity<List<Products>>(list, HttpStatus.OK);

	}
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayCustomerById(@PathVariable("id") Integer id) {

		Optional<Products> customer=repo.findById(id);
		return new ResponseEntity<Products>(customer.get(), HttpStatus.OK);

	}
	@PostMapping("/update")
	public ResponseEntity<String> Update(@RequestBody Products p){
		repo.save(p);
		return new ResponseEntity<String>("Customer Updated",HttpStatus.OK);
	}


}
