package org.casper.service;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class TestMathApplication {
	//要测试测对象
	@TestSubject
	private MathApplication mathApplication = new MathApplication();

	//要进行mock的对象
	@Mock
	private CalService calService;
	
	@Test
	public void testAdd(){
		//指定期望调用的后的返回值
		EasyMock.expect(calService.add(20.0, 10.0)).andReturn(30.0);
		//执行期望的调用后返回值
		//EasyMock.expect(calService.add(20.0, 10.0)).andReturn(30.0).times(2);
		//指定预期指定会出现的异常
		//EasyMock.expect(calService.add(20.0, 10.0)).andReturn(30.0).andThrow(new RuntimeException());
		//activate
		EasyMock.replay(calService);
		
		Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	}
}
