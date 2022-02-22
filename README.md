# pact-example

##Consumer
run consumer test and create pacts/test_consumer-test_provider.json 
```bash 
mvn test
```
publish pacts/test_consumer-test_provider.json to broker
```bash
mvn pact:publish 
```
##Provider 
run test against provider and publish result to broker
```bash
mvn test -Dpact.verifier.publishResults=true
```