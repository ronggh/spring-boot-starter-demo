package cn.alan;

public class HelloService {
    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    // 一个简单的对外服务方法
    public String say(String something) {
        return "Say hello " + something + " from: " + helloProperties.getFrom() + " to: " + helloProperties.getTo();
    }
}
