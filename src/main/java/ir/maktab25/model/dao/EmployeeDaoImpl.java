package ir.maktab25.model.dao;

import ir.maktab25.base.BaseDaoImpl;
import ir.maktab25.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {

    private final SessionFactory factory;

    public EmployeeDaoImpl(SessionFactory factory){

        super(factory);
        this.factory = factory;
    }
    @Override
    protected String getEntityName() {
        return "Employee";
    }

    @Override
    public Double maxSalaryByCity(String city) {
        Session session = factory.openSession();

        Double salaryByCity =(Double) session.createQuery("select max(emp.salary) from Employee emp join emp.addresses add where add.city =:c ")
                .setParameter("c",city).uniqueResult();

        return salaryByCity;
    }

    @Override
    public Employee employeeMaxSalaryByCity(String city) {
        Session session = factory.openSession();

        Employee employee =(Employee) session.createQuery("select emp from Employee emp where emp.salary = (select max(e.salary) from Employee e join e.addresses addr where addr.city=:c)")
                .setParameter("c",city).getSingleResult();

        return employee;
    }

    @Override
    public Employee findEmpByPostalCode(String postalCode) {
        return null;
    }

    @Override
    public Employee findEmpByTelNumber(String telNumber) {
        return null;
    }
}
