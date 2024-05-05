package com.basicayth.naukaba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ExampleController {

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "This is a secure endpoint accessible to authenticated users.";
    }

    @GetMapping("/admin")
    public String adminOnlyEndpoint() {
        return "This endpoint is only accessible by users with the ADMIN role.";
    }
}