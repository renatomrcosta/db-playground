package com.xunfos.dbplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<DbPlaygroundApplication>(*args)
}
