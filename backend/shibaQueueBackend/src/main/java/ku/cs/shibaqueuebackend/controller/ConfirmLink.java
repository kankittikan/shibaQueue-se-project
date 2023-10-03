package ku.cs.shibaqueuebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("/confirmation")
public class ConfirmLink {

    @GetMapping("{uuid}")
    @ResponseBody
    public String confirmLink(@PathVariable String uuid) {
        return "uuid";
    }
}
