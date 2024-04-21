# demo-with-docker

## Using kubernetes

1. The deployment file contains both deployment and service description. Use the below command to create it in the k8 cluster

```bash
cd k8
```

```bash
kubectl apply -f deployment.yaml
```

Run below command to check the pods status

```bash
kubectl get pods
```

Run below command to check the service status

```bash
kubectl get services
```

Run below command to see the logs of a specific pod

```bash
kubectl logs -f name_of_the_pod
```

To remove the deployment, use below command

```bash
kubectl delete -f deployment.yaml
```

2. Open browser and try reaching the endpoint [Get All](http://localhost:8080/api/v1/getAll)
