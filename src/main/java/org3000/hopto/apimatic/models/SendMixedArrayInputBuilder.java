/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/01/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import java.io.File;

public class SendMixedArrayInputBuilder {
    //the instance to build
    private SendMixedArrayInput sendMixedArrayInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendMixedArrayInputBuilder() {
        sendMixedArrayInput = new SendMixedArrayInput();
    }

    public SendMixedArrayInputBuilder file(File file) {
        sendMixedArrayInput.setFile(file);
        return this;
    }

    public SendMixedArrayInputBuilder integers(List<Integer> integers) {
        sendMixedArrayInput.setIntegers(integers);
        return this;
    }

    public SendMixedArrayInputBuilder models(List<Employee> models) {
        sendMixedArrayInput.setModels(models);
        return this;
    }

    public SendMixedArrayInputBuilder strings(List<String> strings) {
        sendMixedArrayInput.setStrings(strings);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendMixedArrayInput build() {
        return sendMixedArrayInput;
    }
}