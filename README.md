# teste-maven
Projeto de teste/exemplo para utilização Maven

As dependências estão todas no arquivo
/pom.xml


Alterar a connection string do arquivo:
/src/main/resources/hibernate.cfg.xml

A tag exibe todos os sql no console
<property name="show_sql">true</property>

Setado para recriar o banco
"<property name="hbm2ddl.auto">create</property>"

Essas são as classes mapeadas:
<mapping class="com.ike.domain.Fabricante" />
<mapping class="com.ike.domain.Produto" />

A classe /teste-maven/src/main/java/com/ike/hibernate/HibernateTest.java está o código de exemplo

