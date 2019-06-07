package ir.maktab25;

import ir.maktab25.model.Address;
import ir.maktab25.model.Employee;
import ir.maktab25.model.PhoneNumber;
import ir.maktab25.model.dao.EmployeeDao;
import ir.maktab25.model.dao.EmployeeDaoImpl;
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
        PhoneNumber phoneNumber2 = new PhoneNumber("9812","1345");
        List<PhoneNumber> phoneNumberList = new ArrayList<>();
        phoneNumberList.add(phoneNumber);
        phoneNumberList.add(phoneNumber1);
        List<PhoneNumber> phoneNumberList1 = new ArrayList<>();
        phoneNumberList1.add(phoneNumber2);

        Employee employee = new Employee("ali","111222",1122.0);
        Employee employee1 = new Employee("hasan","12245",2000.0);

        Address address = new Address("111","222","tehran",employee,phoneNumberList);
        Address address1 = new Address("1123","322","tehran",employee1,phoneNumberList1);

        session.beginTransaction();

        session.persist(phoneNumber);
        session.persist(phoneNumber1);
        session.persist(employee);
        session.persist(address);
        session.persist(phoneNumber2);
        session.persist(employee1);
        session.persist(address1);

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
