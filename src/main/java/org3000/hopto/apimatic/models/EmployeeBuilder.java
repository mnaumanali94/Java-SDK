/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/03/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class EmployeeBuilder 
        extends PersonBuilder {
    //the instance to build
    private Employee employee;

    /**
     * Default constructor to initialize the instance
     */
    public EmployeeBuilder() {
        employee = new Employee();
    }

    public EmployeeBuilder boss(Person boss) {
        employee.setBoss(boss);
        return this;
    }

    public EmployeeBuilder department(String department) {
        employee.setDepartment(department);
        return this;
    }

    public EmployeeBuilder dependents(List<Person> dependents) {
        employee.setDependents(dependents);
        return this;
    }

    public EmployeeBuilder joiningDay(Days joiningDay) {
        employee.setJoiningDay(joiningDay);
        return this;
    }

    public EmployeeBuilder salary(int salary) {
        employee.setSalary(salary);
        return this;
    }

    public EmployeeBuilder workingDays(List<Days> workingDays) {
        employee.setWorkingDays(workingDays);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Employee build() {
        return employee;
    }
}