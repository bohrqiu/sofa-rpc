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
package com.alipay.sofa.rpc.transport.triple;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author junyuan
 * @version TripleClientTransportTest.java, v 0.1 2024-08-01 17:12 junyuan Exp $
 */
public class TripleClientTransportTest {

    @Test
    public void testInit() {

        Assert.assertEquals(TripleClientTransport.KEEP_ALIVE_INTERVAL, 0);

    }
}