package com.ME.Cloudd_Vendorr.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ME.Cloudd_Vendorr.Repository.CloudVendorRepository;
import com.ME.Cloudd_Vendorr.model.CloudVendor;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;
	
	

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
	
		return "success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}

	@Override
	public String deleteCloudVendor(String cloudvendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(cloudvendorId);
		return "success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudvendorId) {
		// TODO Auto-generated method stub
		
		return cloudVendorRepository.findById(cloudvendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudvendor() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}
