package com.cerner.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

import javax.ws.rs.core.MediaType;

import org.apache.commons.io.FileUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteCRNowLaunchController {
	ObjectMapper mapper = new ObjectMapper();

	
	@Test
	public void testGetLaunchDetailsById() throws IOException, SQLException {
		
		
		
		String URL="http://localhost:8081/api/launchDetails/12";
		ClientConfig config = new ClientConfig();
		
		HttpClientVO clientVO= new HttpClientVO(URL, config, MediaType.APPLICATION_JSON, HttpVerb.GET, new Object());
		CommonRestServiceCaller svcObj=new  CommonRestServiceCaller();
		String response=svcObj.invokeService(clientVO).getResponseStr();
		System.out.println(response);
		
		
		ClassLoader classLoader = getClass().getClassLoader();
		 File file = new File(classLoader.getResource("LaunchDetails_12").getFile());
		String expectedJson = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		
		assertEquals(mapper.readTree(expectedJson), mapper.readTree(response));

		
	}
	
	@Test
	public void testSaveLaunchDetails() throws IOException, SQLException {
		
		int lastLaunchEntryId=PostGressDBUtil.getLaunchDetailsFromDB("SELECT * FROM public.launch_details ORDER BY id DESC LIMIT 1").get(0).getId();
		
		
		String URL="http://localhost:8081/api/launchDetails";
		ClientConfig config = new ClientConfig();
		ClassLoader classLoader = getClass().getClassLoader();
		 File file = new File(classLoader.getResource("saveLaunchDetails").getFile());
		String launchDetailsToSave = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		
		HttpClientVO clientVO= new HttpClientVO(URL, config, MediaType.APPLICATION_JSON, HttpVerb.POST, launchDetailsToSave);
		CommonRestServiceCaller svcObj=new  CommonRestServiceCaller();
		HttpResponse response=svcObj.invokeService(clientVO);
		int responseStatus=response.getStatus();
		assertEquals(responseStatus, 200);
		
		
		int expectedLaunchId=lastLaunchEntryId+1;
		//List<LaunchDetails> launchList=PostGressDBUtil.getLaunchDetailsFromDB("SELECT * FROM public.launch_details WHERE id=" + launchId);
		
		
		
		String checkURL="http://localhost:8081/api/launchDetails/"+expectedLaunchId;
		ClientConfig config2 = new ClientConfig();
		
		HttpClientVO clientVO2= new HttpClientVO(checkURL, config2, MediaType.APPLICATION_JSON, HttpVerb.GET, new Object());
		
		String expectedResponse=svcObj.invokeService(clientVO2).getResponseStr();
		System.out.println(expectedResponse);
		
		
		assertEquals(mapper.readTree(expectedResponse), mapper.readTree(response.getResponseStr()));

		
	}

}
