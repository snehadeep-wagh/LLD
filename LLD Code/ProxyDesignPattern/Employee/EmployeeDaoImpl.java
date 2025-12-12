package ProxyDesignPattern.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeModel employeeModel) throws Exception {
        System.out.println("Created new Employee!");
    }

    @Override
    public void delete(String client, String employeeId) throws Exception {
        System.out.println("Deleted Employee!");
        
    }

    @Override
    public void get(String client, String employeeId) throws Exception {
        System.out.println("getting Employee!");
    }
    
}
