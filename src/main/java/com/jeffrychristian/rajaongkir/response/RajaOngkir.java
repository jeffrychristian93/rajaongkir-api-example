package com.jeffrychristian.rajaongkir.response;

import java.util.List;

/**
 * @author Jeffry Christian on 10/01/2018
 */
public class RajaOngkir {

    private Query query;
    private Status status;
    private Result result;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    private static class Query {
        private String waybill;
        private String courier;

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
    private static class Status {
        private Integer code;
        private String description;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
    private static class Result {
        private Boolean deivered;
        private Summary summary;
        private Details details;
        private DeliveryStatus delivery_status;
        private List<Manifest> manifest;

        public Boolean getDeivered() {
            return deivered;
        }

        public void setDeivered(Boolean deivered) {
            this.deivered = deivered;
        }

        public Summary getSummary() {
            return summary;
        }

        public void setSummary(Summary summary) {
            this.summary = summary;
        }

        public Details getDetails() {
            return details;
        }

        public void setDetails(Details details) {
            this.details = details;
        }

        public DeliveryStatus getDelivery_status() {
            return delivery_status;
        }

        public void setDelivery_status(DeliveryStatus delivery_status) {
            this.delivery_status = delivery_status;
        }

        public List<Manifest> getManifest() {
            return manifest;
        }

        public void setManifest(List<Manifest> manifest) {
            this.manifest = manifest;
        }

        private static class Summary {
            private String courier_code;
            private String courier_name;
            private String waybill_number;
            private String service_code;
            private String waybill_date;
            private String shipper_name;
            private String receiver_name;
            private String origin;
            private String destination;
            private String status;

            public String getCourier_code() {
                return courier_code;
            }

            public void setCourier_code(String courier_code) {
                this.courier_code = courier_code;
            }

            public String getCourier_name() {
                return courier_name;
            }

            public void setCourier_name(String courier_name) {
                this.courier_name = courier_name;
            }

            public String getWaybill_number() {
                return waybill_number;
            }

            public void setWaybill_number(String waybill_number) {
                this.waybill_number = waybill_number;
            }

            public String getService_code() {
                return service_code;
            }

            public void setService_code(String service_code) {
                this.service_code = service_code;
            }

            public String getWaybill_date() {
                return waybill_date;
            }

            public void setWaybill_date(String waybill_date) {
                this.waybill_date = waybill_date;
            }

            public String getShipper_name() {
                return shipper_name;
            }

            public void setShipper_name(String shipper_name) {
                this.shipper_name = shipper_name;
            }

            public String getReceiver_name() {
                return receiver_name;
            }

            public void setReceiver_name(String receiver_name) {
                this.receiver_name = receiver_name;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
        private static class Details {
            private String waybill_number;
            private String waybill_date;
            private String waybill_time;
            private String weight;
            private String origin;
            private String destination;
            private String shippper_name;
            private String shipper_address1;
            private String shipper_address2;
            private String shipper_address3;
            private String shipper_city;
            private String receiver_name;
            private String receiver_address1;
            private String receiver_address2;
            private String receiver_address3;
            private String receiver_city;

            public String getWaybill_number() {
                return waybill_number;
            }

            public void setWaybill_number(String waybill_number) {
                this.waybill_number = waybill_number;
            }

            public String getWaybill_date() {
                return waybill_date;
            }

            public void setWaybill_date(String waybill_date) {
                this.waybill_date = waybill_date;
            }

            public String getWaybill_time() {
                return waybill_time;
            }

            public void setWaybill_time(String waybill_time) {
                this.waybill_time = waybill_time;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getShippper_name() {
                return shippper_name;
            }

            public void setShippper_name(String shippper_name) {
                this.shippper_name = shippper_name;
            }

            public String getShipper_address1() {
                return shipper_address1;
            }

            public void setShipper_address1(String shipper_address1) {
                this.shipper_address1 = shipper_address1;
            }

            public String getShipper_address2() {
                return shipper_address2;
            }

            public void setShipper_address2(String shipper_address2) {
                this.shipper_address2 = shipper_address2;
            }

            public String getShipper_address3() {
                return shipper_address3;
            }

            public void setShipper_address3(String shipper_address3) {
                this.shipper_address3 = shipper_address3;
            }

            public String getShipper_city() {
                return shipper_city;
            }

            public void setShipper_city(String shipper_city) {
                this.shipper_city = shipper_city;
            }

            public String getReceiver_name() {
                return receiver_name;
            }

            public void setReceiver_name(String receiver_name) {
                this.receiver_name = receiver_name;
            }

            public String getReceiver_address1() {
                return receiver_address1;
            }

            public void setReceiver_address1(String receiver_address1) {
                this.receiver_address1 = receiver_address1;
            }

            public String getReceiver_address2() {
                return receiver_address2;
            }

            public void setReceiver_address2(String receiver_address2) {
                this.receiver_address2 = receiver_address2;
            }

            public String getReceiver_address3() {
                return receiver_address3;
            }

            public void setReceiver_address3(String receiver_address3) {
                this.receiver_address3 = receiver_address3;
            }

            public String getReceiver_city() {
                return receiver_city;
            }

            public void setReceiver_city(String receiver_city) {
                this.receiver_city = receiver_city;
            }
        }
        private static class DeliveryStatus {
            private String status;
            private String pod_receiver;
            private String pod_date;
            private String pod_time;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getPod_receiver() {
                return pod_receiver;
            }

            public void setPod_receiver(String pod_receiver) {
                this.pod_receiver = pod_receiver;
            }

            public String getPod_date() {
                return pod_date;
            }

            public void setPod_date(String pod_date) {
                this.pod_date = pod_date;
            }

            public String getPod_time() {
                return pod_time;
            }

            public void setPod_time(String pod_time) {
                this.pod_time = pod_time;
            }
        }
        private static class Manifest {
            private String manifest_code;
            private String manifest_description;
            private String manifest_date;
            private String manifest_time;
            private String city_name;

            public String getManifest_code() {
                return manifest_code;
            }

            public void setManifest_code(String manifest_code) {
                this.manifest_code = manifest_code;
            }

            public String getManifest_description() {
                return manifest_description;
            }

            public void setManifest_description(String manifest_description) {
                this.manifest_description = manifest_description;
            }

            public String getManifest_date() {
                return manifest_date;
            }

            public void setManifest_date(String manifest_date) {
                this.manifest_date = manifest_date;
            }

            public String getManifest_time() {
                return manifest_time;
            }

            public void setManifest_time(String manifest_time) {
                this.manifest_time = manifest_time;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }
        }

    }
}
