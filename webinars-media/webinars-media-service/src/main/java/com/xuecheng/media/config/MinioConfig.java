package com.xuecheng.media.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MinioConfig
 * @Description Minio配置
 * @Version 1.0.0
 * @Date 2023/9/10 15:21
 * @Created by lzh
 */
@Configuration
public class MinioConfig {

    @Value("${minio.endpoint}")
    private String endpoint;

    @Value("${minio.accessKey}")
    private String accesskey;

    @Value("${minio.secretKey}")
    private String secretKey;


    @Bean
    public MinioClient getMinioClient() {
        return MinioClient.builder().endpoint(endpoint).credentials(accesskey, secretKey).build();
    }
}
