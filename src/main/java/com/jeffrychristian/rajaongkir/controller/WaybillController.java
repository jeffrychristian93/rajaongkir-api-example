package com.jeffrychristian.rajaongkir.controller;

import com.google.gson.Gson;
import com.jeffrychristian.rajaongkir.request.WayBillRequest;
import com.jeffrychristian.rajaongkir.response.WayBillResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @author Jeffry Christian on 10/01/2018
 */
@Controller
@RequestMapping("v1")
public class WaybillController {

    @Value("${api.rajaongkir.waybill}")
    private String url;

    @PostMapping("waybill")
    public ResponseEntity<?> waybill(@RequestBody WayBillRequest request){

        try {
            HttpResponse response = Request
                    .Post(url)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("key", "d6d196f89d4e8244fe22a5b817f9b3fb")
                    .bodyForm(Form.form()
                            .add("waybill",request.getWaybill())
                            .add("courier",request.getCourier())
                            .build()
                    ).execute().returnResponse();
            System.out.println(EntityUtils.toString(response.getEntity()));
            WayBillResponse billResponse = new Gson().fromJson(EntityUtils.toString(response.getEntity()), WayBillResponse.class);
            return new ResponseEntity<>(billResponse, HttpStatus.OK);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
