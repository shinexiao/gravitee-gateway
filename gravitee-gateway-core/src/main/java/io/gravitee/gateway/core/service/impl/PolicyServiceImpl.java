/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.gateway.core.service.impl;

import io.gravitee.gateway.core.policy.PolicyDefinition;
import io.gravitee.gateway.core.policy.PolicyWorkspace;
import io.gravitee.gateway.core.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyWorkspace policyWorkspace;

    @Override
    public Set<PolicyDefinition> findAll() {
        return new HashSet<>(policyWorkspace.getPolicyDefinitions());
    }

    @Override
    public PolicyDefinition get(String name) {
        return policyWorkspace.getPolicyDefinition(name);
    }
}