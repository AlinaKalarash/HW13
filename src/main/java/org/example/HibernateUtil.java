package org.example;

import org.flywaydb.core.Flyway;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final HibernateUtil INSTANCE;

    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    static {
        INSTANCE = new HibernateUtil();
    }

    private HibernateUtil() {
        this.sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();
        flywayMigration("jdbc:postgresql://localhost:32768/ladatabase",
                "postgres", "123");
    }

    public static HibernateUtil getInstance() {
        return INSTANCE;
    }

    public void close() {
        this.sessionFactory.close();
    }

    private void flywayMigration(String connectionUrl, String username, String password) {
        Flyway flyway = Flyway.configure().dataSource(connectionUrl, username, password).load();
        flyway.migrate();
    }
}
