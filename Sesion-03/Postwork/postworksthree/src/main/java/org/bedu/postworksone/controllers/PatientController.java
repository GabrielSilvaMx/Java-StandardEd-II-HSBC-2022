package org.bedu.postworksone.controllers;

import org.bedu.postworksone.documents.Patient;
import org.bedu.postworksone.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Patient")
public class PatientController {

	@Autowired
	PatientRepository patientRepository;

	@GetMapping("/{id}")
	Patient getPatient(@PathVariable String id) {
		return patientRepository.findById(id).get();
	}
	
	@PostMapping
	Patient savePatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	
	@DeleteMapping("/{id}")
	void deletePatient(@PathVariable String id) {
		 patientRepository.deleteById(id);
	}
	
	@PutMapping
	Patient updatePatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
}
