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

namespace NS\GH6714;

use Vendor\Package\TestClass1;
use function Vendor\Package\ {
            function1,
            function2,
};
use function Vendor\Package\ {
            function3,
            function4,
};
use const Vendor\Package\CONSTANT1;

class GH6714 implements Interface1,
                        Interface2,
                        Interface3 {

    public array $x = [];
    public array $y = [];

    public function test1() {
        return something1(
            $this->x,
            $this->y,
        );
    }

    public function test2(
        $param1,
        $param2,
        $param3,
    ) {
        nestedCall(
            $this->testMethod($arg1),
            $this->x,
            $this->y,
        );
        return nestedCall(
            $this->testMethod($arg1),
            $this->x,
            $this->y,
        );
    }
}

array_merge(
    $x,
    $y,
);

nestedCall(
    something(
        $arg1,
        $arg2,
        C::something(
            $x,
            $y,
            $z,
        )
    ),
    $y,
    $z,
);
