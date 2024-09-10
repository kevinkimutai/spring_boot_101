package com.ctrla.runners.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/runs")
public class RunController {

//    private final RunRepository runRepository;
//
//    public RunController(RunRepository runRepository) {
//        this.runRepository = runRepository;
//    }
//
//    @GetMapping()
//    public List<Run> getAllRuns() {
//      return  runRepository.findAllRuns();
//    }
//
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping("/{run_id}")
//    public String getRunById(@PathVariable String run_id) {
//        //Return All Runs
//        return "/run/{run_id}: Get run by id";
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    void createRun(@RequestBody Run run) {}
}
