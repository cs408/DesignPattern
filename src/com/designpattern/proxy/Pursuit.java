/**
 * Project Name:DesignPattern
 * File Name:Pursuit.java
 * Package Name:com.designpattern.proxy
 * Date:2018年3月7日上午9:04:27
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.designpattern.proxy;

/**
 * ClassName:Pursuit <br/>
 * Function: RealSubject 定义Proxy所代表的真实对象
 * Date:     2018年3月7日 上午9:04:27 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Pursuit implements IGiveGift {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {

        this.schoolGirl = schoolGirl;
    }

    @Override
    public void GiveDolls() {

        System.out.println(schoolGirl.getName() + "洋娃娃");

    }

    @Override
    public void GiveFlowers() {

        System.out.println(schoolGirl.getName() + "鲜花");
    }

    @Override
    public void GiveChocolate() {

        System.out.println(schoolGirl.getName() + "巧克力");
    }

}
