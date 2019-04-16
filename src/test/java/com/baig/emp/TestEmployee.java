package com.baig.emp;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class TestEmployee {

    @Test
    public void testEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(employeeList, buildEmployee(11l, "John", "Smith", 10000d),
                buildEmployee(2l, "Jane", "Mercer", 19000d));
        assertThat(employeeList.size(), is(2));
        Collections.sort(employeeList,Employee.BY_SALARY);
        assertThat(employeeList.get(0).salary, is(19000d));
    }

    private Employee buildEmployee(Long empId, String firstName, String familyName, Double salary) {
        return new Employee(empId, firstName, familyName, salary);
    }

}

