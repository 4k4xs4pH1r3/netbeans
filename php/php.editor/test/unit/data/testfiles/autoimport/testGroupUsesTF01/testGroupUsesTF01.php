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

use Group\Uses01\{
    Type01,
    Type03 as Alias1,
};
use function Group\Uses01\{
    function01, // comment
    function04 as Alias2, /* comment */
    Sub\function06, /** comment */
};
use function Group\Uses03\{
    function07, // comment
    function09, /* comment */
    Sub\function10, /** comment */
};

class Class1 {
    // test
}
