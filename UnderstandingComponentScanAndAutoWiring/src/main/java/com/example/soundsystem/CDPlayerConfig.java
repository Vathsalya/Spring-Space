package com.example.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class;
 * 
 * Enable component scanning in spring. Default to same package as the
 * configuration class; Spring scans this package and subpackages for
 * any @Component classes and automatically creates a bean for each component
 * class.
 * 
 * Enable component scanning through xml using:
 * <context:component-scan base-package="soundsystem" />
 * 
 * @author Vathsalya
 *
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {

}
