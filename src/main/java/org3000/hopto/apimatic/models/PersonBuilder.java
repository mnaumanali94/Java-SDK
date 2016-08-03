/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/03/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class PersonBuilder {
    //the instance to build
    private Person person;

    /**
     * Default constructor to initialize the instance
     */
    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder address(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder age(long age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder uid(String uid) {
        person.setUid(uid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Person build() {
        return person;
    }
}