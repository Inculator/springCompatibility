package com.obs.observability.controllers

import com.obs.observability.service.ObservabilityService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class ObservabilityController(val observabilityService: ObservabilityService) {

    private val log: org.slf4j.Logger = LoggerFactory.getLogger(ObservabilityController::class.java)

    @GetMapping("/observe")
    fun userName(): String? {
        log.info("Got a request")
        return observabilityService.observeMyMethod()
    }
}