
# Online Contact Management System

## Running the Application

To run the application, execute the main function in the OnlineContactManagementSystemApplication class.


## Features

### User Management

- Create User: This feature allows the creation of a new user. The user details are stored in the database.

- Update User: This feature allows updating an existing user's details. If the user does not exist, a UserNotFoundException is thrown.

- Delete User: This feature allows the deletion of an existing user. If the user does not exist, a UserNotFoundException is thrown.

- Get User: This feature allows retrieving the details of an existing user. If the user does not exist, a UserNotFoundException is thrown.

### Logging

- User Creation Logging: Logs are generated after a user is created.

- User Update Logging: Logs are generated before and after a user is updated.

## API Usage Guide

The API runs on localhost at port 8080. Users can manage their contact information by sending HTTP requests to specific URLs.

### User Management

- Create User: Send a POST request to http://localhost:8080/api/v1/users with the user details in the request body. The user details should be in JSON format.

- Get User: Send a GET request to `http://localhost:8080/api/v1/users/
- **Update User**: This feature allows updating an existing user's details. If the user does not exist, a `UserNotFoundException` is thrown.

- **Delete User**: This feature allows the deletion of an existing user. If the user does not exist, a `UserNotFoundException` is thrown.
