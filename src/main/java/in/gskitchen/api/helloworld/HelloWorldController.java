package in.gskitchen.api.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping(path = "hello")
    public String helloWorld(){
        return "Hello there!";
    }

    @GetMapping(path = "hello-bean")
    public HelloBean helloBean(){
        return new HelloBean("Hello there!", "Sabbir");
    }
    
    @GetMapping(path="/hello/{name}")
    public HelloBean hellBeanPathVar(@PathVariable String name) {
    	return new HelloBean(String.format("Hello %s", name), "sa");
    }

    @GetMapping(path = "/hello-world-in")
    public String helloWorldIn(){
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }
}
