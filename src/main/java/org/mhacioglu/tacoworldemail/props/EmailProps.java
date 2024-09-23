package org.mhacioglu.tacoworldemail.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "tacoworld.email")
@Component
public class EmailProps {
    private String username;
    private String password;
    private String host;
    private String mailbox;
    private long pollRate = 3000;

    public String getImapUrl() {
        return String.format("imaps:/ /%s:%s@%s/%s",
                this.username, this.password, this.host, this.mailbox);
    }

}
