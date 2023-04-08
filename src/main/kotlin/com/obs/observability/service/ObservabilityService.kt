package com.obs.observability.service

import io.micrometer.observation.annotation.Observed
import org.springframework.stereotype.Service

@Service
@Observed(name = "observabilityService")
class ObservabilityService {

    @Observed(name = "observe.method",
        contextualName = "getting-observed")
    fun observeMyMethod() = "I am observing the method"
}