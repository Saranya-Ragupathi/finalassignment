package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

public class UpdateApp {
   public static void main(String[] args) {
	   Transaction transaction=null;
	   Session session=null;
	   boolean flag=false;
	   
	   try {
		   session=HibernateUtil.getSession();
		   Student std=session.get(Student.class, 3);
		   if(session!=null) {
			   transaction=session.beginTransaction();
			   
			   if(transaction!=null) {
				   if(std!=null) {
					   System.out.println(std);
					   std.setsaddress("Suryapet");
					   session.update(std);
					   flag=true;
				   }else
					   System.out.println("Records Not Found.....");
			   }
		   }
	   }catch(HibernateException e) {
		   e.printStackTrace();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }finally {
		   if(flag) {
			   transaction.commit();
		   }else {
			   transaction.rollback();
		   }
	   }
	   HibernateUtil.closeSession(session);
	   HibernateUtil.closeSessionFactory();
   }
}
