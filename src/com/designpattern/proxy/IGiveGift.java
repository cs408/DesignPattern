/**
 * Project Name:DesignPattern
 * File Name:IGiveGift.java
 * Package Name:com.designpattern.proxy
 * Date:2018年3月7日上午8:57:40
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.proxy;

/**
 * ClassName:IGiveGift <br/>
 * Function: 定义RealSubject和Proxy的公用接口，这样就可以在任何使用RealSubject的地方都可以使用Proxy
 * Date:     2018年3月7日 上午8:57:40 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public interface IGiveGift {

    void GiveDolls();

    void GiveFlowers();

    void GiveChocolate();
}
