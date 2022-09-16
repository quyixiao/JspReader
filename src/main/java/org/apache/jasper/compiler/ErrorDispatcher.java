/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jasper.compiler;


/**
 * Class responsible for dispatching JSP parse and javac compilation errors
 * to the configured error handler.
 *
 * This class is also responsible for localizing any error codes before they
 * are passed on to the configured error handler.
 *
 * In the case of a Java compilation error, the compiler error message is
 * parsed into an array of JavacErrorDetail instances, which is passed on to
 * the configured error handler.
 *
 * @author Jan Luehe
 * @author Kin-man Chung
 */
public class ErrorDispatcher {


    public void jspError(Mark mark, String s) {



    }



    public void jspError(String mark, String s) {



    }
}
