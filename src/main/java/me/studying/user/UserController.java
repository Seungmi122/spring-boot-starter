package me.studying.user;

import me.studying.SampleController;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class UserController {

    @GetMapping("/hellos")
    public String hello(){
        return "hello";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }

    @GetMapping("/bye")
    public Resource<Bye> bye() {
        Bye bye = new Bye();
        bye.setPrefix("Thanks,");
        bye.setName("seungmi");

        Resource<Bye> byeResource = new Resource<>(bye);
        byeResource.add(linkTo(methodOn(UserController.class).bye()).withSelfRel());
        return byeResource;
    }

}
