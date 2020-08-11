package com.cerner.test;

import java.util.Date;

public class LaunchDetails {

	private Integer id;

	private String clientId;

	private String ehrServerURL;

	private String authUrl;

	private String tokenUrl;

	private String accessToken;

	private String userId;

	private int expiry;

	private String scope;

	private Date lastUpdated;

	private Date startDate;

	private Date endDate;

	private String refreshToken;

	private String launchPatientId;

	private String fhirVersion;

	private String encounterId;

	private String status;

	private String assigningAuthorityId;

	private String setId;

	private String versionNumber;

	private String directHost;

	private String directUser;

	private String directPwd;

	private String directRecipient;

	private Boolean isCovid = true;

	private String launchId;

	private int launchState;

	private String redirectURI;

	private String authorizationCode;

	public Boolean getIsCovid() {
		return isCovid;
	}

	public void setIsCovid(Boolean isCovid) {
		this.isCovid = isCovid;
	}

	public String getDirectHost() {
		return directHost;
	}

	public void setDirectHost(String directHost) {
		this.directHost = directHost;
	}

	public String getDirectRecipient() {
		return directRecipient;
	}

	public void setDirectRecipient(String directRecipient) {
		this.directRecipient = directRecipient;
	}

	public String getAssigningAuthorityId() {
		return assigningAuthorityId;
	}

	public void setAssigningAuthorityId(String assigningAuthorityId) {
		this.assigningAuthorityId = assigningAuthorityId;
	}

	public String getSetId() {
		return setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getEhrServerURL() {
		return ehrServerURL;
	}

	public void setEhrServerURL(String ehrServerURL) {
		this.ehrServerURL = ehrServerURL;
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getTokenUrl() {
		return tokenUrl;
	}

	public void setTokenUrl(String tokenUrl) {
		this.tokenUrl = tokenUrl;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getUserId() {
		return userId;
	}

	public String getStatus() {
		return status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getExpiry() {
		return expiry;
	}

	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getLaunchPatientId() {
		return launchPatientId;
	}

	public void setLaunchPatientId(String launchPatientId) {
		this.launchPatientId = launchPatientId;
	}

	public String getFhirVersion() {
		return fhirVersion;
	}

	public void setFhirVersion(String fhirVersion) {
		this.fhirVersion = fhirVersion;
	}

	public String getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(String encounterId) {
		this.encounterId = encounterId;
	}

	public void setStatus(String stat) {
		this.status = stat;
	}

	public String getDirectUser() {
		return directUser;
	}

	public void setDirectUser(String directUser) {
		this.directUser = directUser;
	}

	public String getDirectPwd() {
		return directPwd;
	}

	public void setDirectPwd(String directPwd) {
		this.directPwd = directPwd;
	}

	public String getLaunchId() {
		return launchId;
	}

	public void setLaunchId(String launchId) {
		this.launchId = launchId;
	}

	public int getLaunchState() {
		return launchState;
	}

	public void setLaunchState(int launchState) {
		this.launchState = launchState;
	}

	public String getRedirectURI() {
		return redirectURI;
	}

	public void setRedirectURI(String redirectURI) {
		this.redirectURI = redirectURI;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

}
