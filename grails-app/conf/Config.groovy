log4j = {
    root { info() }

	appenders {
        console name:'stdout', layout:pattern(conversionPattern: '%d{HH:mm:ss,SSS} %-5p %c{3} %x - %m%n')
		//console name:'stdout', layout:pattern(conversionPattern: '%d{HH:mm:ss,SSS} [%t] %-5p %c %x - %m%n')
    }

    error  'org.codehaus.groovy.grails',
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'

/*		     trace  'org.springframework.web.servlet.view',
		          'org.springframework.context.support'

		     debug  'grails.plugin.freemarker.GrailsTemplateLoader', //'grails.plugin.freemarker.GrailsFreeMarkerView',
		            'org.springframework.ui.freemarker.SpringTemplateLoader',
		            'grails.app.services.grails.plugin.freemarker.FreemarkerViewService',
					'grails.plugin.freemarker.TagLibToDirectiveAndFunction'
*/
}

grails.doc.authors='Daniel Henrique Alves Lima (text revised by Gislaine Fonseca Ribeiro and others)'
grails.doc.license='Apache License 2.0'

grails.doc.alias = [
  configuration: "3.1. Configuration"
]
