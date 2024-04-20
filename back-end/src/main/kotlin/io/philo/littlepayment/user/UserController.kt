package io.philo.littlepayment.user

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser() {
        userService.createUser()
    }

    @GetMapping("/ui")
    fun ui(model: Model): String {
        model.addAttribute("say", "Hello");
        return "something to that";
    }
}
