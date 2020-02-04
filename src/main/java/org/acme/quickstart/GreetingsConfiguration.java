package org.acme.quickstart;

import io.quarkus.arc.config.ConfigProperties;
import io.quarkus.arc.config.ConfigProperties.NamingStrategy;

/**
 * Configuration of the greetings.
 */
@ConfigProperties(prefix = "greetings", namingStrategy = NamingStrategy.VERBATIM)
public class GreetingsConfiguration {

	/**
	 * Version of the service.
	 */
	public String version;

}
