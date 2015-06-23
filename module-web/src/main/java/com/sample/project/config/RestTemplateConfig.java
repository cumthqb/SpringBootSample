package com.sample.project.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotNull;

/**
 * Description:
 */
@Configuration
@ConfigurationProperties(prefix = "rest.template")
public class RestTemplateConfig {
    private final static Logger logger = LoggerFactory.getLogger(RestTemplateConfig.class);

    private int readTimeout;

    private int connectTimeout;

    @Bean
    public RestTemplate generateRestTemplate() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(connectTimeout==0?5000:connectTimeout);
        factory.setReadTimeout(readTimeout==0?5000:readTimeout);

        RestTemplate restTemplate = new RestTemplate(factory);

        logger.info("restTemplate初始化完毕，读取超时时间:{},连接超时时间:{}",readTimeout,connectTimeout);
        return restTemplate;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
}
