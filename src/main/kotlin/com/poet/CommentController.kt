package org.poet.com.poet

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList

import org.springframework.boot.ApplicationArguments

import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import java.lang.Exception
import org.springframework.http.HttpStatus

import org.springframework.web.bind.annotation.PostMapping

import org.springframework.web.bind.annotation.GetMapping


@CrossOrigin
@RestController
class CommentController {

    var poetStr: String = "data";

    @GetMapping("/achieve")
    fun returnPoet(): String? {
        return poetStr+"back"
    }

    @PostMapping("/submit")     //post
    fun GetPoet(text: String): String? {
        if (text.length > 10 ) {
            HttpStatus.valueOf(400)
        } else {
            poetStr = text;
            print(poetStr);

        }
        return "status"
    }
}