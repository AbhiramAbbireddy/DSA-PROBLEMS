# SPRPROB28Q

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Personalized Greeting API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Task:** 
Complete the code of a Spring Boot REST controller that provides personalized greetings based on the user’s name and role.

 **Requirements:** 

- Base URL: /api/welcome
- Endpoints: GET /api/welcome/user?name=YourName → Returns "Welcome, YourName!" GET /api/welcome/admin?name=YourName → Returns "Welcome Admin, YourName!"
- Use query parameters to pass the name.
- Make sure the controller is in com.example.demo.controller and annotated properly with @RestController and @RequestMapping("/api/welcome").

 **Expected Output:** 

- /api/welcome/user?name=Alice → "Welcome, Alice!"
- /api/welcome/admin?name=Alice → "Welcome Admin, Alice!"

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T05:47:13.535Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB28Q)