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
        EmployeeDao dao1 = new EmployeeDaoImpl(factory);

        Double salary = dao.maxSalaryByCity("tehran");
        System.out.println(salary);

//        Employee employee = dao1.employeeMaxSalaryByCity("tehran");
//        Employee employee = dao1.findEmpByPostalCode("111");
        Employee employee = dao1.findEmpByTelNumber("9812");
        System.out.println(employee);



        factory.close();
    }
}
