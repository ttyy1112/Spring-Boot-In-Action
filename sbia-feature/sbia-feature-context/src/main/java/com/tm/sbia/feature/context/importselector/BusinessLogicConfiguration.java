package com.tm.sbia.feature.context.importselector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Contry(name = "TH")
@Import(BusinessLogicAImportSelector.class)
public class BusinessLogicConfiguration {
}
