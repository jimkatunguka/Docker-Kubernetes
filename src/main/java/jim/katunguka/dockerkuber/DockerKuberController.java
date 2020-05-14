package jim.katunguka.dockerkuber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerKuberController {
    @GetMapping("/")
    public String name(){
        return "my name is JK";
    }
}
