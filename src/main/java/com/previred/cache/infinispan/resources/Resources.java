package com.previred.cache.infinispan.resources;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.infinispan.manager.DefaultCacheManager;

import com.previred.cache.infinispan.config.CacheSampleManagerProvider;

public class Resources {
	
	@Inject
	CacheSampleManagerProvider cacheManagerProvider;
	
	@Produces
    DefaultCacheManager getDefaultCacheManager() throws Exception {
        return cacheManagerProvider.getCacheManager();
	}
	
}
