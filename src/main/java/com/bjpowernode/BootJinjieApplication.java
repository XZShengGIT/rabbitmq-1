package com.bjpowernode;

import com.bjpowernode.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*@RestController*/
@SpringBootApplication
public class BootJinjieApplication implements CommandLineRunner, ApplicationRunner {
    @Autowired
    private Environment environment;
    @Autowired
    private User user;
     @Value("${my.secret}")
     private String secret;
     @Value("${my.uuid}")
     private String uuid;
     @Value("${my.desc}")
     private String desc;
    public static void main(String[] args)
    {
        SpringApplication.run(BootJinjieApplication.class, args);
        System.out.println("djiahao");

    }
    @GetMapping("/web/mvc")
    public String doMvc(){
        return "dajiahao";
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("secret的值是："+secret);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("uuid的值是："+uuid);
        System.out.println("uuid的值是："+uuid);
        System.out.println("mydesc的值是："+desc);
        System.out.println("hot的值是："+desc);
        System.out.println("hot的值是："+desc);
        System.out.println("hot的值是："+desc);
        System.out.println("hot的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("fix的值是："+desc);
        System.out.println("hot-fix测试：mydesc的值是："+desc);
        System.out.println("master测试：mydesc的值是："+desc);
        System.out.println("master测试：mydesc的值是："+desc);
        System.out.println("通过configurationproperties获取到的值："+user.getDesc());
        System.out.println("通过ENVIROMENT获取到的值："+environment.getProperty("my.desc"));
    }
}
