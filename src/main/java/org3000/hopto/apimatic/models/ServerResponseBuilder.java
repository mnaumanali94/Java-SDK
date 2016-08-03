/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/03/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class ServerResponseBuilder {
    //the instance to build
    private ServerResponse serverResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ServerResponseBuilder() {
        serverResponse = new ServerResponse();
    }

    public ServerResponseBuilder input(LinkedHashMap<String, Object> input) {
        serverResponse.setInput(input);
        return this;
    }

    public ServerResponseBuilder message(String message) {
        serverResponse.setMessage(message);
        return this;
    }

    public ServerResponseBuilder passed(boolean passed) {
        serverResponse.setPassed(passed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ServerResponse build() {
        return serverResponse;
    }
}