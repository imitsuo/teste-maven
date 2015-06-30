# teste-maven
Projeto de teste/exemplo para utilização Maven

As dependências estão todas no arquivo<br>
/pom.xml

Alterar a connection string do arquivo:<br>
/src/main/resources/hibernate.cfg.xml

A tag exibe todos os sql no console<br>
```<property name="show_sql">true</property>```

Setado para recriar o banco<br>
```<property name="hbm2ddl.auto">create</property>```

Essas são as classes mapeadas:<br>
```<mapping class="com.ike.domain.Fabricante" />```<br>
```<mapping class="com.ike.domain.Produto" />```<br>

A classe /teste-maven/src/main/java/com/ike/hibernate/HibernateTest.java está o código de exemplo

