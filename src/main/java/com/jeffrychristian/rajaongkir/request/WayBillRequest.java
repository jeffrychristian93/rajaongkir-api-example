package com.jeffrychristian.rajaongkir.request;

/**
 * @author Jeffry Christian on 10/01/2018
 */
public class WayBillRequest {

    private String waybill; //SOCAG00183235715
    private String courier; //jne

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }
}
