package com.ME.Cloudd_Vendorr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ME.Cloudd_Vendorr.Service.CloudVendorService;
import com.ME.Cloudd_Vendorr.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{
//	@Autowired
//    private CloudVendorService cloudVendorService;
	
	CloudVendorService cloudVendorService;
	
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
	super();
	this.cloudVendorService = cloudVendorService;
}

	// Read Specific Cloud Vendor
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	// Read All Cloud Vendor
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudvendor();
	}
	
	@PostMapping()
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created Successfully";
	}
	
	
	
	@PutMapping()
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud Vendor Deleted Successfully";
	}	
}
