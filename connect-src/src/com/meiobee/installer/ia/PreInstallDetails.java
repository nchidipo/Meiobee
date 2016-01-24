package com.meiobee.installer.ia;

import com.zerog.ia.api.pub.CustomCodeAction;
import com.zerog.ia.api.pub.InstallException;
import com.zerog.ia.api.pub.InstallerProxy;
import com.zerog.ia.api.pub.UninstallerProxy;

public class PreInstallDetails extends CustomCodeAction {

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
		
		Integer Forwader = Integer.valueOf(ip.substitute("$HAS_FORWARDER$"));
		//String IAforwader =	ip.substitute("$HAS_FORWARDER$");
		//Integer Forwader = Integer.valueOf(IAforwader);
		System.out.println("****Forwader**** is "+ Forwader);
		
		
		
		// Setting up information for common Pre-install Summary Panel
		// For Central Server along Forwader
		
		if (IAFea4 == 1 ) {
			
			if (Forwader == 1) {
			//Setting Variable Names
			String variable = "User Selected Details:";
			String variable1 = "ELK Forwarder Needs";
			String variable2 = "ELK Central Server Certificate Key File" ;
			String variable3 = "ELK Central Server Certificate File";
			String variable4 = "ELK Central Server FLEX Forwarder Port";
			String variable5 = "ELK Central Server FUSE Forwarder Port";
			String variable6 = "ELK Central Server Other Forwarder Port";
			String variable7 = "Elasticsearch Windows Service ID";
			String variable8 = "Elasticsearch Windows Service name";
			String variable9 = "Logstash Windows Service ID";
			String variable10 = "Logstash Windows Service name";
			String variable11 = "Kibana Windows Service ID";
			String variable12 = "Kibana Windows Service name";
			
			ip.setVariable("$IA_PRE_NAME_1$",variable);
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
			
			
			String result = variable1 + "=" + has_forwarder + "; " + variable2 + "=" + c_key_file + "; "+ variable3 + "=" + c_key + "; "+ variable3+ "="+ c_flex_port + "; "+ variable4
					+"="+c_fuse_port +"; "+variable5+ "="+ c_other_port+"; "+variable6+"="+c_elastic_id+"; ";
					
			ip.setVariable("$IA_PRE_VALUE_1$",result);
			
			//ip.setVariable("$IA_PRE_VALUE_1$",has_forwarder);
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
			
			} else if (Forwader == 0) {
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
				
				System.out.println(variable2);
				System.out.println(variable3);
				System.out.println(variable4);
				System.out.println(variable5);
				System.out.println(variable6);
				System.out.println(variable7);
				
				
				ip.setVariable("$IA_PRE_NAME_1$",variable1);
				//ip.setVariable("$IA_PRE_NAME_2$","");
				//ip.setVariable("$IA_PRE_NAME_3$","");
				//ip.setVariable("$IA_PRE_NAME_4$","");
				//ip.setVariable("$IA_PRE_NAME_5$","");
				//ip.setVariable("$IA_PRE_NAME_6$","");
				ip.setVariable("$IA_PRE_NAME_2$",variable7);
				ip.setVariable("$IA_PRE_NAME_3$",variable8);
				ip.setVariable("$IA_PRE_NAME_4$",variable9);
				ip.setVariable("$IA_PRE_NAME_5$",variable10);
				ip.setVariable("$IA_PRE_NAME_6$",variable11);
				ip.setVariable("$IA_PRE_NAME_7$",variable12);
				
				
				//Setting Variable Values
				String has_forwarder = ip.substitute("$HAS_FORWARDER_STR$");
				//String c_key_file = ip.substitute("$ELK_CERT_KEY_FILE$");
				String c_key_file = null;
				//String c_key = ip.substitute("$ELK_CERT_FILE$");
				String c_key = null;
				//String c_flex_port = ip.substitute("$CENTRAL_FLEX_FORWARDER_PORT$");
				String c_flex_port = null;
				//String c_fuse_port = ip.substitute("$CENTRAL_FUSE_FORWARDER_PORT$");
				String c_fuse_port = null;
				//String c_other_port = ip.substitute("$CENTRAL_OTHER_FORWARDER_PORT$");
				String c_other_port = null;
				
				String c_elastic_id = ip.substitute("$ELASTICSEARCH_SERVICE_ID$");
				String c_elastic_name = ip.substitute("$ELASTICSEARCH_SERVICE_NAME$");
				String c_logstash_id = ip.substitute("$LOGSTASH_SERVICE_ID$");
				String c_logstash_name = ip.substitute("$LOGSTASH_SERVICE_NAME$");
				String c_kibana_id = ip.substitute("$KIBANA_SERVICE_ID$");
				String c_kibana_name = ip.substitute("$KIBANA_SERVICE_NAME$");
				
				System.out.println(has_forwarder + "*****" + c_key_file +"*****"+ c_key +"*****"+ c_flex_port +"*****"+ c_fuse_port +"*****"+ c_other_port +"*****"+ c_elastic_id + "Forwader is not enabled");
				
				ip.setVariable("$IA_PRE_VALUE_1$",has_forwarder);
				//ip.setVariable("$IA_PRE_VALUE_2$",c_key_file);
				//ip.setVariable("$IA_PRE_VALUE_3$",c_key);
				//ip.setVariable("$IA_PRE_VALUE_4$",c_flex_port);
				//ip.setVariable("$IA_PRE_VALUE_5$",c_fuse_port);
				//ip.setVariable("$IA_PRE_VALUE_6$",c_other_port);
				ip.setVariable("$IA_PRE_VALUE_2$",c_elastic_id);
				ip.setVariable("$IA_PRE_VALUE_3$",c_elastic_name);
				ip.setVariable("$IA_PRE_VALUE_4$",c_logstash_id);
				ip.setVariable("$IA_PRE_VALUE_5$",c_logstash_name);
				ip.setVariable("$IA_PRE_VALUE_6$",c_kibana_id);
				ip.setVariable("$IA_PRE_VALUE_7$",c_kibana_name);
				
			}
		}
		
		/*
		if (IAFea4 == 1 && Forwader == 0) {
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
			
			System.out.println(variable2);
			System.out.println(variable3);
			System.out.println(variable4);
			System.out.println(variable5);
			System.out.println(variable6);
			System.out.println(variable7);
			
			
			ip.setVariable("$IA_PRE_NAME_1$",variable1);
			ip.setVariable("$IA_PRE_NAME_2$","");
			ip.setVariable("$IA_PRE_NAME_3$","");
			ip.setVariable("$IA_PRE_NAME_4$","");
			ip.setVariable("$IA_PRE_NAME_5$","");
			ip.setVariable("$IA_PRE_NAME_6$","");
			ip.setVariable("$IA_PRE_NAME_7$",variable7);
			ip.setVariable("$IA_PRE_NAME_8$",variable8);
			ip.setVariable("$IA_PRE_NAME_9$",variable9);
			ip.setVariable("$IA_PRE_NAME_10$",variable10);
			ip.setVariable("$IA_PRE_NAME_11$",variable11);
			ip.setVariable("$IA_PRE_NAME_12$",variable12);
			
			
			//Setting Variable Values
			String has_forwarder = ip.substitute("$HAS_FORWARDER_STR$");
			//String c_key_file = ip.substitute("$ELK_CERT_KEY_FILE$");
			String c_key_file = null;
			//String c_key = ip.substitute("$ELK_CERT_FILE$");
			String c_key = null;
			//String c_flex_port = ip.substitute("$CENTRAL_FLEX_FORWARDER_PORT$");
			String c_flex_port = null;
			//String c_fuse_port = ip.substitute("$CENTRAL_FUSE_FORWARDER_PORT$");
			String c_fuse_port = null;
			//String c_other_port = ip.substitute("$CENTRAL_OTHER_FORWARDER_PORT$");
			String c_other_port = null;
			
			String c_elastic_id = ip.substitute("$ELASTICSEARCH_SERVICE_ID$");
			String c_elastic_name = ip.substitute("$ELASTICSEARCH_SERVICE_NAME$");
			String c_logstash_id = ip.substitute("$LOGSTASH_SERVICE_ID$");
			String c_logstash_name = ip.substitute("$LOGSTASH_SERVICE_NAME$");
			String c_kibana_id = ip.substitute("$KIBANA_SERVICE_ID$");
			String c_kibana_name = ip.substitute("$KIBANA_SERVICE_NAME$");
			
			System.out.println(has_forwarder + "*****" + c_key_file +"*****"+ c_key +"*****"+ c_flex_port +"*****"+ c_fuse_port +"*****"+ c_other_port +"*****"+ c_elastic_id + "Forwader is not enabled");
			
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
		}*/
	}

	@Override
	public void uninstall(UninstallerProxy ip) throws InstallException {
		// TODO Auto-generated method stub
		
	}

}
