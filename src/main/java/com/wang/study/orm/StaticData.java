package com.wang.study.orm;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;

public class StaticData {

	public static JdbcPooledConnectionSource CONNECTIONSOURCE = null;
	static {
		try {
			CONNECTIONSOURCE = new JdbcPooledConnectionSource("jdbc:mysql://10.16.135.186:3306/test?user=root&password=root");
			CONNECTIONSOURCE.setMaxConnectionsFree(10);
			// only keep the connections open for 5 minutes
			CONNECTIONSOURCE.setMaxConnectionAgeMillis(5 * 60 * 1000);
			// change the check-every milliseconds from 30 seconds to 60
			CONNECTIONSOURCE.setCheckConnectionsEveryMillis(60 * 1000);
			// for extra protection, enable the testing of connections
			// right before they are handed to the user
			CONNECTIONSOURCE.setTestBeforeGet(true);


		} catch (SQLException e) {
			e.printStackTrace();
			CONNECTIONSOURCE.closeQuietly();
			System.exit(1);
		}
	}


}
