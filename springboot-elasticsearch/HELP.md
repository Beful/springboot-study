### Elasticsearch


        `<!--    Elasticsearch相关依赖   -->
        <!--    <dependency> -->
        <!--        <groupId>org.springframework.boot</groupId> -->
        <!--        <artifactId>spring-boot-starter-data-elasticsearch</artifactId> -->
        <!--    </dependency> -->
        
        <dependency>
            <groupId>org.elasticsearch.client</groupId>
            <artifactId>elasticsearch-rest-high-level-client</artifactId>
            <version>${elasticsearch.version}</version>
            <exclusions>
                <exclusion>
                    <artifactId>joda-time</artifactId>
                    <groupId>joda-time</groupId>
                </exclusion>
            </exclusions>
        </dependency>`