package ir.maktab25.model.dao;

import ir.maktab25.base.BaseDao;
import ir.maktab25.model.Employee;

public interface EmployeeDao extends BaseDao<Employee> {

    Double maxSalaryByCity(String city);

    Employee employeeMaxSalaryByCity(String city);

    Employee findEmpByPostalCode(String postalCode);

    Employee findEmpByTelNumber(String telNumber);
}//end of interface
