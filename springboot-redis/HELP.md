### redis 使用

        `<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>io.lettuce</groupId>
                    <artifactId>lettuce-core</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>redis.clients</groupId>
            <artifactId>jedis</artifactId>
        </dependency>`

- 配置 application.properties

`spring.redis.host=localhost
spring.redis.port=6379
spring.redis.password=
spring.redis.database=0`

- 使用 RedisTemplate / SpringRedisTemplate