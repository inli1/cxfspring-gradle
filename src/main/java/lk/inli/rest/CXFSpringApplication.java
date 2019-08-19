package lk.inli.rest;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;

@SpringBootApplication
@EnableEurekaClient
public class CXFSpringApplication {
    @Autowired
    private Bus bus;

    public static void main(String[] args) {
        SpringApplication.run(CXFSpringApplication.class, args);
    }

    @Bean
    public Sampler getSampler() {
        return new AlwaysSampler();
    }

    /*@Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setServiceBeans(Arrays.<Object>asList(new HelloServiceImpl1(), new HelloServiceImpl2()));
        endpoint.setAddress("/");
        endpoint.setFeatures(Arrays.asList(createOpenApiFeature(), new LoggingFeature()));
        return endpoint.create();
    }

    @Bean
    public OpenApiFeature createOpenApiFeature() {
        final OpenApiFeature openApiFeature = new OpenApiFeature();
        openApiFeature.setPrettyPrint(true);
        openApiFeature.setTitle("CXF REST Application with Spring Boot");
        openApiFeature.setContactName("Indika Liyanage");
        openApiFeature.setDescription("This uses CXF JAX-RS services with Spring Boot."
                                    + "This has two JAX-RS class resources being deployed in a single JAX-RS endpoint.");
        openApiFeature.setVersion("1.0.0");
        openApiFeature.setSwaggerUiConfig(new SwaggerUiConfig().url("/services/helloservice/openapi.json"));
        return openApiFeature;
    }*/
}
