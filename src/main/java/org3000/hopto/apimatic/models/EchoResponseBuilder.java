/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/03/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class EchoResponseBuilder {
    //the instance to build
    private EchoResponse echoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EchoResponseBuilder() {
        echoResponse = new EchoResponse();
    }

    public EchoResponseBuilder body(LinkedHashMap<String, Object> body) {
        echoResponse.setBody(body);
        return this;
    }

    public EchoResponseBuilder headers(LinkedHashMap<String, String> headers) {
        echoResponse.setHeaders(headers);
        return this;
    }

    public EchoResponseBuilder method(String method) {
        echoResponse.setMethod(method);
        return this;
    }

    /**
     * relativePath
     */
    public EchoResponseBuilder path(String path) {
        echoResponse.setPath(path);
        return this;
    }

    public EchoResponseBuilder query(LinkedHashMap<String, String> query) {
        echoResponse.setQuery(query);
        return this;
    }

    public EchoResponseBuilder uploadCount(int uploadCount) {
        echoResponse.setUploadCount(uploadCount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EchoResponse build() {
        return echoResponse;
    }
}