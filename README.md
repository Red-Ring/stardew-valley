# stardew-valley
namespace: 4f10edd1-35a6-4ade-9da8-3048bea90201

stardew-valley-sv-common-dev.yaml
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        namespace: 4f10edd1-35a6-4ade-9da8-3048bea90201
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://172.28.6.68:3306/stardew_valley?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC
    username: root
    password: 123456

stardew-valley-sv-gateway-dev.yaml
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        namespace: 4f10edd1-35a6-4ade-9da8-3048bea90201
    gateway:
      discovery:
        locator:
          enabled: true
          lower-case-service-id: true
      #路由信息
      routes:
        - id: sv-common
          uri: lb://sv-common
          predicates:
            - Path=/api/**

stardew-valley-sv-feign-dev.yaml
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        namespace: 4f10edd1-35a6-4ade-9da8-3048bea90201
