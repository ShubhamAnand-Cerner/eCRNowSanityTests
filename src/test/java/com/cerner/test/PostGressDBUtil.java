package com.cerner.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostGressDBUtil {
	//TODO Add new method for System Launch as and when needed
	
	public static ResultSet executeQuery(String query) {
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "admin";
        
        ResultSet rs = null;

        try  {
        	Connection con = DriverManager.getConnection(url, user, password);
    		Statement st = con.createStatement();
        	
           rs = st.executeQuery(query);

			/*
			 * if (rs.next()) { System.out.println(rs.getString(1)); }
			 */
            
            

        } catch (SQLException ex) {
        
            System.out.println("Exception occured while running query");
            ex.printStackTrace();
        }
        
        return rs;
	}
	
	
	public static List<LaunchDetails> getLaunchDetailsFromDB(String query) throws SQLException {
		List<LaunchDetails> launchList=new ArrayList<LaunchDetails>();
		
		
		ResultSet rs=PostGressDBUtil.executeQuery(query);
		
		while(rs.next())
        {
			LaunchDetails launch = extractDataFromResultSet(rs);
			launchList.add(launch);
        }
	
		return launchList;
		
	}
	private static LaunchDetails extractDataFromResultSet(ResultSet rs) throws SQLException {
		LaunchDetails launch = new LaunchDetails();
		
		
		
		launch.setId(rs.getInt("id"));
		launch.setClientId(rs.getString("client_id"));
		launch.setEhrServerURL(rs.getString("ehr_server_url"));
		launch.setAuthUrl(rs.getString("auth_url"));
		launch.setTokenUrl(rs.getString("token_Url"));
		launch.setAccessToken(rs.getString("access_Token"));
		launch.setUserId(rs.getString("user_Id"));
		launch.setExpiry(rs.getInt("expiry"));
		launch.setScope(rs.getString("scope"));
		launch.setLastUpdated(rs.getDate("last_updated_ts"));
		launch.setStartDate(rs.getDate("start_date"));
		launch.setEndDate(rs.getDate("end_date"));
		launch.setRefreshToken(rs.getString("refresh_token"));
		launch.setLaunchPatientId(rs.getString("launch_patient_id"));
		launch.setFhirVersion(rs.getString("fhir_version"));
		launch.setEncounterId(rs.getString("encounter_Id"));
		launch.setStatus(rs.getString("status"));
		launch.setAssigningAuthorityId(rs.getString("aa_id"));
		launch.setSetId(rs.getString("set_Id"));
		launch.setVersionNumber(rs.getString("ver_number"));
		launch.setDirectHost(rs.getString("direct_Host"));
		launch.setDirectUser(rs.getString("direct_user"));
		launch.setDirectPwd(rs.getString("direct_Pwd"));
		launch.setDirectRecipient(rs.getString("direct_recipient"));
		launch.setIsCovid(rs.getBoolean("is_covid19"));
		launch.setLaunchId(rs.getString("launch_id"));
		launch.setLaunchState(rs.getInt("launch_state"));
		launch.setRedirectURI(rs.getString("redirect_uri"));
		launch.setAuthorizationCode(rs.getString("auth_code"));
		
		
	    return launch;
	}
	
	

}
