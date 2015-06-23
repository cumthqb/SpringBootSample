package com.sample.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

/**
 * Description:启动类
 */
//TODO mybatis读写分离
//TODO dao/service/mvc 自动化测试
//TODO mybatis通用分页组件
//TODO 异常控制
//TODO 数据库脚本管理
//TODO add actuator 监控应用健康状况
//TODO mq/scheduler功能
@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    Environment environment;

    @PostConstruct
    public void initApplication() {
        logger.info("默认环境参数：{}", Arrays.toString(environment.getDefaultProfiles()));
    }

    @PreDestroy
    public void destoryApplication() {
        logger.info("应用关闭中...");
    }


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setShowBanner(true);
        checkCommandArgs(args);
        app.run(args);
    }

    /**
     * 检查入参，如果不满足条件，阻止启动
     *
     * @param args
     */
    private static void checkCommandArgs(String[] args) {
        //获取请求参数，转换为properties
        SimpleCommandLinePropertySource commandLineArgs = new SimpleCommandLinePropertySource(args);

        logger.info("启动参数：{}", Arrays.toString(commandLineArgs.getPropertyNames()));
    }
}
