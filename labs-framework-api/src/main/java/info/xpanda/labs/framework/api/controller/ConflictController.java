package info.xpanda.labs.framework.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictController {
    @RequestMapping("/conflict")
    public String conflict(){
        return "conflict";
    }
}
