package com.example.cloudapp.model;
import org.hibernate.boot.model.naming.ImplicitEntityNameSource;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.model.naming.Identifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomNamingStrategy extends ImplicitNamingStrategyLegacyJpaImpl {
    private final Environment environment;

    public CustomNamingStrategy(Environment environment) {
        this.environment = environment;
    }

    @Override
    public Identifier determinePrimaryTableName(ImplicitEntityNameSource source) {
        // Get the default table name
        Identifier defaultTableName = super.determinePrimaryTableName(source);

        // Get the environment variable
        String envTableName = environment.getProperty("table.name");

        // If the environment variable is set, use it as the table name
        if (envTableName != null && !envTableName.isEmpty()) {
            return Identifier.toIdentifier(envTableName);
        }

        // Otherwise, return the default table name
        return defaultTableName;
    }
}

