package com.samusof.tracklanguagetrack;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder().group("public-apis").pathsToMatch("/**").build();
    }

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("API title").version("API version"));
    }
}
