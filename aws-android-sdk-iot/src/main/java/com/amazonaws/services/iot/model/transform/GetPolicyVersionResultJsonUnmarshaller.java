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

package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Get Policy Version Result JSON Unmarshaller
 */
public class GetPolicyVersionResultJsonUnmarshaller implements Unmarshaller<GetPolicyVersionResult, JsonUnmarshallerContext> {

    public GetPolicyVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPolicyVersionResult getPolicyVersionResult = new GetPolicyVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("policyArn")) {
                getPolicyVersionResult.setPolicyArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("policyName")) {
                getPolicyVersionResult.setPolicyName(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("policyDocument")) {
                getPolicyVersionResult.setPolicyDocument(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("policyVersionId")) {
                getPolicyVersionResult.setPolicyVersionId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("isDefaultVersion")) {
                getPolicyVersionResult.setIsDefaultVersion(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return getPolicyVersionResult;
    }

    private static GetPolicyVersionResultJsonUnmarshaller instance;
    public static GetPolicyVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetPolicyVersionResultJsonUnmarshaller();
        return instance;
    }
}
    