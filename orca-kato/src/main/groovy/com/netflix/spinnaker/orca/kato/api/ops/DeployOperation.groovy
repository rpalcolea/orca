/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */





package com.netflix.spinnaker.orca.kato.api.ops

import groovy.transform.CompileStatic
import com.google.common.base.Optional
import com.netflix.spinnaker.orca.kato.api.ASGCapacity
import com.netflix.spinnaker.orca.kato.api.Operation
import static com.google.common.base.Optional.absent

@CompileStatic
class DeployOperation extends Operation {
  String application
  String amiName
  Optional<String> stack = absent()
  String instanceType
  List<String> securityGroups
  Optional<String> subnetType = absent()
  Map<String, List<String>> availabilityZones
  List<String> loadBalancers
  String iamRole = absent()
  ASGCapacity capacity
  String credentials
}

