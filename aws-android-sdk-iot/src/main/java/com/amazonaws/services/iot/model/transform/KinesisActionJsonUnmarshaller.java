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
 * Kinesis Action JSON Unmarshaller
 */
public class KinesisActionJsonUnmarshaller implements Unmarshaller<KinesisAction, JsonUnmarshallerContext> {

    public KinesisAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        KinesisAction kinesisAction = new KinesisAction();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("roleArn")) {
                kinesisAction.setRoleArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("streamName")) {
                kinesisAction.setStreamName(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("partitionKey")) {
                kinesisAction.setPartitionKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return kinesisAction;
    }

    private static KinesisActionJsonUnmarshaller instance;
    public static KinesisActionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new KinesisActionJsonUnmarshaller();
        return instance;
    }
}
    