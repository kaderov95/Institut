package ru.kaderov.test_rest_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kaderov.test_rest_service.model.Request;
import ru.kaderov.test_rest_service.model.Response;


import javax.validation.Valid;

@RestController
public class MyController {

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@RequestBody Request request) {


        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();

        System.out.println(response.getUid());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
