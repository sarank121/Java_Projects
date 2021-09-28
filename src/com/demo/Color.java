package com.demo;

public enum Color { RED("red"),GREEN("green"),BLUE("Blue");
private String value;
Color(String value)
{
    this.value=value;
}
public String getValue(){
 return  value;
}
};

