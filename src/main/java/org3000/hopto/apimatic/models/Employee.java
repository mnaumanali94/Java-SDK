/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/01/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Employee 
        extends Person {
    private static final long serialVersionUID = 4870011777797687239L;
    private Person boss;
    private String department;
    private List<Person> dependents;
    private Days joiningDay = Days.MONDAY;
    private int salary;
    private List<Days> workingDays;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("boss")
    public Person getBoss ( ) { 
        return this.boss;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("boss")
    public void setBoss (Person value) { 
        this.boss = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("department")
    public String getDepartment ( ) { 
        return this.department;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("department")
    public void setDepartment (String value) { 
        this.department = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("dependents")
    public List<Person> getDependents ( ) { 
        return this.dependents;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("dependents")
    public void setDependents (List<Person> value) { 
        this.dependents = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("joiningDay")
    public Days getJoiningDay ( ) { 
        return this.joiningDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("joiningDay")
    public void setJoiningDay (Days value) { 
        this.joiningDay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("salary")
    public int getSalary ( ) { 
        return this.salary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("salary")
    public void setSalary (int value) { 
        this.salary = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("workingDays")
    public List<Days> getWorkingDays ( ) { 
        return this.workingDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("workingDays")
    public void setWorkingDays (List<Days> value) { 
        this.workingDays = value;
    }
 
}
 