package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {
	public static void main(String args[]){
	AnnotationConfiguration cfg = new AnnotationConfiguration();
	cfg.configure();
	SessionFactory factory =  cfg.buildSessionFactory();
	//open the connection with database.Session interface is used
	Session ssn = factory.openSession();
	Transaction tx = ssn.beginTransaction();
	
	Book book=new Book();
	book.setBookid(101);
	book.setTitle("spring prog");
	book.setAuthor("rona");
	book.setPrice(3444);
	
	DotnetBook dotnet=new DotnetBook();
	dotnet.setBookid(2001);
	dotnet.setTitle("ASP.net");
	dotnet.setAuthor("ert");
	dotnet.setPrice(233);
	dotnet.setCds(3);
	
	JavaBook java=new JavaBook();
	java.setBookid(1223);
	java.setTitle("java");
	java.setAuthor("james gosling");
	java.setPrice(12000);
	java.setDiscount(3);
	
	ssn.save(book);
	ssn.save(dotnet);
	ssn.save(java);
	
	tx.commit();
	ssn.close();
	
	}
	
}
