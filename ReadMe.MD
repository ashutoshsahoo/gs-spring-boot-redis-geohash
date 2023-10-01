# gs-spring-boot-redis-geohash

Spring Boot with Redis GeoHash Example

## Test application

* Create a location

```shell
curl --location 'http://localhost:8080/location' \
--header 'Content-Type: application/json' \
--data '{
    "lng": 51.5187516,
    "lat":-0.0814374,
    "name": "liverpool-street"
}'
```

* Fetch Nearby location

```shell
curl --location 'http://localhost:8080/location/nearby?lng=51.4595573&lat=0.24949&km=100'
```