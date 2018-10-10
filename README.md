# Spring-Boot-Loading-Data-Using-a-SQL-Script

#### Spring Boot - Loading Data Using a SQL Script

Run this project by this command :

`mvn clean spring-boot:run`

The result :

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-11 04:22:52.461  INFO 13957 --- [           main] c.h.loadingdata.LoadingDataApplication   : Starting LoadingDataApplication on Hendis-MacBook-Pro-2.local with PID 13957 (/Users/hendisantika/Documents/IdeaProjects/Spring-Boot-Loading-Data-Using-a-SQL-Script/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/Spring-Boot-Loading-Data-Using-a-SQL-Script)
2018-10-11 04:22:52.464  INFO 13957 --- [           main] c.h.loadingdata.LoadingDataApplication   : No active profile set, falling back to default profiles: default
2018-10-11 04:22:52.502  INFO 13957 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@43116e7c: startup date [Thu Oct 11 04:22:52 WIB 2018]; root of context hierarchy
2018-10-11 04:22:53.205  INFO 13957 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2018-10-11 04:22:53.339  INFO 13957 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2018-10-11 04:22:53.370  INFO 13957 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
2018-10-11 04:22:53.388  INFO 13957 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2018-10-11 04:22:53.446  INFO 13957 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.2.17.Final}
2018-10-11 04:22:53.447  INFO 13957 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2018-10-11 04:22:53.478  INFO 13957 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
2018-10-11 04:22:53.573  INFO 13957 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
Hibernate: drop table person if exists
Hibernate: drop sequence if exists hibernate_sequence
Hibernate: create sequence hibernate_sequence start with 1 increment by 1
Hibernate: create table person (id integer not null, first_name varchar(255), last_name varchar(255), primary key (id))
2018-10-11 04:22:53.971  INFO 13957 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@27384874'
2018-10-11 04:22:53.973  INFO 13957 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2018-10-11 04:22:54.114  INFO 13957 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from URL [file:/Users/hendisantika/Documents/IdeaProjects/Spring-Boot-Loading-Data-Using-a-SQL-Script/target/classes/data-h2.sql]
2018-10-11 04:22:54.117  INFO 13957 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from URL [file:/Users/hendisantika/Documents/IdeaProjects/Spring-Boot-Loading-Data-Using-a-SQL-Script/target/classes/data-h2.sql] in 2 ms.
2018-10-11 04:22:54.251  INFO 13957 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-11 04:22:54.252  INFO 13957 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
2018-10-11 04:22:54.257  INFO 13957 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
2018-10-11 04:22:54.271  INFO 13957 --- [           main] c.h.loadingdata.LoadingDataApplication   : Started LoadingDataApplication in 2.048 seconds (JVM running for 5.389)
```