package test.WoW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestWoWController {
    @GetMapping("/WoW")
    public String retriveTestWoW(){
        return "WoW , Testing in progress";
    }
}
