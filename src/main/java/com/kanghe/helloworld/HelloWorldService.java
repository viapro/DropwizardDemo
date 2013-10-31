package com.kanghe.helloworld;

import com.kanghe.helloworld.health.TemplateHealthCheck;
import com.kanghe.helloworld.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: ViaPro
 * Date: 10/28/13
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldService extends Service<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception{
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> helloWorldConfigurationBootstrap) {
        helloWorldConfigurationBootstrap.setName("hello-world");
    }

    @Override
    public void run(HelloWorldConfiguration helloWorldConfiguration, Environment environment) throws Exception {
        final String template = helloWorldConfiguration.getTemplate();
        final String defaultName = helloWorldConfiguration.getDefaultName();
        environment.addResource(new HelloWorldResource(template,defaultName));
        environment.addHealthCheck(new TemplateHealthCheck(template));
    }

}
