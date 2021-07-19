package com.wani.servlet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@ServletComponentScan
@SpringBootApplication
class ServletApplication

fun main(args: Array<String>) {
    runApplication<ServletApplication>(*args)
}
