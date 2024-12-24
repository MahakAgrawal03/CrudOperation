package com.crudRepo.cloudVendor.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudRepo.cloudVendor.exception.CloudVendorNotFoundException;
import com.crudRepo.cloudVendor.model.CloudVendor;
import com.crudRepo.cloudVendor.repository.CloudVendorRepo;
import com.crudRepo.cloudVendor.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    
    CloudVendorRepo cloudvendorrepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudvendorrepo) {
        this.cloudvendorrepo=cloudvendorrepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudvendor) {
        cloudvendorrepo.save(cloudvendor);
       return "Data created successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudvendor) {
        cloudvendorrepo.save(cloudvendor);
        return "Successfully updated data";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudvendorrepo.deleteById(cloudVendorId);
      return "Successfully deleted";
       
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        //put more bussiness logic
        if(cloudvendorrepo.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("requested cloud vendor does not exists");
        else
            return cloudvendorrepo.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudvendorrepo.findAll();
    }

}
