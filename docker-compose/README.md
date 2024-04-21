# demo-with-docker

## Using docker compose

1. First build the docker image using below command.
Here "demo-with-docker-v1" is the name of the image tag, you can use any name.

```bash
docker build -t demo-with-docker-v1 .
```
Then run the image using docker compose, by default it looks for docker-compose.yaml otherwise use the -f option to
provide the yaml file name (as given in step 2).

```bash
cd docker-compose
```

```bash
docker-compose up
```

2. Build and run the image together

```bash
cd docker-compose
```

```bash
docker-compose -f docker-compose2.yaml up
```

3. Open browser and try reaching the endpoint [Get All](http://localhost:8080/api/v1/getAll)