package com.twiceyuan.mavenpublish.samplelib

class TestLib {

    /**
     * 一个毫无意义的注释
     */
    fun test() {
        // 根据 flavor 调用不同的实现
        SomeClass().test()
    }
}