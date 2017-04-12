package com.previred.cache.infinispan.config;

import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

import org.infinispan.configuration.cache.Configuration;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.configuration.global.GlobalConfiguration;
import org.infinispan.configuration.global.GlobalConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;

@ApplicationScoped
public class CacheSampleManagerProvider {
	
	private DefaultCacheManager manager;
	
	public DefaultCacheManager getCacheManager() {
        if (manager == null) {
        	System.out.println("Generando configuracion por defecto");
            GlobalConfiguration glob = new GlobalConfigurationBuilder()
                    .build(); // Se construye la configuracion global
            Configuration loc = new ConfigurationBuilder()
            		.jmxStatistics().enable()// Habilitacion de estadistica JMX
            		.expiration().lifespan(1, TimeUnit.MINUTES) //
                    .build();
            manager = new DefaultCacheManager(glob, loc, true);
        }
        return manager;
    }

    @PreDestroy
    public void cleanUp() {
        manager.stop();
        manager = null;
}

}
