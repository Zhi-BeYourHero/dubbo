package com.alibaba.dubbo.common.extensionloader.injection.impl;


import com.alibaba.dubbo.common.extensionloader.injection.Say;

/**
 * @Author: luowenzhi
 * @CreateTime: 6/2/2022
 * @desc:
 */
public class SayHello implements Say {
    @Override
    public void say() {
        System.out.println("Hello,lwz");
    }
}
