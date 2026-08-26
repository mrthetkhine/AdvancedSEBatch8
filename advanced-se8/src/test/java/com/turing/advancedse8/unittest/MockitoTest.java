package com.turing.advancedse8.unittest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.argThat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.turing.advancedse8.oop.Car;
import com.turing.advancedse8.oop.Engine;
import com.turing.advancedse8.oop.Order;
import com.turing.advancedse8.oop.SmsSender;

public class MockitoTest {
	@Test
	void testMock()
	{
		 List mockedList = mock(List.class);

		 //using mock object
		 mockedList.add("one");
		 mockedList.clear();

		 //verification
		 verify(mockedList).add("one");
		 verify(mockedList).clear();
	}
	
	@Test
	void testWhenCarStartEngineWillStart()
	{
		Engine engine = mock(Engine.class);
		Car car = new Car(engine);
		
		car.start();
		verify(engine).start();
	}
	
	@Test
	void testStub()
	{
		LinkedList mockedList = mock(LinkedList.class);

		 //stubbing
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());
	
		 //following prints "first"
		 System.out.println("Get 0 "+mockedList.get(0));
	
		 //following throws runtime exception
		 //System.out.println(mockedList.get(1));
	
		 //following prints "null" because get(999) was not stubbed
		 System.out.println(mockedList.get(999));
		 
		 verify(mockedList).get(0);
	}
	@Test
	public void testArgument()
	{
		LinkedList mockedList = mock(LinkedList.class);
		when(mockedList.get(anyInt())).thenReturn("element");
		
		//when(mockedList.contains(argThat(isValid()))).thenReturn(true);

		 //following prints "element"
		System.out.println("Mocked list get 999 "+mockedList.get(999));

		 //you can also verify using an argument matcher
		verify(mockedList).get(anyInt());

		mockedList.add("Hello1");
		 //argument matchers can also be written as Java 8 Lambdas
		verify(mockedList).add(argThat( (String someString) -> someString.length() > 5));


	}
	@Test
	public void testArgument()
	{
		SmsSender sender = mock(SmsSender.class);
		Order order = new Order(sender);
		
		order.order(123);
		verify(sender).sendSms(argThat( (String message) -> message.startsWith("Order 123")));
	}
	@Test 
	void testNoOfTime()
	{
		LinkedList mockedList = mock(LinkedList.class);
		
		mockedList.add("once");

	    mockedList.add("twice");
	    mockedList.add("twice");

	    mockedList.add("three times");
	    mockedList.add("three times");
	    mockedList.add("three times");
	    
	    verify(mockedList).add("once");
	    verify(mockedList, times(1)).add("once");
	    
	    verify(mockedList, times(2)).add("twice");
	    verify(mockedList, times(3)).add("three times");
	    
	    verify(mockedList, never()).add("never happened");
	    
	    verify(mockedList, atMostOnce()).add("once");
	    verify(mockedList, atLeastOnce()).add("three times");
	}
	@Test
	void stubException()
	{
		LinkedList mockedList = mock(LinkedList.class);
		
		doThrow(new RuntimeException()).when(mockedList).clear();
		
		assertThrows(RuntimeException.class,()->{
			mockedList.clear();
		});
	}
	
	@Test
	void testOrder()
	{
		List singleMock = mock(List.class);

		
		 //using a single mock
		 singleMock.add("was added first");
		 singleMock.add("was added second");
		 
		 InOrder inOrder = Mockito.inOrder(singleMock);
		 
		 inOrder.verify(singleMock).add("was added first");
		 inOrder.verify(singleMock).add("was added second");
		 
		 List firstMock = mock(List.class);
		 List secondMock = mock(List.class);

		 //using mocks
		 firstMock.add("was called first");
		 secondMock.add("was called second");

		 //create inOrder object passing any mocks that need to be verified in order
		 InOrder inOrder2 = Mockito.inOrder(firstMock, secondMock);

		 //following will make sure that firstMock was called before secondMock
		 inOrder2.verify(firstMock).add("was called first");
		 inOrder2.verify(secondMock).add("was called second");
	}
	@Test
	void verifyNoMore()
	{
		Engine engine = mock(Engine.class);
		Car car = new Car(engine);
		
		car.start();
		verify(engine).start();
		
		verifyNoMoreInteractions(engine);
	}
	
	@Test
	void testConsecutive()
	{
		List mock = mock(List.class);
		when(mock.get(1))
		   .thenThrow(new RuntimeException())
		   .thenReturn("foo");

		assertThrows(RuntimeException.class,()->{
			mock.get(1);
		});
		System.out.println("Get 1 "+mock.get(1));
	}
	@Test
	void stubWithCallBack()
	{
		List mock = mock(List.class);
		when(mock.get(anyInt()))
		.thenAnswer(
			     new Answer() {
			         
					@Override
					public Object answer(InvocationOnMock invocation) throws Throwable {
						Object[] args = invocation.getArguments();
			            Object mock = invocation.getMock();
			            return "called with arguments: " + Arrays.toString(args);
					}
			 });

			 //Following prints "called with arguments: [foo]"
			 System.out.println(mock.get(3));
	}
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
}
