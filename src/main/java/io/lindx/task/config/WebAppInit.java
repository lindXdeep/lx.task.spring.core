package io.lindx.task.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Implementation of {@link AbstractAnnotationConfigDispatcherServletInitializer}
 * interface.
 *
 * @author Linder Igor
 * @version 1.0
 * @since 2021-03-13
 */
public class WebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * Метод, указывающий на класс конфигурации.
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {};
	}

	/**
	 * Добавление конфигурации, в которой инициализируем ViewResolver, для корректного.
	 * отображения jsp.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebAppConfig.class };
	}

	/**
	 * Данный метод указывает url, на котором будет базироваться приложение.
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}

	/**
	 * Перенаправление входящих HTTP-запросов на нужные методы контроллера.
	 */
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new CharacterEncodingFilter("UTF-8", true) };
	}

}