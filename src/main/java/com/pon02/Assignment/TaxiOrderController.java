package com.pon02.Assignment;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@RestController
public class TaxiOrderController {
    private final TaxiOrderService taxiOrderService;
    public TaxiOrderController(TaxiOrderService taxiOrderService) {
        this.taxiOrderService = taxiOrderService;
    }
    @GetMapping("/taxiorder")
    public List<TaxiOrder> getOrders() {
        return taxiOrderService.findAllOrders();
    }
    @GetMapping("/taxicompany")
    public List<TaxiCompany> getCompanies() {
        return taxiOrderService.findAllCompanies();
    }
    @GetMapping("/cartype")
    public List<CarType> getCarTypes() {
        return taxiOrderService.findAllCarTypes();
    }
    @GetMapping("/staffsection")
    public List<StaffSection> getStaffSections() {
        return taxiOrderService.findAllStaffSections();
    }
    @GetMapping("/taxiorder/company")
    public TaxiOrder getOrderByCompanyId(@RequestParam int taxi_company_id) {
        return taxiOrderService.findOrderByCompanyId(taxi_company_id);
    }
}
