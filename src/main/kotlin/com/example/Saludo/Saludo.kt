package com.example.demo.Saludo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StatusController {

    @GetMapping("/status")
    fun getStatus(): Map<String, String> {
        return mapOf("message" to "Ok")
    }
}