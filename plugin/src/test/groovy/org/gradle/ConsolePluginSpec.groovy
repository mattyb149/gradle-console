package org.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

class ConsolePluginSpec extends Specification {
	
	def "should add a task called 'console' to the project"() {
		given:
		Project project = ProjectBuilder.builder().build()
		
		when:
		project.apply plugin: ConsolePlugin

		then:
		project.tasks.console
	}
	
	def "should set the classpath according to the source sets defined in the project"() {
		given:
		Project project = ProjectBuilder.builder().build()
		
		when:
		project.apply plugin: ConsolePlugin

		then:
		project.tasks.console
	}
}