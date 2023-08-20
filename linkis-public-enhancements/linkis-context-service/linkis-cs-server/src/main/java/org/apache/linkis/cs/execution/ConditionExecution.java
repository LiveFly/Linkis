/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.cs.execution;

import org.apache.linkis.cs.common.entity.source.ContextKeyValue;
import org.apache.linkis.cs.condition.Condition;
import org.apache.linkis.cs.contextcache.ContextCacheService;
import org.apache.linkis.cs.execution.fetcher.ContextCacheFetcher;
import org.apache.linkis.cs.execution.matcher.ContextSearchMatcher;
import org.apache.linkis.cs.execution.ruler.ContextSearchRuler;

import java.util.List;

public interface ConditionExecution {

  ContextSearchMatcher getContextSearchMatcher();

  ContextSearchRuler getContextSearchRuler();

  ContextCacheFetcher getContextCacheFetcher();

  List<ContextKeyValue> execute();

  void setContextCacheService(ContextCacheService contextCacheService);

  ContextCacheService getContextCacheService();

  Condition getCondition();
}
