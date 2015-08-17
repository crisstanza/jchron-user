# jchron-user

An example of how to use JChron as a Maven dependency from Github pages.


### pom.xml:

    <dependencies>
        ...
        <dependency>
            <groupId>io.github.crisstanza</groupId>
            <artifactId>jchron</artifactId>
            <version>1.0</version>
        </dependency>
        ...
    </dependencies>

    ...

    <repositories>
        ...
        <repository>
            <id>crisstanza.github.io_jchron_repository</id>
            <url>http://crisstanza.github.io/jchron/repository/</url>
        </repository>
        ...
    </repositories>



