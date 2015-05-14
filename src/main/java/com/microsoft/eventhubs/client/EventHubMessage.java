/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.microsoft.eventhubs.client;

public class EventHubMessage {
  private String offset;
  private long sequence;
  private long enqueuedTimestamp;
  private String data;

  public EventHubMessage(String offset, long sequence, long enqueuedTimestamp, String data) {
    this.offset = offset;
    this.sequence = sequence;
    this.enqueuedTimestamp = enqueuedTimestamp;
    this.data = data;
  }

  public String getOffset() {
    return offset;
  }

  public long getSequence() {
    return sequence;
  }

  public long getEnqueuedTimestamp() {
    return enqueuedTimestamp;
  }

  public String getData() {
    return data;
  }
}
