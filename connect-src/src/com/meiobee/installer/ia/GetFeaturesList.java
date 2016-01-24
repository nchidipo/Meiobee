package com.meiobee.installer.ia;

import com.zerog.ia.api.pub.CustomCodeAction;
import com.zerog.ia.api.pub.InstallException;
import com.zerog.ia.api.pub.InstallerProxy;
import com.zerog.ia.api.pub.UninstallerProxy;
import java.lang.Integer;

public class GetFeaturesList extends CustomCodeAction{

	

	//private static final Integer Interger = null;

	@Override
	public String getInstallStatusMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUninstallStatusMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void install(InstallerProxy ip) throws InstallException {
		// TODO Auto-generated method stub
		String IAFeature1 = ip.substitute("$FUSE_CONTAINER$");
		Integer IAFea1 = Integer.valueOf(IAFeature1);
		System.out.println("value 111111111 is "+ IAFea1);
		
		
		
		String IAFeature2 = ip.substitute("$ELK_SERVER$");
		Integer IAFea2 = Integer.valueOf(IAFeature2);
		System.out.println("value 2222222222 is "+ IAFea2);
		
		String IAFeature3 = ip.substitute("$ELK_REMOTE_SERVER$");
		Integer IAFea3 = Integer.valueOf(IAFeature3);
		System.out.println("value 33333 is "+ IAFea3);
		
		String IAFeature4 = ip.substitute("$ELK_CENTRAL_SERVER$");
		Integer IAFea4 = Integer.valueOf(IAFeature4);
		System.out.println("value 444444 is "+ IAFea4);
		
		
		String str1 = "Fuse Container Installer package";
		String str2 = "ELK Remote Server software";
		String str3 = "ELK Central Server software";
		
		String Name1 = "Selected Features(s):";
		ip.setVariable("$IA_NAME$", Name1);
		
		
		if(IAFea1 == 1 && IAFea2 == 0)
		{
			ip.setVariable("$SELECTED_FEATURES$",str1);
			System.out.println("final result is "+str1);
		}else if(IAFea1 == 1 && IAFea2 == 1 && IAFea3 == 1)	{
			String result1=str1+", "+str2;
			
			ip.setVariable("$SELECTED_FEATURES$",result1);
			System.out.println("final result is "+result1);
			
		}else if(IAFea1 == 1 && IAFea2 == 1 && IAFea4 == 1)	{
			String result2=str1+", "+str3;
			
			ip.setVariable("$SELECTED_FEATURES$",result2);
			System.out.println("final result is "+result2);
			
		}else if (IAFea1 == 0 && IAFea2 == 1 && IAFea3 == 1)	{
			String result3=str2;
			
			ip.setVariable("$SELECTED_FEATURES$",result3);
			System.out.println("final result is "+result3);
			
		}else if(IAFea1 == 0 && IAFea2 == 1 && IAFea4 == 1)	{
			String result4=str3;
			
			ip.setVariable("$SELECTED_FEATURES$",result4);
			System.out.println("final result is "+result4);
			
		}
		
		// Setting up information for common Pre-install Summary Panel
		// For Central Server
		
		
		/*
		Integer Forwader = Integer.valueOf(ip.substitute("$ELK_CENTRAL_SERVER$"));
		
		if (IAFea4 == 1 && Forwader == 1) {
			//Setting Variable Names
			String variable1 = "ELK Forwarder Needs:";
			String variable2 = "ELK Central Server Certificate Key File:";
			String variable3 = "ELK Central Server Certificate File:";
			String variable4 = "ELK Central Server FLEX Forwarder Port:";
			String variable5 = "ELK Central Server FUSE Forwarder Port:";
			String variable6 = "ELK Central Server Other Forwarder Port:";
			String variable7 = "Elasticsearch Windows Service ID:";
			String variable8 = "Elasticsearch Windows Service name:";
			String variable9 = "Logstash Windows Service ID:";
			String variable10 = "Logstash Windows Service name:";
			String variable11 = "Kibana Windows Service ID:";
			String variable12 = "Kibana Windows Service name:";
			
			ip.setVariable("$IA_PRE_NAME_1$",variable1);
			ip.setVariable("$IA_PRE_NAME_2$",variable2);
			ip.setVariable("$IA_PRE_NAME_3$",variable3);
			ip.setVariable("$IA_PRE_NAME_4$",variable4);
			ip.setVariable("$IA_PRE_NAME_5$",variable5);
			ip.setVariable("$IA_PRE_NAME_6$",variable6);
			ip.setVariable("$IA_PRE_NAME_7$",variable7);
			ip.setVariable("$IA_PRE_NAME_8$",variable8);
			ip.setVariable("$IA_PRE_NAME_9$",variable9);
			ip.setVariable("$IA_PRE_NAME_10$",variable10);
			ip.setVariable("$IA_PRE_NAME_11$",variable11);
			ip.setVariable("$IA_PRE_NAME_12$",variable12);
			
			//Setting Variable Values
			String has_forwarder = ip.substitute("$HAS_FORWARDER_STR$");
			String c_key_file = ip.substitute("$ELK_CERT_KEY_FILE$");
			String c_key = ip.substitute("$ELK_CERT_FILE$");
			String c_flex_port = ip.substitute("$CENTRAL_FLEX_FORWARDER_PORT$");
			String c_fuse_port = ip.substitute("$CENTRAL_FUSE_FORWARDER_PORT$");
			String c_other_port = ip.substitute("$CENTRAL_OTHER_FORWARDER_PORT$");
			String c_elastic_id = ip.substitute("$ELASTICSEARCH_SERVICE_ID$");
			String c_elastic_name = ip.substitute("$ELASTICSEARCH_SERVICE_NAME$");
			String c_logstash_id = ip.substitute("$LOGSTASH_SERVICE_ID$");
			String c_logstash_name = ip.substitute("$LOGSTASH_SERVICE_NAME$");
			String c_kibana_id = ip.substitute("$KIBANA_SERVICE_ID$");
			String c_kibana_name = ip.substitute("$KIBANA_SERVICE_NAME$");
			
			System.out.println(has_forwarder + "*****" + c_key_file +"*****"+ c_key +"*****"+ c_flex_port +"*****"+ c_fuse_port +"*****"+ c_other_port +"*****"+ c_elastic_id );
			
			ip.setVariable("$IA_PRE_VALUE_1$",has_forwarder);
			ip.setVariable("$IA_PRE_VALUE_2$",c_key_file);
			ip.setVariable("$IA_PRE_VALUE_3$",c_key);
			ip.setVariable("$IA_PRE_VALUE_4$",c_flex_port);
			ip.setVariable("$IA_PRE_VALUE_5$",c_fuse_port);
			ip.setVariable("$IA_PRE_VALUE_6$",c_other_port);
			ip.setVariable("$IA_PRE_VALUE_7$",c_elastic_id);
			ip.setVariable("$IA_PRE_VALUE_8$",c_elastic_name);
			ip.setVariable("$IA_PRE_VALUE_9$",c_logstash_id);
			ip.setVariable("$IA_PRE_VALUE_10$",c_logstash_name);
			ip.setVariable("$IA_PRE_VALUE_11$",c_kibana_id);
			ip.setVariable("$IA_PRE_VALUE_12$",c_kibana_name);
			
		}else if (IAFea4 == 1 && Forwader == 0) {
			
			String variable1 = "ELK Forwarder Needs:";
			String variable2 = null;
			String variable3 = null;
			String variable4 = null;
			String variable5 = null;
			String variable6 = null;
			String variable7 = "Elasticsearch Windows Service ID:";
			String variable8 = "Elasticsearch Windows Service name:";
			String variable9 = "Logstash Windows Service ID:";
			String variable10 = "Logstash Windows Service name:";
			String variable11 = "Kibana Windows Service ID:";
			String variable12 = "Kibana Windows Service name:";
			
			ip.setVariable("$IA_PRE_NAME_1$",variable1);
			ip.setVariable("$IA_PRE_NAME_2$",variable2);
			ip.setVariable("$IA_PRE_NAME_3$",variable3);
			ip.setVariable("$IA_PRE_NAME_4$",variable4);
			ip.setVariable("$IA_PRE_NAME_5$",variable5);
			ip.setVariable("$IA_PRE_NAME_6$",variable6);
			ip.setVariable("$IA_PRE_NAME_7$",variable7);
			ip.setVariable("$IA_PRE_NAME_8$",variable8);
			ip.setVariable("$IA_PRE_NAME_9$",variable9);
			ip.setVariable("$IA_PRE_NAME_10$",variable10);
			ip.setVariable("$IA_PRE_NAME_11$",variable11);
			ip.setVariable("$IA_PRE_NAME_12$",variable12);
			
		} else if (IAFea3 == 1) {
			String variable1 = "ELK Remote Server Certificate File:";
			String variable2 = "ELK Central Server URL:";
			String variable3 = "ELK Central Server FLEX Forwarder Port:";
			String variable4 = "ELK Central Server FUSE Forwarder Port:";
			String variable5 = "ELK Central Server Other Forwarder Port:";
			String variable6 = "Logstash Windows Service ID:";
			String variable7 = "Logstash Windows Service name:";
			String variable8 = null;
			String variable9 = null;
			String variable10 = null;
			String variable11 = null;
			String variable12 = null;
			
			ip.setVariable("$IA_PRE_NAME_1$",variable1);
			ip.setVariable("$IA_PRE_NAME_2$",variable2);
			ip.setVariable("$IA_PRE_NAME_3$",variable3);
			ip.setVariable("$IA_PRE_NAME_4$",variable4);
			ip.setVariable("$IA_PRE_NAME_5$",variable5);
			ip.setVariable("$IA_PRE_NAME_6$",variable6);
			ip.setVariable("$IA_PRE_NAME_7$",variable7);
			ip.setVariable("$IA_PRE_NAME_8$",variable8);
			ip.setVariable("$IA_PRE_NAME_9$",variable9);
			ip.setVariable("$IA_PRE_NAME_10$",variable10);
			ip.setVariable("$IA_PRE_NAME_11$",variable11);
			ip.setVariable("$IA_PRE_NAME_12$",variable12);
		}
         */
       		
				
		
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uninstall(UninstallerProxy ip) throws InstallException {
		// TODO Auto-generated method stub
		
	}

}
