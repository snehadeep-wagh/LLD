package ProxyDesignPattern.Employee;

public interface EmployeeDao {
    public void create(String client, EmployeeModel employeeModel) throws Exception;
    public void delete(String client, String employeeId) throws Exception;
    public void get(String client, String employeeId) throws Exception;
}
