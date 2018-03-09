/**
 * Project Name:DesignPattern
 * File Name:Tshirts.java
 * Package Name:com.designpattern.decorator
 * Date:2018年3月9日上午11:37:17
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.decorator;

/**
 * ClassName:Tshirts <br/>
 * Function: ConcreteDecorator
 * Date:     2018年3月9日 上午11:37:17 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Tshirts extends Finery {

    @Override
    public void show() {

        System.out.println("com.designpattern.decorator.Tshirts");
        super.show();
    }

}
