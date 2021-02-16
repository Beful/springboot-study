# springboot-study
SpringBoot 系列学习

- springboot-mysql
- springboot-mybatis




### 1、mysql 使用
- 配置maven镜像


    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>


- 配置application.properties ,连接mysql


    spring.datasource.url=jdbc:mysql://localhost:3306/库名?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/shanghai
    spring.datasource.username=root
    spring.datasource.password=root

- 正常使用即可


### 2、MyBatis 使用
- 配置maven镜像


    <!--    Mybatis -->
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


- 配置application.properties 


    mybatis.mapper-locations=classpath:mapper/*.xml
    mybatis.type-aliases-package=com.baomidou.springboot.entity
    # 下划线转驼峰
    mybatis.configuration.map-underscore-to-camel-case=true
    # 支持统配符 * 或者 ; 分割
    mybatis-plus.typeEnumsPackage=com.baomidou.springboot.entity.enums

- 启动项添加@MapperScan（“dao包或mapper包 - 接口位置”）



























