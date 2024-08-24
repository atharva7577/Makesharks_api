package com.makersharks.api.repository;

import com.makersharks.api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
        String location,
        NatureOfBusiness natureOfBusiness,
        ManufacturingProcess manufacturingProcess
    );


    
    
}

