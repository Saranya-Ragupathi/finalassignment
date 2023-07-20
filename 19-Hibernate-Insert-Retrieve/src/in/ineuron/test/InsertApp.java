package in.ineuron.test;
import in.ineuron.model.Student;
import org.hibernate.cfg.Configuration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertApp {
	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student student=new Student();
		student.setSid(3);
		student.setSname("Rahul");
		student.setsaddress("IND");
		student.setsage(18);
		
		session.save(student);
		
		transaction.commit();
		session.close();
		sessionfactory.close();
	}

}
