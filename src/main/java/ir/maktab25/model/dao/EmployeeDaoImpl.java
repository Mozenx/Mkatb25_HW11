package ir.maktab25.model.dao;

import ir.maktab25.base.BaseDaoImpl;
import ir.maktab25.model.Employee;
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
        return null;
    }

    @Override
    public Employee employeeMaxSalaryByCity(String city) {
        return null;
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
