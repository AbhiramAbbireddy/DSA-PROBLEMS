@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    // GET /api/welcome/user?name=YourName
    @GetMapping("/user")
    public String welcomeUser(@RequestParam String name) {
        return "Welcome, "+name+"!";
        // TODO: Return a greeting for a normal user

    }

    // GET /api/welcome/admin?name=YourName
    @GetMapping("/admin")
    public String welcomeAdmin(@RequestParam String name) {
        return "Welcome Admin, "+name+"!";

        // TODO: Return a greeting for an admin

import org.springframework.web.bind.annotation.*;
