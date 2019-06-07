package ir.maktab25;

import ir.maktab25.model.Address;
import ir.maktab25.model.Employee;
import ir.maktab25.model.PhoneNumber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        PhoneNumber phoneNumber = new PhoneNumber("021_13451", "0912_134");
        PhoneNumber phoneNumber1 = new PhoneNumber("134","13455");
        List<PhoneNumber> phoneNumberList = new ArrayList<>();
        phoneNumberList.add(phoneNumber);
        phoneNumberList.add(phoneNumber1);

        Employee employee = new Employee("ali","111222",1122.0);

        Address address = new Address("111","222","tehran",employee,phoneNumberList);

        session.beginTransaction();

//        session.persist(phoneNumber);
//        session.persist(phoneNumber1);
//        session.persist(employee);
//        session.persist(address);
//        session.createQuery("delete from Employee e where e.id = 1");

        session.delete(employee);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
