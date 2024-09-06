package com.ctrla.runners.run;

import java.time.LocalDateTime;

public record Run(
        Integer run_id,
        String name,
        LocalDateTime started_at,
        LocalDateTime finished_at,
        Float kms,
        Location location
) {}
