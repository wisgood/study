package com.wang.study.jersy;

import java.io.IOException;
import java.net.URI;
import java.sql.SQLException;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;

public class HttpServer {
	private static URI BASE_URI = UriBuilder.fromUri("http://localhost")
			.port(8888).build();
	
	private final static byte[] wait = new byte[0];
	public static void main(String[] args) throws SQLException, IOException, InterruptedException {
		ResourceConfig rc;
		rc = new LogupWebServiceAppication();

		org.glassfish.grizzly.http.server.HttpServer httpServer = GrizzlyServerFactory.createHttpServer(BASE_URI,
				rc);
		httpServer.start();

		synchronized (wait) {
			System.out.println("wait To exit");
			wait.wait();
			System.out.println("finish wait");
		}
	}
}

class LogupWebServiceAppication extends PackagesResourceConfig {
	public LogupWebServiceAppication() throws SQLException {
		super("com.wnag.jersy");
	}

}
