/**
 * Project Name:DesignPattern
 * File Name:TestProxy.java
 * Package Name:com.designpattern.proxy
 * Date:2018年3月7日上午9:14:21
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.proxy;

/**
 * ClassName:TestProxy <br/>
 * Function: TODO  <br/>
 * Date:     2018年3月7日 上午9:14:21 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class TestProxy {

    public static void main(String[] args) {

        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("李娇娇");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }

}
