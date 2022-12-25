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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.apache.ofbiz.widget.renderer.macro;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public final class MacroCallParameterStringValueEndsWithMatcher extends TypeSafeMatcher<Object> {
    private final String endsWith;

    public MacroCallParameterStringValueEndsWithMatcher(final String endsWith) {
        this.endsWith = endsWith;
    }

    @Override
    protected boolean matchesSafely(final Object item) {
        return item != null && item instanceof String && ((String) item).endsWith(endsWith);
    }

    @Override
    public void describeTo(final Description description) {
        description.appendText("ends with '" + endsWith + "'");
    }

    @Override
    protected void describeMismatchSafely(final Object item, final Description mismatchDescription) {
        mismatchDescription.appendText("with value '" + item + "'");
    }
}
