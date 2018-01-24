package com.xpdev.common;

/**
 * @author xh.d
 * @date 2018/1/4 14:23
 */
public class Template {
    private String node;

    /**
     * full constructor
     * */
    public Template(String node) {
        this.node = node;
    }

    /**
     * default constructor
     * */
    public Template() {
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public void set(String value){
        //find the position to be replaced
        int pos1 = node.indexOf("{");
        int pos2 = node.indexOf("}");
        String sub = node.substring(pos1,pos2+1);
        this.node = node.replace(sub,value);
    }
    public String evluate(){
        return this.node;
    }
}
