package com.turing.advancedse8.unittest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.condition.OS;
import java.time.Duration;
import java.util.Date;
import java.util.Stack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnOs;

@Tag("fast")
@Tag("model")
@DisplayName("A special test case")
@TestMethodOrder(OrderAnnotation.class)
public class StandardTest {
	Stack<Integer> stack = new Stack<>();
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("@AfterAll Cleanup");
	}
	
	@BeforeEach
	void init() {
		stack.push(1);
		stack.push(2);
		System.out.println("Before each");
	}
	@BeforeAll
	static void initAll() {
		System.out.println("Before all");
	}
	
	int count =0;
	
	@DisplayName("First test case")
	@Test
	@Tag("taxes")
	@Order(2)
	void testOne()
	{
		count++;
		System.out.println("Test case 1 "+this);
	}
	
	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() 
	{
		System.out.println("skippedTest ");
	}
	
	@Order(1)
	@Test
	void testTwo()
	{
		System.out.println("Test case 2 "+this);
		assertFalse(false);
		assertNotNull(new Date());
		assertNull(null);
	}
	@Test
	void testArray()
	{
		System.out.println("Test Array "+this);
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		assertArrayEquals(arr1, arr2);
	}
	@Test
	@Disabled("for demonstration purposes")
	void testFail()
	{
		System.out.println("Test case fail "+this);
		fail();
	}
	@Test
	void testException()
	{
		NullPointerException excep = assertThrows(NullPointerException.class, ()->{
			String str =null;
			str.toUpperCase();
		});
		System.out.println("Excep "+excep.getMessage());
		
		assertDoesNotThrow(()->{
			String str ="";
			str.toUpperCase();
		}, "Not throw here");
	}
	@Test
	@EnabledOnOs(OS.MAC)
	void testOnMac()
	{
		System.out.println("Run on mac");
	}
	@Test
	@EnabledOnOs(OS.LINUX)
	void testOnLinux()
	{
		System.out.println("Run on Linux");
	}
	@Test
	void timeoutExceeded() {
		
		assertTimeout(Duration.ofMillis(100), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(50);
		});
	}
	@RepeatedTest(3)
	void repeatTest(RepetitionInfo repetitionInfo)
	{
		System.out.println("Repeated test "+repetitionInfo.getCurrentRepetition());
	}
}
