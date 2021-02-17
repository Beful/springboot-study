### mysql 使用
- 配置maven镜像

`
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
`


- 配置application.properties ,连接mysql


`
spring.datasource.url=jdbc:mysql://localhost:3306/库名?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/shanghai
spring.datasource.username=root
spring.datasource.password=root
`

- 正常使用即可