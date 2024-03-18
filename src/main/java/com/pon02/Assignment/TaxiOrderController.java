package com.pon02.Assignment;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class TaxiOrderController {
    private final TaxiOrderMapper taxiOrderMapper;
    public TaxiOrderController(TaxiOrderMapper taxiOrderMapper) {
        this.taxiOrderMapper = taxiOrderMapper;
    }
    @GetMapping("/taxiorder")
    public List<TaxiOrder> findAllOrders() {
        return taxiOrderMapper.findAllOrders();
    }
    @GetMapping("/taxicompany")
    public List<TaxiCompany> findAllCompanies() {
        return taxiOrderMapper.findAllCompanies();
    }
    @GetMapping("/cartype")
    public List<CarType> findAllCarTypes() {
        return taxiOrderMapper.findAllCarTypes();
    }
    @GetMapping("/staffsection")
    public List<StaffSection> findAllStaffSections() {
        return taxiOrderMapper.findAllStaffSections();
    }
    @GetMapping("/taxiorder/company")
    public List<TaxiOrder> findByTaxiCompany(@RequestParam int taxi_company_id) {
        return taxiOrderMapper.findByTaxiCompany(taxi_company_id);
    }
}
