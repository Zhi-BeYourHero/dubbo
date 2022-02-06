package com.alibaba.dubbo.common.extensionloader.injection;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author: luowenzhi
 * @CreateTime: 6/2/2022
 * @desc:
 */
@SPI("hi")
public interface Say {
    void say();
}
