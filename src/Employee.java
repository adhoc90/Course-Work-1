public class Employee {

    private final String fullName;
    private Integer salary;
    private Integer departmentId;
    private final Integer id;
    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getIdField() {
        return idCounter;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return fullName + ", " + salary + ", " + departmentId + ", " + id;
    }
}
