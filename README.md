# API-GATEWAY

## Description

This project is a simple API Gateway that routes requests to the appropriate microservice. It is implemented using the Spring Cloud Gateway framework.

## How to run

To run the project, you need to have Docker installed on your machine. Then, you can run the following command:

Run the api-gateway microservice.

Then:

```bash
docker-compose up -d db-ms-login
```

Go to the `ms-login` directory and run the following command:

```bash
sh ./script/init_db.sh
```

Then, go to the `api-gateway` directory and run the following command:

```bash
docker compose up -d ms-login
```

