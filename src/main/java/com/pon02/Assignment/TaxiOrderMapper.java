package com.pon02.Assignment;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaxiOrderMapper {
    @Select( "SELECT * FROM taxi_orders")
    List<TaxiOrder> findAllOrders();

    @Select("SELECT * FROM taxi_companies")
    List<TaxiCompany> findAllCompanies();

    @Select("SELECT * FROM car_types")
    List<CarType> findAllCarTypes();

    @Select("SELECT * FROM staff_sections")
    List<StaffSection> findAllStaffSections();

    @Select("SELECT * FROM taxi_orders WHERE taxi_company_id = #{taxi_company_id}")
    List<TaxiOrder> findOrderByCompanyId(int taxi_company_id);
}
