package com.atguigu.boot.test;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;


@DisplayName("我的测试")
public class MyTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("测试全部开始");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("测试全部结束");
    }
    @BeforeEach
    public void before(){
        System.out.println("测试开始");
    }
    @AfterEach
    public void after(){
        System.out.println("测试结束");
    }
    @Test
    public void test1(){
        System.out.println("test1测试----->执行");
    }
    @Test
    public void test3(){
        System.out.println("test3测试----->执行");
    }
    @Test
    public void test2(){
        System.out.println("test2测试----->执行");
    }
}
