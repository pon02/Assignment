package com.pon02.Assignment;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class TaxiOrderService {
    private final TaxiOrderMapper taxiOrderMapper;
    public TaxiOrderService(TaxiOrderMapper taxiOrderMapper) {
        this.taxiOrderMapper = taxiOrderMapper;
    }
    public List<TaxiOrder> findAllOrders() {
        return this.taxiOrderMapper.findAllOrders();
    }
    public List<TaxiCompany> findAllCompanies() {
        return this.taxiOrderMapper.findAllCompanies();
    }
    public List<CarType> findAllCarTypes() {
        return this.taxiOrderMapper.findAllCarTypes();
    }
    public List<StaffSection> findAllStaffSections() {
        return this.taxiOrderMapper.findAllStaffSections();
    }

    public TaxiOrder findOrderByCompanyId(int taxi_company_id) {
        Optional<TaxiOrder> taxiOrder = this.taxiOrderMapper.findOrderByCompanyId(taxi_company_id);
        if (taxiOrder.isPresent()) {
            return taxiOrder.get();
        } else {
            throw new TaxiOrderNotFoundException("Taxi order not found", null);
        }
    }
}
