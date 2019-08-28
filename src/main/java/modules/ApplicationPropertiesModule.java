package modules;

import java.util.Properties;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ApplicationPropertiesModule extends AbstractModule {
	protected void configure() {
		try{
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			Properties properties = new Properties();
			properties.load(classLoader.getResourceAsStream("application.properties"));
			Names.bindProperties(binder(), properties);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
