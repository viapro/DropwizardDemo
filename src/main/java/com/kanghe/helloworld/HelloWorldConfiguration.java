package com.kanghe.helloworld;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created with IntelliJ IDEA.
 * User: ViaPro
 * Date: 10/28/13
 * Time: 9:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

    public String getTemplate(){
        return template;
    }

    public String getDefaultName(){
        return defaultName;
    }

}
