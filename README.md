# Elastic-Stack
Spring Boot Application with Elastic Stack (Elastic search / Logstash / Kibana) 

Step 1 

Download Elastic from https://www.elastic.co
Extract and run bin/elasticsearch 
Note on Mac you might face elastic start up issue, run this command to resolve start error 
sudo find /Path/to/your/elasticsearch-folder -name ".DS_Store" -depth -exec rm {} \;

curl - XGET http://localhost:9200  to check if elastic is up and running 

Step 2 

Install Kibana from https://www.elastic.co
Extract and run bin/kibana 

Check Kibana Web UI , http:localhost:5601

Step 3 
Install Logstash from https://www.elastic.co 
Extract 

Logstash has input/filter/output configuration sample config file available in resources folder logstash.conf

/path/to/logstash/bin/logstash -f logstash.conf

Step 4 

Configure Kibana using Web ui, we can set up Logstash-* as default config 

Step 5 

Run spring boot application which writes to application log 

