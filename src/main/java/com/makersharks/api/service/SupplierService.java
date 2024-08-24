package com.makersharks.api.service;

import com.makersharks.api.model.*;
// import com.makersharks.api.repository.SupplierRepository;

import java.util.List;

public interface SupplierService {
    List<Supplier> findSuppliers(String location, NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess, int limit);

    
}

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class SupplierService {

// @Autowired
// private SupplierRepository supplierRepository;

// public List<Supplier> getSuppliers() {
// return supplierRepository.findAll();
// }

// Additional methods to query suppliers based on specific criteria
// }
