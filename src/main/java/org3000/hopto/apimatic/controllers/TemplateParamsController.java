/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/03/2016
 */
package org3000.hopto.apimatic.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import org3000.hopto.apimatic.http.client.HttpClient;
import org3000.hopto.apimatic.http.client.HttpContext;
import org3000.hopto.apimatic.http.request.HttpRequest;
import org3000.hopto.apimatic.http.response.HttpResponse;
import org3000.hopto.apimatic.http.response.HttpStringResponse;
import org3000.hopto.apimatic.http.client.APICallBack;
import org3000.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;
import org3000.hopto.apimatic.*;
import org3000.hopto.apimatic.models.*;

public class TemplateParamsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TemplateParamsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TemplateParamsController class 
     */
    public static TemplateParamsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TemplateParamsController();
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    strings    Required parameter: Example: 
     * @return    Returns the EchoResponse response from the API call 
     */
    public EchoResponse sendStringArray(
                final List<String> strings
    ) throws Throwable {
        APICallBackCatcher<EchoResponse> callback = new APICallBackCatcher<EchoResponse>();
        sendStringArrayAsync(strings, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    strings    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void sendStringArrayAsync(
                final List<String> strings,
                final APICallBack<EchoResponse> callBack
    ) {
        //validating required parameters
        if (null == strings)
            throw new NullPointerException("The parameter \"strings\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{strings}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5255079042680890288L;
            {
                    put( "strings", strings );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5068741945892524877L;
            {
                    put( "user-agent", "Stamplay SDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            EchoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<EchoResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    integers    Required parameter: Example: 
     * @return    Returns the EchoResponse response from the API call 
     */
    public EchoResponse sendIntegerArray(
                final List<Integer> integers
    ) throws Throwable {
        APICallBackCatcher<EchoResponse> callback = new APICallBackCatcher<EchoResponse>();
        sendIntegerArrayAsync(integers, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    integers    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void sendIntegerArrayAsync(
                final List<Integer> integers,
                final APICallBack<EchoResponse> callBack
    ) {
        //validating required parameters
        if (null == integers)
            throw new NullPointerException("The parameter \"integers\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{integers}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5179240968601944581L;
            {
                    put( "integers", integers );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4681152332147416184L;
            {
                    put( "user-agent", "Stamplay SDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            EchoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<EchoResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}