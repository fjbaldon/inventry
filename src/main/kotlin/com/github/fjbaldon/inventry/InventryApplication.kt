package com.github.fjbaldon.inventry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InventryApplication

fun main(args: Array<String>) {
    runApplication<InventryApplication>(*args)
}
