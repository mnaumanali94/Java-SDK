/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 on 08/01/2016
 */
package org3000.hopto.apimatic.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org3000.hopto.apimatic.TesterClient;
import org3000.hopto.apimatic.Configuration;
import org3000.hopto.apimatic.testing.HttpCallBackCatcher;


/**
 * Base class for all test cases
 */
public class ControllerTestBase {
    /**
     * Test configuration
     */
    public final static int REQUEST_TIMEOUT = 60;

    public final static double ASSERT_PRECISION = 0.1;
    
    /**
     * Global rules for tests
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures
     */
    
    // Used to serve as HttpCallBack and to capture request & response
    protected HttpCallBackCatcher httpResponse = new HttpCallBackCatcher();
    
    /**
     * Setup test
     */
    @Before
    public void setUp() throws Exception {
        httpResponse = new HttpCallBackCatcher(); 
    }

    /**
     * Tear down test
     */
    @After
    public void tearDown() throws Exception {
        if(httpResponse.getResponse() != null)
            httpResponse.getResponse().shutdown();
        httpResponse = null;
    }
    
    // Singleton instance of client for all test classes
    private static TesterClient client;
    private static Object clientSync = new Object();
    
    /**
     * Get client instance
     * @return
     */
    protected static TesterClient getClient() {
        if(client == null)
            synchronized (clientSync) {
                client = new TesterClient();
            }
        return client;
    }

    /**
     * Apply test configuration
     */
    protected static void applyConfiguration() {
        // Set Configuration parameters for test execution
        Configuration.baseUri = "http://apimatic.hopto.org:3000";
    }
}
