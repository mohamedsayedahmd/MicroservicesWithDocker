
# <u>Shop Microservice - Producer</u>



## Port 8080

### * dependency :  
- Spring for Apache Kafka
- Spring Web
- Lombok
___
### Docker
### To extract the jar file we need to go to the folder that has the pom.xml file and run this Maven Command:
```
mvn clean package
```
### Build the Docker Image
```
docker build -t shop-service-image:latest .
```
### Run the Docker Container
```
docker run -p 8080:8080 shop-service-image:latest
```
___


