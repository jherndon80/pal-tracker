package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TimeEntryController {

    //@Autowired
    private TimeEntryRepository repo;

    public TimeEntryController(TimeEntryRepository repo){
        this.repo = repo;
    }

    @PostMapping("/time-entries")
    public ResponseEntity create(@RequestBody TimeEntry timeEntry){
        TimeEntry newEntry = repo.create(timeEntry);
        ResponseEntity<TimeEntry> response = new ResponseEntity<TimeEntry>(newEntry,HttpStatus.CREATED);
        return response;
    }

    @GetMapping("/time-entries/{id}")
    public ResponseEntity read(@PathVariable("id") Long id){
        TimeEntry timeEntry = repo.find(id);
        if(timeEntry == null){
            return ResponseEntity.notFound().build();
        }
        ResponseEntity<TimeEntry> response = new ResponseEntity<TimeEntry>(timeEntry,HttpStatus.OK);
        return response;
    }

    @GetMapping("/time-entries")
    public ResponseEntity list() {
        List<TimeEntry> timeEntries = repo.list();
        ResponseEntity<List<TimeEntry>> repsonse = new ResponseEntity<>(timeEntries,HttpStatus.OK);
        return repsonse;
    }

    @PutMapping("/time-entries/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody TimeEntry timeEntry){
        TimeEntry newEntry = repo.update(id,timeEntry);
        if(newEntry == null){
            return ResponseEntity.notFound().build();
        }
        ResponseEntity<TimeEntry> response = new ResponseEntity<TimeEntry>(newEntry,HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/time-entries/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        repo.delete(id);
        ResponseEntity response = ResponseEntity.noContent().build();
        return response;
    }
}
