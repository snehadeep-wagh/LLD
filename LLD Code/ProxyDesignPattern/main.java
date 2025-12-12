package ProxyDesignPattern;

import ProxyDesignPattern.Employee.EmployeeDao;
import ProxyDesignPattern.Employee.EmployeeDaoImpl;
import ProxyDesignPattern.Employee.EmployeeDaoProxy;
import ProxyDesignPattern.Employee.EmployeeModel;

public class main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new EmployeeModel());
            System.out.println("Request completed.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
