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
package org.netbeans.modules.jakarta.web.beans.analysis.analyzer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import org.netbeans.modules.jakarta.web.beans.analysis.CdiAnalysisResult;
import org.netbeans.modules.jakarta.web.beans.analysis.analyzer.annotation.InterceptorBindingMembersAnalyzer;
import org.netbeans.modules.jakarta.web.beans.analysis.analyzer.annotation.QualifierAnalyzer;
import org.netbeans.modules.jakarta.web.beans.analysis.analyzer.annotation.ScopeAnalyzer;


/**
 * @author ads
 *
 */
public class AnnotationElementAnalyzer implements ElementAnalyzer {
    
    /* (non-Javadoc)
     * @see org.netbeans.modules.jakarta.web.beans.analysis.analizer.ElementAnalyzer#analyze(javax.lang.model.element.Element, javax.lang.model.element.TypeElement, org.netbeans.api.java.source.CompilationInfo, java.util.List, java.util.concurrent.atomic.AtomicBoolean)
     */
    @Override
    public void analyze( Element element, TypeElement parent,
            AtomicBoolean cancel, CdiAnalysisResult result )
    {
        TypeElement subject = (TypeElement) element;
        for( AnnotationAnalyzer analyzer : ANALYZERS ){
            if ( cancel.get() ){
                return;
            }
            analyzer.analyze( subject, cancel , result );
        }
    }

    public interface AnnotationAnalyzer {
        public static final String INCORRECT_RUNTIME = "ERR_IncorrectRuntimeRetention"; //NOI18N
        
        void analyze( TypeElement element , AtomicBoolean cancel,
                CdiAnalysisResult result );
    }

    private static final List<AnnotationAnalyzer> ANALYZERS = 
        new LinkedList<AnnotationAnalyzer>(); 
    
    static {
        ANALYZERS.add( new ScopeAnalyzer() );
        ANALYZERS.add( new QualifierAnalyzer() );
        ANALYZERS.add( new InterceptorBindingMembersAnalyzer() );
    }

}
