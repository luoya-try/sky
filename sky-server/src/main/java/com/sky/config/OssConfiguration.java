package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，用于创建AliOssUtil对象，以使用此对象上传文件到阿里云
 */
@Configuration
@Slf4j
public class OssConfiguration {
    @Bean //交给bean容器管理
    @ConditionalOnMissingBean //只创建1个
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties) {
        log.info("创建AliOssUtil对象: {}", aliOssProperties);
        return new AliOssUtil(aliOssProperties.getEndpoint(), aliOssProperties.getAccessKeyId(),
                aliOssProperties.getAccessKeySecret(), aliOssProperties.getBucketName());
    }
}
