package org.poet.com.poet


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class poet {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(poet::class.java, *args)
        }
    }
}