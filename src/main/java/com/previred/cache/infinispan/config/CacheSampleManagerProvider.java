package com.previred.cache.infinispan.config;

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
	
	public DefaultCacheManager getCacheManager() throws Exception {
        if (manager == null) {
        	System.out.println("Generando configuracion por defecto");
        	manager = new DefaultCacheManager("infinispan.xml");
        }
        return manager;
    }

    @PreDestroy
    public void cleanUp() {
        manager.stop();
        manager = null;
    }

}
