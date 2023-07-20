package in.ineuron;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.bo.Customer;
import in.ineuron.service.ICustomerMgmtService;

@SpringBootApplication
public class Controller {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(Controller.class, args);

		ICustomerMgmtService service = factory.getBean(ICustomerMgmtService.class);

		Customer customer = new Customer("dravid", "RCB");
		String status = service.registerCustomer(customer);
		System.out.println(status);



		((ConfigurableApplicationContext) factory).close();
	}
}
