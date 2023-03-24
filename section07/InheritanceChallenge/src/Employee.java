public class Employee extends Worker {
    private long emplyeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.emplyeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplyeeId=" + emplyeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}