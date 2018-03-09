/**
 * Project Name:DesignPattern
 * File Name:TestDecoratorPattern.java
 * Package Name:com.designpattern.decorator
 * Date:2018年3月9日上午11:42:02
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.decorator;

/**
 * ClassName:TestDecoratorPattern <br/>
 * Function: TODO  <br/>
 * Date:     2018年3月9日 上午11:42:02 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class TestDecoratorPattern {

    public static void main(String[] args) {

        Person pickles = new Person();
        pickles.setName("pickles");
        Tshirts tshirts = new Tshirts();
        BigThrouser bigThrouser = new BigThrouser();

        tshirts.decorate(pickles);
        bigThrouser.decorate(tshirts);
        bigThrouser.show();

    }

}
