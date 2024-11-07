To run artemis image : docker run --detach --name localartemis -p 61616:61616 -p 8161:8161 --rm apache/activemq-artemis:latest-alpine
Check logs : docker logs -f localartemis

To stop the container : docker stop localartemis

Management console available at : http://localhost:8161/
Username : artemis
Pwd : artemis

For Reference - https://activemq.apache.org/components/artemis/documentation/latest/docker.html