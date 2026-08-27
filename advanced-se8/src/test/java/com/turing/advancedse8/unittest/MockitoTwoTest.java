package com.turing.advancedse8.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import com.turing.advancedse8.oop.Order;
import com.turing.advancedse8.oop.SmsSender;

public class MockitoTwoTest {
	@Test
	void testSpy()
	{
	   List list = new LinkedList();
	   List spy = Mockito.spy(list);

	   //optionally, you can stub out some methods:
	   when(spy.size()).thenReturn(100);

	   //using the spy calls *real* methods
	   spy.add("one");
	   spy.add("two");

	   //prints "one" - the first element of a list
	   System.out.println(spy.get(0));

	   //size() method was stubbed - 100 is printed
	   System.out.println(spy.size());

	   //optionally, you can verify
	   verify(spy).add("one");
	   verify(spy).add("two");
	}
	@Test
	void testArgumentsCaptor()
	{
	
	   SmsSender sender = mock(SmsSender.class);
	   Order order = new Order(sender);
	   ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
	   
	   order.order(100);
	   verify(sender).sendSms(argument.capture());
	   
	   assertTrue( argument.getValue().contains("Order 100"));
	   System.out.println("Argument "+argument.getValue());	
	}
	
	@Test
	void testReset()
	{
	   List list = mock(List.class);
	   when(list.size()).thenReturn(10);
	   list.add(1);
	   
	   assertEquals(10,list.size());
	   reset(list);
	   
	   System.out.println("Size "+list.size());
	}
}
