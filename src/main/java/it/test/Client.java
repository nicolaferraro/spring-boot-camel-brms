package it.test;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;

/**
 *
 */
public class Client {

    public static void main(String[] args) throws Exception {

        // HelloRulesClient.java
        KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(
                "http://drools-brms.vagrant.f8/kie-server/services/rest/server", "camel", "Camel123$");
        config.setMarshallingFormat(MarshallingFormat.XSTREAM);
        KieServicesClient client =
                KieServicesFactory.newKieServicesClient(config);//.getServicesClient(RuleServicesClient.class);
        ServiceResponse<String> response = client.executeCommands("ca31b7dfe9c987b8789277bea9dd0dfb", "ABCD");

        System.out.println("AA + " + response.getMsg());

    }

}
