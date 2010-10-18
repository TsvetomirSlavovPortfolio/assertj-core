/*
 * Created on Sep 16, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import static java.util.Collections.emptyList;

import org.fest.assertions.core.Assert;
import org.fest.assertions.internal.Objects;

/**
 * Tests for <code>{@link CollectionAssert#isNull()}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class CollectionAssert_isNull_Test extends Assert_isNull_TestCase {

  @Override Assert<?> createAssertToTest(Objects objects) {
    CollectionAssert assertions = new CollectionAssert(emptyList());
    assertions.objects = objects;
    return assertions;
  }
}