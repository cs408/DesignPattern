/**
 * Project Name:DesignPattern
 * File Name:Singleton.java
 * Package Name:com.designpattern.singleton
 * Date:2018年3月7日下午8:23:10
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.singleton;

/**
 * ClassName:Singleton <br/>
 * Function: TODO  <br/>
 * Date:     2018年3月7日 下午8:23:10 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("sss");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;

    }

}
