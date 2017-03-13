package cn.edu.sdut.softlab.controller;

import javax.inject.Inject;
import javax.inject.Named;

import cn.edu.sdut.softlab.connectioninterface.Connection;

@Named("controller")
public class ConnectionController {

	@Inject
	private Connection connection;

	public Connection getConnection() {
		return connection;
	}
}
