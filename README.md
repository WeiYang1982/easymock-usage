[EasyMock](http://www.tutorialspoint.com/easymock/index.htm)
[http://easymock.org/user-guide.html](http://easymock.org/user-guide.html)
[https://github.com/easymock/easymock](https://github.com/easymock/easymock)	

- What is mocking?
	Mock is a way to test the functionallity of a class in isolation.Mocking does not reuire a database connection or properties file read or file server
	read to test a functionallity ,Mock Objects do  the mocking of the real service,A mock Object returns a dummy data corresponding to some dummy input
	passed to it.
- EasyMock
	EasyMock facilitaties creating mock objects seanlessly.It uses Java Reflection in order to create mock objects for a given interface.Mock Objects are nothing but proxy for actual implememtations.Consider a case of Stock Service which returns the price details of a stock,During development,the actual stockk service can not be used to get real-time data,so we need a dummy implementation of the stock service,EasyMock can do the same very easily as its nature suggest.
- Benefits of EasyMock
	- No HandWriting-No need to write objects on your own
	- Refactoring safe-Renaming interface method names for recording parameters will not break the test code as Mocks are created at runtime.
	- Return value support-support return values
	- Exception Support-Support Exeception
	- Order check support-supports check on order of method calls
	- Annotation support-support creating mocks using annotation

-　EasyMock Environment Setup
	- JDK-1.5 or above
	- Download EasyMock Archive(Refer pom.xml)
- EasyMock First Application
	-	