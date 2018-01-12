/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicecomb.serviceregistry.api.request;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestUpdatePropertiesRequest {
  @Test
  public void testProperties() {
    UpdatePropertiesRequest request = new UpdatePropertiesRequest();

    Assert.assertEquals(null, request.getProperties());

    Map<String, String> properties = new HashMap<>();
    properties.put("k", "v");
    request.setProperties(properties);
    Assert.assertEquals(properties, request.getProperties());
  }
}