# Microservices With Couchbase
### <u>Project Content</u>:
- ### shop-service - microservice (8081)
- ### tax-service - microservice (8082)

### Couchbase : 
```
CREATE PRIMARY INDEX `#primary` ON `bucketName`
```
___
### Start the ZooKeeper service
```
bin/zookeeper-server-start.sh config/zookeeper.properties
```
### Start the Kafka broker service
```
bin/kafka-server-start.sh config/server.properties
```
### Run the Consumer
```
bin/kafka-console-consumer.sh --topic items_topic  --from-beginning --bootstrap-server localhost:9092
```
___
### Delete Kafka Log Directories
```
rm -rf /tmp/kafka-logs
```
### Delete ZooKeeper Data
```
rm -rf /tmp/zookeeper
```
