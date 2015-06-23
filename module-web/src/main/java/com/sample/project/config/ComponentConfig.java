package com.sample.project.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * Description:解析器配置，以Bean方式注入
 */
@Configuration
public class ComponentConfig {

    private final static Logger logger = LoggerFactory.getLogger(ComponentConfig.class);

    @Bean
    public CookieLocaleResolver cookieLocaleResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();

        logger.info("cookie 初始化完毕");
        return cookieLocaleResolver;
    }

}
