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
import org3000.hopto.apimatic.controllers.HeaderController;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

public class HeaderControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static HeaderController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getHeader();
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
     * Todo Add description for test testSendHeaders
     * @throws Throwable
     */
    @Test
    public void testSendHeaders() throws Throwable {
        // Parameters for the API call
        String customHeader = "TestString";
        String value = "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.sendHeaders(customHeader, value);
        } catch(APIException e) {};

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
