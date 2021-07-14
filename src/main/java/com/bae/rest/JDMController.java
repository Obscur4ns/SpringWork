package com.bae.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.data.JDMicon;
import com.bae.service.JDMService;

@RestController
public class JDMController {

	private JDMService service;

	public JDMController(JDMService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Welcome";
	}

	@PostMapping("/createIcon")
	public void createIcon(@RequestBody JDMicon icon) {
		this.service.createJDMicon(icon);
	}

	@GetMapping("/getIcon/{id}")
	public JDMicon getIcon() {
		return this.service.getJDMicon(1);

	}

	@GetMapping("/getAllIcon")
	public List<JDMicon> getAllIcon() {
		return this.service.getAllJDMicon();
	}

	@PutMapping("/replaceIcon/{id}")
	public Object replaceIcon(@PathVariable int id, @RequestBody JDMicon newJDMicon) {
		return this.service.replaceJDMicon(id, newJDMicon);
	}

	@DeleteMapping("/deleteIcon/{id}")
	public String deleteIcon(@PathVariable int id) {
		return this.service.deleteJDMicon(id);
	}

	@Override
	public String toString() {
		return "JDMController [getIcon()=" + getIcon() + ", toString()=" + super.toString() + "]";
	}

}
