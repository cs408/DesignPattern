/**
 * Project Name:DesignPattern
 * File Name:Proxy.java
 * Package Name:com.designpattern.proxy
 * Date:2018年3月7日上午9:11:49
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.proxy;

/**
 * ClassName:Proxy <br/>
 * Function: TODO  <br/>
 * Date:     2018年3月7日 上午9:11:49 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Proxy implements IGiveGift {
    private Pursuit pursuit; //加入一个被代理对象的引用

    public Proxy(SchoolGirl schoolGirl) {

        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void GiveDolls() {

        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {

        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {

        pursuit.GiveChocolate();
    }

}
