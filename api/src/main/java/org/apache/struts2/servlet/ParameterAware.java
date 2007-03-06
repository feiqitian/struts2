/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.struts2.servlet;

import java.util.Map;

/**
 * Implemented by actions which need direct access to the request parameters.
 *
 * @author crazybob@google.com (Bob Lee)
 */
public interface ParameterAware {

    /**
     * Sets parameters.
     *
     * @param parameters map of parameter name to parameter values
     */
    void setParameters(Map<String, String[]> parameters);
}