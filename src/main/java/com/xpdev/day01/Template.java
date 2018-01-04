package com.xpdev.day01;

/**
 * @author xh.d
 * @date 2018/1/4 14:23
 */
public class Template {
    private String key;
    private String node;

    /**
     * full constructor
     * */
    public Template(String key, String node) {
        this.key = key;
        this.node = node;
    }

    /**
     * default constructor
     * */
    public Template() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String evluate(){
        return key+","+node;
    }
}
