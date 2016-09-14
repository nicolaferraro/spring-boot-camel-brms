# spring-boot-camel-brms-decisionserver
xPaaS decision server on Openshift for the spring-boot-camel-brms quickstart. 

You can use this repository to deploy a simple rule using the S2I workflow 
of the Red Hat decision server xPaaS image. 
This quickstart should be used in conjunction with the 
_spring-boot-camel-brms-client quickstart_.

Templates for the decision server are available in Openshift. 
You can use the basic template for this project.

In order for the quickstart to work, make sure to set the following parameters when configuring the S2I workflow:
- **KIE_CONTAINER_DEPLOYMENT**: CanDrink=io.fabric8.quickstarts:spring-boot-camel-brms-decisionserver:_\<put-the-current-version\>_
- **KIE_SERVER_USER**: camel
- **KIE_SERVER_PASSWORD**: Camel123$
- **APPLICATION_NAME**: decisionserver-camel-qs
- **SOURCE_REPOSITORY_URL**: https://the-https-url-of-this-github-repo
- **SOURCE_REPOSITORY_REF**: master
- **CONTEXT_DIR**: _\<leave empty\>_
