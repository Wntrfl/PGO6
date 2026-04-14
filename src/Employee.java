public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public final String getEmployeeID() {
        return employeeId;
    }

    public double calculateMonthlyCost() {
        return baseSalary;
    }

    public String introduceYourself() {
        return "Hello, I am " + firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s |First Name: %s |Last Name:%s | Base salary: $%.2f ",
                employeeId, firstName, lastName, baseSalary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId.equals(employee.employeeId);
    }



}



