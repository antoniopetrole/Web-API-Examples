# About This Project

This project has been built purely for educational and demo purposes. Building this project allows me to not only explore different types of Web API endpoints and transfer protocols but also implement them for future use in other projects.

## Prerequisites

Before running this application, you need to make sure you have MySQL running locally as well as populating it with the sample data provided. A docker-compose.yaml file has been provided which will stand up MySQL with defaults for authentication. All authentication credentials have been hard coded into this project not as a security oversight, but as a way to get the demo up and running easily.

1. Run MySQL in docker using the following command
```bash
docker compose up
```
2. Populate MySQL with the sample dataset
```bash
mysql -h 127.0.0.1 -u root -P 3306 -p -D api < scripts/mysqlsampledatabase.sql 
```