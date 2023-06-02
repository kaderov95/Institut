package ru.kaderov.test_rest_service.service;

import ru.kaderov.test_rest_service.model.Response;

public interface SenderMsg {
    Response send (Response response);
}
