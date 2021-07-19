package com.wani.servlet.basic

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "helloServlet", urlPatterns = ["/hello"])
class HelloServlet : HttpServlet() {

    override fun service(request: HttpServletRequest?, response: HttpServletResponse?) {
        println("request = $request")
        println("response = $response")
    }
}