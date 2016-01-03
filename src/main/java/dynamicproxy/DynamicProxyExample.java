package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



interface CalculatorProtocal {
	
	public int add (int a,int b) ;
	public int substract(int a ,int b) ;
	
}

class Server implements CalculatorProtocal{

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	
}


class CalculatorHandler implements InvocationHandler{
private Object originObject ;

public CalculatorHandler(Object originObject)
{
	this.originObject = originObject ;
}

public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	// TODO Auto-generated method stub
	
	System.out.println("dddddddddddddd");
	Object object = method.invoke(originObject, args);
	return object ;
	
}


	
	
}



public class DynamicProxyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorProtocal server = new Server();
		InvocationHandler handler = new CalculatorHandler(server);
		CalculatorProtocal client = (CalculatorProtocal)Proxy.newProxyInstance(server.getClass().getClassLoader(), server.getClass().getInterfaces(), handler);
		int r = client.add(5, 3);
		System.out.println("r: "+r);

	}

}
