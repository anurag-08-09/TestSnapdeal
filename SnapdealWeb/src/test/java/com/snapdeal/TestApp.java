package com.snapdeal;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ App.class })
public class TestApp {
	
	@InjectMocks
	App ap;
	
	@Test
	public void testException()
	{
		try{
			 MockitoAnnotations.initMocks(this);
	           PowerMockito.when(App.getStatic()).thenReturn("abc");
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
	}
	
	@Test
	public void testNotException()
	{
		try{
			 MockitoAnnotations.initMocks(this);
	           PowerMockito.when(App.getStatic()).thenReturn("123");
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
	}

}
