
package com.Pooja.FirstSpringApp;

import com.Pooja.DTO.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping()
    public String sayHello() {

        return "Hello From Pooja - GET REGUEST ";
    }
    @PutMapping()
        public String putHello(){
            return "Hello from Pooja - PUT REQUEST ";

    }
    @PostMapping()
    public String postHello(){

        return "Hello from Pooja -POST REQUEST";
    }
    @DeleteMapping()
    public String deleteHello(){

        return "Hello from Pooja-DELETE REQUEST";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " !";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }


}
