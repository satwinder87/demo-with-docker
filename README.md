# demo-with-docker

## Creating docker image and run it

1. First build the docker image using below command.
Here "demo-with-docker-v1" is the name of the image tag, you can use any name.

```bash
docker build -t demo-with-docker-v1 .
```

Check that image is created using below command

```bash
docker image list | grep demo
```

2. Run the docker image as a container. Inside the docker container the application runs on port 8080 by default, which is then
exposed to outside.

```bash
docker run -p 8080:8080 -t demo-with-docker-v1
```

Check that container is running using below command

```bash
docker ps
```


3. Open browser and try reaching the endpoint [Get All](http://localhost:8080/api/v1/getAll)