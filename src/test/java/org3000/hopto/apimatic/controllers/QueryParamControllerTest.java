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
import org3000.hopto.apimatic.controllers.QueryParamController;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

public class QueryParamControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static QueryParamController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getQueryParam();
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
     * Todo Add description for test testSimpleQuery
     * @throws Throwable
     */
    @Test
    public void testSimpleQuery() throws Throwable {
        // Parameters for the API call
        boolean mboolean = true;
        int number = 4;
        String string = "TestString";
        // key-value map for optional query parameters
        Map<String, Object> queryParams = new LinkedHashMap<String, Object>();

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.simpleQuery(mboolean, number, string, queryParams);
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

    /**
     * Todo Add description for test testNoParams
     * @throws Throwable
     */
    @Test
    public void testNoParams() throws Throwable {

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.noParams();
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

    /**
     * Todo Add description for test testStringParam
     * @throws Throwable
     */
    @Test
    public void testStringParam() throws Throwable {
        // Parameters for the API call
        String string = "l;asd;asdwe[2304&&;'.d??\\a\\\\\\;sd//";

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.stringParam(string);
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

    /**
     * Todo Add description for test testUrlParam
     * @throws Throwable
     */
    @Test
    public void testUrlParam() throws Throwable {
        // Parameters for the API call
        String url = "https://www.shahidisawesome.com/and/also/a/narcissist?thisis=aparameter&another=one";

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.urlParam(url);
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

    /**
     * Todo Add description for test testMultipleParams
     * @throws Throwable
     */
    @Test
    public void testMultipleParams() throws Throwable {
        // Parameters for the API call
        int number = 123412312;
        double precision = 1112.34;
        String string = "\"\"test./;\";12&&3asl\"\";\"qw1&34\"///..//.";
        String url = "http://www.abc.com/test?a=b&c=\"http://lolol.com?param=no&another=lol\"";

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.multipleParams(number, precision, string, url);
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

    /**
     * Todo Add description for test testNumberArray
     * @throws Throwable
     */
    @Test
    public void testNumberArray() throws Throwable {
        // Parameters for the API call
        List<Integer> integers = APIHelper.deserialize("[1,2,3,4,5]", new TypeReference<List<Integer>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.numberArray(integers);
        } catch(APIException e) {};

        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 && 
                httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testStringArray
     * @throws Throwable
     */
    @Test
    public void testStringArray() throws Throwable {
        // Parameters for the API call
        List<String> strings = APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.stringArray(strings);
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

    /**
     * Todo Add description for test testStringEnumArray
     * @throws Throwable
     */
    @Test
    public void testStringEnumArray() throws Throwable {
        // Parameters for the API call
        List<Days> days = APIHelper.deserialize("[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]", new TypeReference<List<Days>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.stringEnumArray(days);
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

    /**
     * Todo Add description for test testIntegerEnumArray
     * @throws Throwable
     */
    @Test
    public void testIntegerEnumArray() throws Throwable {
        // Parameters for the API call
        List<SuiteCode> suites = APIHelper.deserialize("[1, 3, 4, 2, 3]", new TypeReference<List<SuiteCode>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.integerEnumArray(suites);
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
