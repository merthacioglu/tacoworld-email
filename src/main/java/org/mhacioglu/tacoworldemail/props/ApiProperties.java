package org.mhacioglu.tacoworldemail.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "tacoworld.api")
@Component
public class ApiProperties {
    private String url;
}
