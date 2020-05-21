package genclass;

public class Employee {
    String fname;
    String lname;
    String employeeId;

    public Employee(String fname, String lname, String employeeId) {
        this.fname = fname;
        this.lname = lname;
        this.employeeId = employeeId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
