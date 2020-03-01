package com.xebia.robotClientApp.client;

import com.xebia.robotClientApp.domain.Robot;
import com.xebia.robotClientApp.domain.RobotResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class RobotServiceClient extends RestTemplate {

    private static final String RS_URL ="http://localhost:8081/";

    public RobotResponse callService(final String serviceName, final Robot robot) {
        log.info("into rest client");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return this.postForEntity(RS_URL + serviceName, robot, RobotResponse.class).getBody();
    }


}
