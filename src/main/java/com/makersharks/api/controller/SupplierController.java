package com.makersharks.api.controller;

import com.makersharks.api.model.*;
import com.makersharks.api.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    // DTO to accept the request body
    public static class SupplierQueryDTO {
        private String location;
        private NatureOfBusiness natureOfBusiness;
        private ManufacturingProcess manufacturingProcess;
        private int limit; // Default limit value

        // Getters and setters
        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public NatureOfBusiness getNatureOfBusiness() {
            return natureOfBusiness;
        }

        public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
            this.natureOfBusiness = natureOfBusiness;
        }

        public ManufacturingProcess getManufacturingProcess() {
            return manufacturingProcess;
        }

        public void setManufacturingProcess(ManufacturingProcess manufacturingProcess) {
            this.manufacturingProcess = manufacturingProcess;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }
    }

    @PostMapping("/query")
    public List<Supplier> querySuppliers(@RequestBody SupplierQueryDTO request) {
        return supplierService.findSuppliers(
            request.getLocation(),
            request.getNatureOfBusiness(),
            request.getManufacturingProcess(),
            request.getLimit()
        );
    }

    @GetMapping("/search")
    public List<Supplier> searchSuppliers(
        @RequestParam String location,
        @RequestParam NatureOfBusiness natureOfBusiness,
        @RequestParam ManufacturingProcess manufacturingProcess,
        @RequestParam(defaultValue = "10") int limit) {
        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess, limit);
}

}
