package lk.inli.rest.hello1;

import lk.inli.rest.api.HelloService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

@Api("/sayHello")
@Service
public class HelloServiceImpl1 implements HelloService {
    public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
}
