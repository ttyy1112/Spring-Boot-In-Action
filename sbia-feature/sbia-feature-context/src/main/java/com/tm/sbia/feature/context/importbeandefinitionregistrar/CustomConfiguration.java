package com.tm.sbia.feature.context.importbeandefinitionregistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CustomImportBeanDefinitionRegistrar.class)
public class CustomConfiguration {
}
