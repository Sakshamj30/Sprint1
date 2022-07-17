package com.sprint.gharkakhana.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sprint.gharkakhana.admin.Vendor;
import com.sprint.gharkakhana.repository.VendorRepository;
@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	public Vendor createvendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	public void deletevendor(int vid) {
    	Optional<Vendor> optionalVendor= vendorRepository.findById(vid);
    	if(optionalVendor.isPresent()) {
    		vendorRepository.deleteById(vid);
    	}
	}
    	public Vendor getVendorById(int vid) {
    		Optional<Vendor> optionalVendor= vendorRepository.findById(vid);
        	if(optionalVendor.isPresent()) {
        		return optionalVendor.get();
        	}
        	else {
        		return null;
        	}
		
   	}
        public void updatevendor(Vendor newVendor, int vid) {
       
        }
     

}
