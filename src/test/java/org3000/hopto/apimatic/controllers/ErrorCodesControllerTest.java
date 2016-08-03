/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 on 08/03/2016
 */
package org3000.hopto.apimatic.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org3000.hopto.apimatic.Configuration;
import org3000.hopto.apimatic.APIException;
import org3000.hopto.apimatic.APIHelper;
import org3000.hopto.apimatic.controllers.ErrorCodesController;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

public class ErrorCodesControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static ErrorCodesController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getErrorCodes();
        applyConfiguration();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Todo Add description for test testGet400
     * @throws Throwable
     */
    @Test
    public void testGet400() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.get400();
        } catch(APIException e) {};

        // Test response code
        assertEquals("Status is not 400", 
                400, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Todo Add description for test testGet500
     * @throws Throwable
     */
    @Test
    public void testGet500() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.get500();
        } catch(APIException e) {};

        // Test response code
        assertEquals("Status is not 500", 
                500, httpResponse.getResponse().getStatusCode());

    }

}
