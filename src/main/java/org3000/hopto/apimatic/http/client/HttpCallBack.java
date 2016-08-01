/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC BETA v2.0 on 08/01/2016
 */
package org3000.hopto.apimatic.http.client;

import org3000.hopto.apimatic.http.request.HttpRequest;

/**
 * Callback to be called before and after the HTTP call for an endpoint is made 
 */
public interface HttpCallBack {
    /**
     * Callback called just before the HTTP request is sent 
     * @param request The HTTP request to be executed
     */
    public void OnBeforeRequest(HttpRequest request);
    
    /**
     * Callback called just after the HTTP response is received
     * @param context Context for the HTTP call
     */
    public void OnAfterResponse(HttpContext context);
}