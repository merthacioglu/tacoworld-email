package org.mhacioglu.tacoworldemail.integration;

import org.mhacioglu.tacoworldemail.model.EmailOrder;
import org.mhacioglu.tacoworldemail.props.ApiProperties;
import org.springframework.integration.core.GenericHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderSubmitMessageHandler implements GenericHandler<EmailOrder> {

    private final RestTemplate restTemplate;
    private final ApiProperties apiProps;

    public OrderSubmitMessageHandler(RestTemplate restTemplate, ApiProperties apiProps) {
        this.restTemplate = restTemplate;
        this.apiProps = apiProps;
    }

    @Override
    public Object handle(EmailOrder order, MessageHeaders headers) {
        restTemplate.postForObject(apiProps.getUrl(), order, String.class);
        return null;
    }


}
