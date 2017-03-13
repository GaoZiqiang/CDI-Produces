package cn.edu.sdut.softlab.connectioninterface;

public interface Connection {
	void connect();

	void closeConnection();

	String doSomething();
}
