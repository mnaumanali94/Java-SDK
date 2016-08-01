/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/01/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Person 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4813111815654917174L;
    private String address;
    private long age;
    private String name;
    private String uid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("age")
    public long getAge ( ) { 
        return this.age;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("age")
    public void setAge (long value) { 
        this.age = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uid")
    public String getUid ( ) { 
        return this.uid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uid")
    public void setUid (String value) { 
        this.uid = value;
    }
 
}
 