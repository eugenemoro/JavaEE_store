package ru.morozov.onlinestore.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> result = new HashSet<>();
		result.add(TestService.class);
		result.add(ProductService.class);
		return super.getClasses();
	}
}
