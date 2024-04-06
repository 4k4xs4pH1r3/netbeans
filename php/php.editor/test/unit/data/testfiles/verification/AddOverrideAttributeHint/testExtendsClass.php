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
class ChildClass extends ParentClass implements Interface1 {

    #[\Override]
    public function parentMethod1(): void {} // no hints

    #[Attr1]
    #[Override]
    public function parentMethod2(): void {} // no hints

    public function parentMethod3(): void {} // hints

    #[Attr1] //comment
    public function parentMethod4(): void { // hints
    }

    #[Attr1] /* comment */
    public function parentMethod5(): void {} // hints

    #[Attr1]
    public static function parentPublicStaticMethod1(): void {} // hints

    protected static function parentProtectedStaticMethod1(): void {} // hints

    protected function parentProtectedMethod1(): void { // hints
    }

    public function childMethodNoHints(): int {return 0;} // no hints

    /**
     * PHPDoc.
     *
     * @return void
     */
    public function interfaceMethod1(): void { // hints
    }
}
