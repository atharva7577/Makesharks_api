# Makersharks Search API

## Overview

The Makersharks Search API is a Spring Boot application designed to help buyers search for manufacturers based on their customized requirements. This project serves as a proof of concept for a search functionality within the Makersharks platform.

## Features

- **Search Manufacturers:** Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
- **Pagination:** Supports pagination if the number of results exceeds a certain limit.
- **Customizable Search Criteria:** Allows filtering by location, nature of business, and manufacturing processes.

## Project Structure

- **`/src/main/java/com/makersharks/api/model`** - Contains JPA entity classes such as `Supplier`.
- **`/src/main/java/com/makersharks/api/repository`** - Contains JPA repository interfaces for data access.
- **`/src/main/java/com/makersharks/api/service`** - Contains service classes that handle business logic.
- **`/src/main/java/com/makersharks/api/controller`** - Contains RESTful API controllers.

API Endpoints:-

POST /api/supplier/query

Description: Retrieve a list of manufacturers based on search criteria.

Request Body Example:

json

Copy code
{
      
      "location": "India",
      
      "natureOfBusiness": "SMALL_SCALE",
      
      "manufacturingProcesses": ["3D_PRINTING"]
      
}

  Feel free to modify the content to better fit your project's details and requirements!





