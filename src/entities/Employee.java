package entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) { // compare com(um objeto other do tipo Employee).
        return name.compareTo(other.getName()); // retorne compare o name com(o objeto other.getName()).
    }

}