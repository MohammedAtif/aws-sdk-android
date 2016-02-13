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
 * Create Keys And Certificate Result JSON Unmarshaller
 */
public class CreateKeysAndCertificateResultJsonUnmarshaller implements Unmarshaller<CreateKeysAndCertificateResult, JsonUnmarshallerContext> {

    public CreateKeysAndCertificateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateKeysAndCertificateResult createKeysAndCertificateResult = new CreateKeysAndCertificateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("certificateArn")) {
                createKeysAndCertificateResult.setCertificateArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("certificateId")) {
                createKeysAndCertificateResult.setCertificateId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("certificatePem")) {
                createKeysAndCertificateResult.setCertificatePem(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("keyPair")) {
                createKeysAndCertificateResult.setKeyPair(KeyPairJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return createKeysAndCertificateResult;
    }

    private static CreateKeysAndCertificateResultJsonUnmarshaller instance;
    public static CreateKeysAndCertificateResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreateKeysAndCertificateResultJsonUnmarshaller();
        return instance;
    }
}
    