<?php
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
namespace Existing\NS\Test;

use Mixed\Uses01\Type01;
use Mixed\Uses03\Sub01\Sub02\{
    Type03
};
use Mixed\Uses05\Type05;

use function Mixed\Uses01\funciton11, Mixed\Uses01\funciton13;
use function Mixed\Uses03\function31;
use function Mixed\Uses05\Sub01\{
    function51,
    Sub02\function53,
    Sub03\Sub04\function55,
};
use function Mixed\Uses07\function71;

class Class1 {
    // test
}
