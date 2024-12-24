package com.crudRepo.cloudVendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudRepo.cloudVendor.model.CloudVendor;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String>{

}
