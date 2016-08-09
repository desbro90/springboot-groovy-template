package sample.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @Value('${testValue:default value}')
    String text

    @RequestMapping('/')
    index() {
        [text:this.text]
    }
}