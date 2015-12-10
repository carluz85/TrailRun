package org.cadc.mgt.config;

import javax.servlet.Filter;

import org.cadc.mgt.service.ExceptionServiceImpl;
import org.cadc.mgt.service.UserServiceImpl;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

/**
 * Java Config for this application.  Life begins here.
 * 
 * @author LanyonM
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{DataConfig.class, 
			ExceptionServiceImpl.class, 
			UserServiceImpl.class, 
			ViewResolver.class, 
			ApplicationContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[]{ characterEncodingFilter, new SiteMeshFilter() };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
