package com.kanghe.helloworld.core;

/**
 * Created with IntelliJ IDEA.
 * User: ViaPro
 * Date: 10/28/13
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Saying {
    private final long id;
    private final String content;

    public Saying(long id, String content){
        this.id=id;
        this.content=content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

}
