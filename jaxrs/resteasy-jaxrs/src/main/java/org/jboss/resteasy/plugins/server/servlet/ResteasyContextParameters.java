package org.jboss.resteasy.plugins.server.servlet;

/**
 * constant names of resteasy configuration variables within a servlet
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface ResteasyContextParameters
{
   String RESTEASY_PROVIDERS = "resteasy.providers";
   String RESTEASY_RESOURCE_METHOD_INTERCEPTORS = "resteasy.resource.method.interceptors";
   String RESTEASY_USE_BUILTIN_PROVIDERS = "resteasy.use.builtin.providers";
   String RESTEASY_SCAN_PROVIDERS = "resteasy.scan.providers";
   String RESTEASY_SCAN = "resteasy.scan";
   String RESTEASY_SCAN_RESOURCES = "resteasy.scan.resources";
   String RESTEASY_JNDI_RESOURCES = "resteasy.jndi.resources";
   String RESTEASY_RESOURCES = "resteasy.resources";
}
