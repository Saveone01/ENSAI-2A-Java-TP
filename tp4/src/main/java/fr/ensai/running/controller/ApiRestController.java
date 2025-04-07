package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {
        return athleteService.findAll();
    }

    /**
     * Get athlete by ID
     */
    @GetMapping("/athlete/{id}")
    public ResponseEntity<Athlete> getAthleteById(@PathVariable(value = "id") long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete != null) {
            return ResponseEntity.ok(athlete);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Delete athlete by ID
     */
    @DeleteMapping("/athlete/{id}")
    public ResponseEntity<Athlete> deleteAthleteById(@PathVariable(value = "id") long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete != null) {
            athleteService.deleteById(id);
            return ResponseEntity.ok(athlete);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Create athlete
     */
    @PostMapping("/athlete")
    public ResponseEntity<Athlete> saveAthlete(@RequestBody Athlete athlete) {
        Athlete savedAthlete = athleteService.save(athlete);
        return ResponseEntity.ok(savedAthlete);
    }
}
