### MyBatis 使用
- 配置maven镜像

`
    <!--  Mybatis -->
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>${mybatis.version}</version>
    </dependency>
    
    <!--   MyBatis-Plus  -->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>${mybatis.plus.version}</version>
    </dependency>
`


- 配置application.properties 


`
mybatis.mapper-locations=classpath:mapper/*.xml
mybatis.type-aliases-package=com.baomidou.springboot.entity
#下划线转驼峰
mybatis.configuration.map-underscore-to-camel-case=true
#支持统配符 * 或者 ; 分割
mybatis-plus.typeEnumsPackage=com.baomidou.springboot.entity.enums
`

- 启动项添加@MapperScan（“dao包或mapper包 - 接口位置”）

