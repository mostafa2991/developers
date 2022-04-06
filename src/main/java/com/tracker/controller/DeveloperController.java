package com.tracker.controller;

import com.tracker.dto.DeveloperDto;
import com.tracker.dto.ValidDroneDto;
import com.tracker.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/developers")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @PostMapping("/addDeveloper")
    public ResponseEntity<DeveloperDto> addDeveloper(@Valid @RequestBody DeveloperDto developerDto) {
        return ResponseEntity.ok(this.developerService.addDeveloper(developerDto));
    }
    @GetMapping("/developer/{name}")
    public ResponseEntity<DeveloperDto> getDeveloperByName(@PathVariable String name) {
        return ResponseEntity.ok().body(this.developerService.getDeveloperByName(name));
    }

    @GetMapping("/all")
    public ResponseEntity<List<DeveloperDto>> getAllDevelopers() {
        return ResponseEntity.ok(this.developerService.getAllDevelopers());
    }
    @PutMapping("/updateDeveloper")
    public ResponseEntity<DeveloperDto> updateDeveloper(@Valid @RequestBody DeveloperDto developerDto) {
        return ResponseEntity.ok(this.developerService.updateDeveloper(developerDto));
    }

    @DeleteMapping("/developer/{name}")
    public ResponseEntity<String> deleteDeveloperByName(@PathVariable String name) {
        String msg =this.developerService.deleteDeveloperByName(name);
        return ResponseEntity.ok().body(msg);
    }
}

