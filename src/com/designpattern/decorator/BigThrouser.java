/**
 * Project Name:DesignPattern
 * File Name:BigThrouser.java
 * Package Name:com.designpattern.decorator
 * Date:2018年3月9日上午11:40:34
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.decorator;

/**
 * ClassName:BigThrouser <br/>
 * Function: ConcreteDecorator
 * Date:     2018年3月9日 上午11:40:34 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class BigThrouser extends Finery {

    @Override
    public void show() {

        System.out.println("com.designpattern.decorator.BigThrouser");
        super.show();
    }

}
