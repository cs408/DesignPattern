/**
 * Project Name:DesignPattern
 * File Name:Person.java
 * Package Name:com.designpattern.decorator
 * Date:2018年3月9日上午11:27:25
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.decorator;

/**
 * ClassName:Person <br/>
 * Function: ConcreteComponent
 * Date:     2018年3月9日 上午11:27:25 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Person {
    private String name;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
