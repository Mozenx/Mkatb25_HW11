package ir.maktab25;

import ir.maktab25.model.Employee;
import ir.maktab25.model.dao.EmployeeDao;
import ir.maktab25.model.dao.EmployeeDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryApp {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        EmployeeDao dao = new EmployeeDaoImpl(factory);

        Double salary = dao.maxSalaryByCity("tehran");


        Employee employee = dao.employeeMaxSalaryByCity("tehran");
        Employee employee1 = dao.findEmpByPostalCode("111");
        Employee employee2 = dao.findEmpByTelNumber("9812");

        System.out.println(salary);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

        factory.close();
    }//end of main method
}//end of class
