Kubernetes ConfigMap Refresh Example

This applications demonstrate how to use configmap in kubernetes and dynamically refresh properties on the fly.
The application consists of a bean that periodically prints a message to the console. 
The message can be changed using a config map.

Steps to set up configmap: 

1: Add following dependencies in pom.xml and define spring-cloud.version:

    <properties>
      <spring-cloud.version>Greenwich.RELEASE</spring-cloud.version>
    </properties>
      
      
		<dependencies>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-kubernetes-config</artifactId>
        <version>1.1.0.RELEASE</version>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-configuration-processor</artifactId>
        <optional>true</optional>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-dependencies</artifactId>
        <version>${spring-cloud.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
	</dependencies>


3: Create bootstrap.yml file in resource folder and keep bare minimum configuration properties. 
   
4: Start Docker with Kubernetes

5:Run below command to create configmap on terminal 
     
    kubectl create -f configmapdemo.yml
    
6:Start spring-boot application in local

    The scheduler runs and starts printing message in console:
    The message is: Loki Bifrost...
    The message is: Loki Bifrost...
    The message is: Loki Bifrost...

7: Open configmapdemo.yml file and modify the value of message property.

8: Run  below command on terminal :
    
    kubectl apply -f configmapdemo.yml

9: Verify whether configmap is updated or not, Execute below command on terminal
    
    kubectl describe configmap configmapdemo

10: Check console, It displays

.r.EventBasedConfigurationChangeDetector : Detected change in config maps
.r.EventBasedConfigurationChangeDetector : Reloading using strategy: REFRESH


Console start printing updated values.

            
  
