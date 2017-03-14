package cn.edu.sdut.softlab.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cn.edu.sdut.softlab.connectioninterface.Connection;
import cn.edu.sdut.sotflab.qualifier.MyConnection;
import cn.edu.sdut.sotflab.qualifier.Simple;

@Named("controller")
@RequestScoped
public class ConnectionController {

	@Inject
	@MyConnection
	Connection connection;

	public Connection getConnection() {
		return connection;
	}
	
	public String doSomething() {
		
		//connection.connect();
		String connectMsg = "Connection has connnected!";
		System.out.println(connectMsg);
		return connectMsg;
	}
}
