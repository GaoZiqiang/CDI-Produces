package cn.edu.sdut.softlab.connectionfactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import cn.edu.sdut.softlab.connectioninterface.Connection;
import cn.edu.sdut.softlab.connectioninterface.ConnectionImpl;
import cn.edu.sdut.sotflab.qualifier.MyConnection;

public class ConnectionFactory {
	
	@Produces
	@RequestScoped
	@MyConnection
	public Connection getConnection() {
		System.out.println("ConnectionFactory.egtConnection is called ...");
		Connection connectionFactory = new ConnectionImpl();
		connectionFactory.connect();
		
		return connectionFactory;
	}
}
