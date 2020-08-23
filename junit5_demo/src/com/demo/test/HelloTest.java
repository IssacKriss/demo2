package com.demo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {

	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("i will be executed before all test cases");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("i will be executed before every test cases");
	}
	
	@Test
	public void helloTest1()
	{
		System.out.println("hello from Junit5 test1");
	}
	
	@Test
	public void helloTest2()
	{
		System.out.println("hello from Junit5 test2");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("i will be executed after every test cases");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("i will be executed after all test cases");
	}
}
