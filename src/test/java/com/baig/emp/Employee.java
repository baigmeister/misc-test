package com.baig.emp;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    final static Comparator<Employee> BY_SALARY = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());

    private Long empId;
    private String firstName;
    private String familyName;
    protected Double salary;


    public Employee(Long empId, String firstName, String familyName, Double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.familyName = familyName;
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId) &&
                firstName.equals(employee.firstName) &&
                familyName.equals(employee.familyName) &&
                salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, familyName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return empId.compareTo(o.getEmpId());
    }
}
