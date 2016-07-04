package webservice_client_exe;

import webservice_client.Webservice;
import webservice_client.WebserviceService;

public class Start {
	
	public static void main(String[] args){
		Webservice client = new WebserviceService().getWebservicePort();
		client.sendMessage("15811111111", "ÄãºÃ");
	}
}
