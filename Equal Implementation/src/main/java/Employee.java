public class Employee {

    private int emp_id;
    private String emp_code,emp_nic,emp_name,emp_Address;

    public Employee(int emp_id, String emp_code, String emp_nic, String emp_name, String emp_Address) {
        this.emp_id = emp_id;
        this.emp_code = emp_code;
        this.emp_nic = emp_nic;
        this.emp_name = emp_name;
        this.emp_Address = emp_Address;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_nic() {
        return emp_nic;
    }

    public void setEmp_nic(String emp_nic) {
        this.emp_nic = emp_nic;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_Address() {
        return emp_Address;
    }

    public void setEmp_Address(String emp_Address) {
        this.emp_Address = emp_Address;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if (employee.emp_id == this.emp_id || employee.emp_code.equals(this.emp_code))
            return true;
        else return false;
    }
}
