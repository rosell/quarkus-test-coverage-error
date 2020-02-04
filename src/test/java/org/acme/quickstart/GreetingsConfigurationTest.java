
package org.acme.quickstart;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

/**
 * Test {@link GreetingsConfiguration}
 */
@QuarkusTest
public class GreetingsConfigurationTest {

	/**
	 * The configuration to test.
	 */
	@Inject
	GreetingsConfiguration conf;

	/**
	 * Should have a version.
	 */
	@Test
	public void shouldLoadConfiguration() {

		assertThat(this.conf).isNotNull();
	}

	/**
	 * Should have a version.
	 */
	@Test
	public void shouldHaveVersion() {

		assertThat(this.conf.version).isNotNull().isNotEmpty();
	}

}
