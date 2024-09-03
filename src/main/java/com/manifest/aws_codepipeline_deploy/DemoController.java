package com.manifest.aws_codepipeline_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/home")
    public String home() {
        return "Message from AWS ECS demo setup";
    }
}
