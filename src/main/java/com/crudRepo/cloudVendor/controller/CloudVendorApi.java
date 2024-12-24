// package com.crudRepo.cloudVendor.controller;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.crudRepo.cloudVendor.model.CloudVendor;

// //basic crud operation without intract with db 
// @RestController
// @RequestMapping("/cloudvendor")
// public class CloudVendorApi {
  
//   CloudVendor cloudVendor;
  
//   @GetMapping("{vendorID}")
//   public CloudVendor getCloudVendorDtails(String vendorId){
//       return cloudVendor;
//   }

//   @PostMapping
//   public String createCloudVendorDtails(@RequestBody CloudVendor cloudVendor) {
//       this.cloudVendor=cloudVendor;
//       return "cloud vendor created Successfully";
//   }

//   @PutMapping
//   public String updateCloudVendorDtails(@RequestBody CloudVendor cloudVendor) {
//       this.cloudVendor = cloudVendor;
//       return "cloud vendor updated Successfully";
//   }

//   @DeleteMapping("{vendorID}")
//   public CloudVendor deleteCloudVendorDtails(String vendorId) {
//       this.cloudVendor=null;
//       return cloudVendor;
//   }
// }
