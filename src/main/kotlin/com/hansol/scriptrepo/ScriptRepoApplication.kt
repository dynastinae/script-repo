package com.hansol.scriptrepo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScriptRepoApplication

fun main(args: Array<String>) {
    runApplication<ScriptRepoApplication>(*args)
}
