package cn.edu.sdut.softlab.connectioninterface;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ConnectionImpl implements Connection {
	@PostConstruct
	private void initConn() {
		System.out.println("initConn is called...");
		connect();
	}

	@PreDestroy
	private void destroyConn() {
		System.out.println("destroyConn is called...");
	}

	public void connect() {
		System.out.println("Connecting...");
	}

	public void closeConnection() {
		System.out.println("Closing connection...");
	}

	public String doSomething() {
		String msg = "do somethinig...";
		System.out.println(msg);
		return msg;
	}

}
