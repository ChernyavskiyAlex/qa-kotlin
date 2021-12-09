package com.lohika.cucumber

import io.cucumber.core.options.Constants
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.IncludeEngines
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/lohika")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.lohika")
class CucumberSuite {
}