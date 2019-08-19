package lk.inli.rest.hello2;

import lk.inli.rest.api.HelloService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;


@Path("/sayHello2")
@Api("/sayHello2")
@Service
public class HelloServiceImpl2 implements HelloService {

    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
}