package ru.kaderov.test_rest_service.service;

import org.springframework.stereotype.Service;
import ru.kaderov.test_rest_service.model.Response;

import javax.websocket.server.ServerEndpoint;

@Service
public class ModifyInformation implements MyService {
    @Override
    public Response execute(Response response) {
       response.setUid("Ого работает");
        return response;
    }
}
