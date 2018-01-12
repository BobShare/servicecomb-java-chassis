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

package io.servicecomb.common.rest.definition;

import java.util.Arrays;

import javax.ws.rs.core.MediaType;

import io.servicecomb.core.definition.OperationMeta;
import mockit.Deencapsulation;

public class UnitTestRestUtils {
  public static RestOperationMeta createRestOperationMeta(String httpMethod, String path) {
    OperationMeta om = new OperationMeta();
    om.setHttpMethod(httpMethod);

    RestOperationMeta rom = new RestOperationMeta();
    rom.setOperationMeta(om);
    rom.setAbsolutePath(path);
    Deencapsulation.setField(rom, "produces", Arrays.asList(MediaType.APPLICATION_JSON));
    return rom;
  }
}