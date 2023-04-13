package com.storytel.api;

import com.storytel.model.HelloWorld;
import com.storytel.service.ExampleService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExecuteOn(TaskExecutors.IO)
@Controller("example")
public class ExampleController {

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @Get("hello-world/{name}.txt")
    @Produces("text/plain")
    public HttpResponse<String> getHelloWorldTxt(final String name) {
        final var greet = exampleService.greetUser(name);
        logger.info("Greeting to {}", name);
        return HttpResponse.ok(greet.getGreeting());
    }

    @Get("hello-world/{name}.json")
    @Produces("application/json")
    public HttpResponse<HelloWorld> getHelloWorldJson(final String name) {
        final var greet = exampleService.greetUser(name);
        logger.info("Greeting to {}", name);
        return HttpResponse.ok(greet);
    }

}
