/*
 *  Copyright 2015 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.swagger.inflector;

import io.swagger.models.Swagger;
import org.glassfish.jersey.process.Inflector;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Response;

public class SwaggerResourceController implements Inflector<ContainerRequestContext, Response> {
    private Swagger swagger;

    public SwaggerResourceController(Swagger swagger) {
        this.swagger = swagger;
    }

    @Override
    public Response apply(ContainerRequestContext arg0) {
        return Response.ok().entity(swagger).build();
    }
}
