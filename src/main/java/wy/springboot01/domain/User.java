package wy.springboot01.domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * springboot项目启动的时候，自动将application.yml内容加载到实体对象中
 */

@Data
//将实体类交给spring管理，自动扫描
@Component
//加载配置内容，设定配置前缀，注意：prefix参数不支持小驼峰原则，必须全部小写
@ConfigurationProperties(prefix = "user")
public class User {
    private Integer uid;
    private String uname;
    private String password;
    private ArrayList<String> addrs;

    public User() {
    }

    public User(Integer uid, String uname, String password, ArrayList<String> addrs) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.addrs = addrs;
    }
}
