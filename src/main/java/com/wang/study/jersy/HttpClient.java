package com.wang.study.jersy;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HttpClient {
	private static Logger logger = Logger.getLogger(HttpClient.class);

	public static <T> boolean doPost(String url, T obj) {
		boolean flag = false;
		Client client = null;
		ClientResponse response = null;

		try {
			client = Client.create();
			WebResource webResource = client.resource(url);
			response = webResource.type(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, obj);

			if (response.getStatus() == Status.OK.getStatusCode()) {
				flag = true;
			}

			logger.debug(String.format("post: %s, http status code: %s", url,
					response.getStatus()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (response != null)
				response.close();
			if (client != null)
				client.destroy();
		}

		return flag;
	}

	public static <T> boolean doDelete(String url) {
		boolean flag = false;
		Client client = null;
		ClientResponse response = null;

		try {
			client = Client.create();
			WebResource webResource = client.resource(String.format(url));
			response = webResource.accept(MediaType.APPLICATION_JSON).delete(
					ClientResponse.class);

			if (response.getStatus() == 200) {
				flag = true;
			}

			logger.debug(String.format("delete: %s, http status code: %s", url,
					response.getStatus()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (response != null)
				response.close();
			if (client != null)
				client.destroy();
		}

		return flag;
	}

	public static <T> boolean doUpdate(String url, T obj) {
		boolean flag = false;
		Client client = null;
		ClientResponse response = null;

		try {
			client = Client.create();
			WebResource webResource = client.resource(url);
			response = webResource.type(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.put(ClientResponse.class, obj);

			if (response.getStatus() == Status.OK.getStatusCode()) {
				flag = true;
			}

			logger.debug(String.format("update: %s, http status code: %s", url,
					response.getStatus()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (response != null)
				response.close();
			if (client != null)
				client.destroy();
		}

		return flag;
	}

	public static <T> T doGet(String url, Class<T> clazz) {
		T obj = null;
		Client client = null;
		ClientResponse response = null;

		try {
			client = Client.create();
			WebResource webResource = client.resource(String.format(url));
			response = webResource.accept(MediaType.APPLICATION_JSON).get(
					ClientResponse.class);

			if (response.getStatus() == 200) {
				obj = response.getEntity(clazz);
			}

			logger.debug(String.format("get: %s, http status code: %s", url,
					response.getStatus()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (response != null)
				response.close();
			if (client != null)
				client.destroy();
		}

		return obj;
	}
}
