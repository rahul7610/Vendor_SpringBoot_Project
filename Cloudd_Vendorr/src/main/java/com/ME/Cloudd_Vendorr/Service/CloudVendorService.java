package com.ME.Cloudd_Vendorr.Service;

import java.util.List;

import com.ME.Cloudd_Vendorr.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudvendorId);
	public CloudVendor getCloudVendor(String cloudvendorId);
	public List<CloudVendor> getAllCloudvendor();
	

}
