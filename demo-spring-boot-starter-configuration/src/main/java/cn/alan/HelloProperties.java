package cn.alan;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alan.hello")
public class HelloProperties {
    /**
     * 定义两个属性，from 和 to, 可以在 application.yml中通过 alan.hello.xxx 进行指定
     */
    private String from;
    private String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
