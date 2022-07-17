package com.sprint.gharkakhana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.gharkakhana.admin.Vendor;
import com.sprint.gharkakhana.service.VendorService;
@RestController
@RequestMapping
public class VendorController {
	@Autowired
	private VendorService vendorService;

	@GetMapping("/{id}")
	public Vendor getVendorById(@PathVariable int vid) {
		return vendorService.getVendorById(vid);
	}
	@PostMapping("/add")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		return vendorService.createvendor(vendor);
		
	}
	@DeleteMapping("/delete/{vid}")
	public void deleteVendor(@pathVariable int vid) {
		vendorService.deletevendor(vid);
	}
	

}
