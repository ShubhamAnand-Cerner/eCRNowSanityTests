package com.cerner.test;

import org.glassfish.jersey.client.ClientConfig;

public class HttpClientVO {

	private String URL;
	private ClientConfig config;
	private String mediaType;
	private HttpVerb verb;
	private Object body;
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public ClientConfig getConfig() {
		return config;
	}
	public void setConfig(ClientConfig config) {
		this.config = config;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public HttpVerb getVerb() {
		return verb;
	}
	public void setVerb(HttpVerb verb) {
		this.verb = verb;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	public HttpClientVO(String uRL, ClientConfig config, String mediaType, HttpVerb verb, Object body) {
		URL = uRL;
		this.config = config;
		this.mediaType = mediaType;
		this.verb = verb;
		this.body = body;
	}

}
