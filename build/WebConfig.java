package com.build;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	  /*
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer
                .addSupportedVersions("1.0", "2.0")
                .setDefaultVersion("1.0")
                .usePathSegment(1); 
    }
  
	@Override
	public void configureApiVersioning(ApiVersionConfigurer configurer) {
		configurer.useRequestHeader("API-Version");
	}
	 @Override
	    public void configureApiVersioning(ApiVersionConfigurer configurer) {
	        configurer.useMediaTypeParameterVersioning(1);
	     */
	  @Override
	    public void configureApiVersioning(ApiVersionConfigurer configurer) {
	        configurer
	                .addSupportedVersions("1.0", "1.1", "2.0")  // supported versions
	                .setDefaultVersion("1.0")                  // default version
	                .useRequestHeader("API-Version")           // HEADER-BASED versioning
	                .usePathSegment(1);                        // URL PATH versioning
	    }

}
