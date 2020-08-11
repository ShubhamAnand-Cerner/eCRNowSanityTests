package com.cerner.test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

public class CommonRestServiceCaller {

	public HttpResponse invokeService(HttpClientVO clientVO) {

		Client client = ClientBuilder.newClient(clientVO.getConfig());
		WebTarget target = client.target(clientVO.getURL());
		Invocation.Builder builder = target.request(clientVO.getMediaType());
		HttpResponse response = getResponse(builder, clientVO.getVerb(), clientVO.getBody());

		return response;
	}

	private HttpResponse getResponse(Builder builder, HttpVerb verb, Object body) {
		Response response = call(builder, verb, body);
		int status = response.getStatus();
		HttpResponse httpResponse = new HttpResponse();
		httpResponse.setStatus(status);
		httpResponse.setResponseStr(response.readEntity(String.class));
		// httpResponse.setHeaderMap(headerMap);

		return httpResponse;

	}

	private Response call(Builder builder, HttpVerb verb, Object body) {
		Response response = null;
		switch (verb) {
		case GET:
			response = builder.get();

			break;

		case POST:
			// response=builder.post(Entity.text(body));
			response = builder.post(Entity.entity(body, MediaType.APPLICATION_JSON));
			break;

		default:
			break;
		}

		return response;

	}

}
