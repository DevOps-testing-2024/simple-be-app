# simple-be-app
This is a simple BE app for DevOps testing.
By default, it has CRUD functionality for random descriptions.

# Local database initialization
1. Open a terminal in the root directory
2. Run the docker-compose up -d command

# AWS connection
1. Set up corresponding AWS_REGION, AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY environment variables.

# Start the application
1. Run the ./gradlew clean build command
2. Run the jar located in simple-app -> build -> libs
