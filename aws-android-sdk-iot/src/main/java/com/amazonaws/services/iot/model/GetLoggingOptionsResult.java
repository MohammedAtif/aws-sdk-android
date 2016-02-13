/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the GetLoggingOptions operation.
 * </p>
 */
public class GetLoggingOptionsResult implements Serializable {

    /**
     * The ARN of the IAM role that grants access.
     */
    private String roleArn;

    /**
     * The logging level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     */
    private String logLevel;

    /**
     * The ARN of the IAM role that grants access.
     *
     * @return The ARN of the IAM role that grants access.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access.
     *
     * @param roleArn The ARN of the IAM role that grants access.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The ARN of the IAM role that grants access.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLoggingOptionsResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The logging level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @return The logging level.
     *
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }
    
    /**
     * The logging level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel The logging level.
     *
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }
    
    /**
     * The logging level.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel The logging level.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogLevel
     */
    public GetLoggingOptionsResult withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * The logging level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel The logging level.
     *
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }
    
    /**
     * The logging level.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel The logging level.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogLevel
     */
    public GetLoggingOptionsResult withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getLogLevel() != null) sb.append("LogLevel: " + getLogLevel() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetLoggingOptionsResult == false) return false;
        GetLoggingOptionsResult other = (GetLoggingOptionsResult)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getLogLevel() == null ^ this.getLogLevel() == null) return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false) return false; 
        return true;
    }
    
}
    