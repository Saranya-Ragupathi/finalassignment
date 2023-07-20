package in.ineuron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.bo.Customer;
import in.ineuron.service.ICustomerMgmtService;

@RestController
public class Restcontroller {
	@Autowired
	private ICustomerMgmtService service;
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Customer c){
		String s=service.registerCustomer(c);
		return new ResponseEntity<String>(s, HttpStatus.OK);

		
	}

}
