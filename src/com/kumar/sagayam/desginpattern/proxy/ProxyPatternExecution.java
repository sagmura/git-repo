package com.kumar.sagayam.desginpattern.proxy;

interface ProxyOpertaionExecuter {
	public void executeFilter(String filterName) throws Exception;
}

class ProxyExecuterImpl implements ProxyOpertaionExecuter{
	@Override
	public void executeFilter(String filterName) throws Exception {
		System.out.println("Applying Filter to you network policy: "+filterName);
	}
}

class ClientProxyExecutor implements ProxyOpertaionExecuter{
	boolean isAdminUser;
	ProxyExecuterImpl proxyImpl;
	String user;
	
   public ClientProxyExecutor(String userName,String Password,String role) {
		 if(role == "Administrator" || role =="Admin") {
			 isAdminUser = true;
			 proxyImpl = new ProxyExecuterImpl();
			 user = userName;
		 }
	}

	@Override
	public void executeFilter(String filterName) throws Exception {
		//proxyImpl.executeFilter("Apply-Telenet-Policy");
		if(isAdminUser) {
			System.out.println("Welcome to Admistrator Board :"+user);
			proxyImpl.executeFilter(filterName);
		}else { 
			throw new Exception("User is not having Access to Apply Policy to this System!");
		}
		
	}	
}

/**
* @author Kumar Markkasagayam
*
*/
public class ProxyPatternExecution {
	
public ProxyPatternExecution() throws Exception{
	ClientProxyExecutor nonAdminUser = new ClientProxyExecutor("kumar", "test123", "nonAdmin");
	//nonAdminUser.executeFilter("Apply-Telenet-Policy");
	ClientProxyExecutor adminUser = new ClientProxyExecutor("kumar.sagayam", "test#@123", "Admin");
	adminUser.executeFilter("MS-TelnetClient");
}
	public static void main(String[] args) throws Exception{
		new ProxyPatternExecution();
	}
}

