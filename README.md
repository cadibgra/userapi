1. Start the Docker app

2. Start minikube

minikube start --driver=docker

3. To connect minikube's own Docker registry to the locally running Docker registry

eval $(minikube -p minikube docker-env)

4. Then build the Dockerfile

docker build --build-arg JAR_FILE=target/userapi-0.0.1-SNAPSHOT.jar -t souvikdas81/userapi:1.0 .

This docker image is now available to the minikube Docker registry

5. Then create the deployment on the minikube cluster

kubectl create -f deployment.yaml