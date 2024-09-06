package com.ctrla.runners.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/runs")
public class RunController {

    @GetMapping()
    public String getAllRuns() {
        //Return All Runs
        return "/run:Get all runs route";
    }

    @GetMapping("/{run_id}")
    public String getRunById(@PathVariable String run_id) {
        //Return All Runs
        return "/run/{run_id}: Get run by id";
    }
}
