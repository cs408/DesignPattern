/**
 * Project Name:DesignPattern
 * File Name:Finery.java
 * Package Name:com.designpattern.decorator
 * Date:2018年3月9日上午11:31:28
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.decorator;

/**
 * ClassName:Finery <br/>
 * Function: Decorator服饰类,其它ConcreteDecorate继承该类，并通过这个类来加载其它的ConcreteDecorate
 * 通过覆写被装饰者中的方法，来达到注入的动态调用
 * Date:     2018年3月9日 上午11:31:28 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Finery extends Person {
    protected Person person;

    /**
     * 
     * @param person
     */
    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }

}
