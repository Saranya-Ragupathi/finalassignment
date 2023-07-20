package in.ineuron.test;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import in.ineuron.model.Student;

public class TestApp {
 
	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		try {
            Query<Student> query = session.createQuery("FROM Student", Student.class);
            List<Student> students = query.getResultList();

            for (Student student : students) {
                System.out.println("ID: " + student.getSid() + ", Name: " + student.getSname()+", Address: "+student.getsaddress()+", Age: "+student.getsage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionfactory.close();
        }
	}

}
