package com.wang.study.orm;

import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.TableUtils;

public class UserControler {

	private static UserControler instance = null;

	Dao<User, Integer> userDao = null;

	public UserControler() throws SQLException {
		this.userDao = DaoManager.createDao(StaticData.CONNECTIONSOURCE,
				User.class);
	}

	public static void main(String[] args) throws SQLException {
		Dao<User, Integer> userDao = null;
		userDao = DaoManager.createDao(StaticData.CONNECTIONSOURCE, User.class);

		//TableUtils.createTable(StaticData.CONNECTIONSOURCE, User.class);
		User user1 = new User("wang", "bejing");
		userDao.create(user1);
		

	}

}

@DatabaseTable(tableName = "Users")
@XmlRootElement
class User {

	@DatabaseField
	String name;

	@DatabaseField
	String address;

	public User() {

	}

	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}