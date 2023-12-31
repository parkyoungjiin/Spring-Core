package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출,url" + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect(){
        System.out.println("connect = " + url);
    }

    public void call(String message){
        System.out.println("call:" + url + "message = " + message);
    }

    public void disConnect(){
        System.out.println("close " + url);
    }
    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    @PreDestroy
    public void close(){
        System.out.println("close");

    }
}

