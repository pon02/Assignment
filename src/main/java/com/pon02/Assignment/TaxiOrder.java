package com.pon02.Assignment;

public class TaxiOrder {
    private int id;
    private int taxi_company_id;
    private int car_type_id;
    private int staff_section_id;
    private int number_of_people;

    public TaxiOrder(int id, int taxi_company_id, int car_type_id, int staff_section_id, int number_of_people) {
        this.id = id;
        this.taxi_company_id = taxi_company_id;
        this.car_type_id = car_type_id;
        this.staff_section_id = staff_section_id;
        this.number_of_people = number_of_people;
    }

    public int getId() {
        return id;
    }

    public int getTaxi_company_id() {
        return taxi_company_id;
    }

    public int getCar_type_id() {
        return car_type_id;
    }

    public int getStaff_section_id() {
        return staff_section_id;
    }

    public int getNumber_of_people() {
        return number_of_people;
    }
}


