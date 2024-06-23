Make sure you are running this app with Java 22.

Replace your database credentials here:
![image](https://github.com/ACanto-30/cinemavip-api/assets/141590298/c4dd5cdb-5ebc-4249-b03b-a4b26637a964)


You need to have the database created, and to create the tables, you should set this option:
![image](https://github.com/ACanto-30/cinemavip-api/assets/141590298/aa58039e-31cf-42dc-9629-ef8bf45a2ae0)
Select create, but make sure to change it to update afterward the next time you want to run the project, otherwise it won't run.

To run the project, ensure you first start the config microservice, then Eureka, and finally your microservices like CinemavipApplication.

Endpoints:
Get all movies
http://localhost:8091/api/v1/movies

Get a movie by ID
http://localhost:8091/api/v1/movie/{id}

Get occupied seats for a showtime hour
http://localhost:8091/api/v1/showtimehour/{1}/seats

Purchase a ticket
http://localhost:8091/api/v1/purchase/ticket
Request body example:
{
  "user": {
    "firstName": "Riquelme",
    "lastName": "Roman",
    "email": "riquelme@gmail.com"
  },
  "showtimeHour": {
    "idShowtimeHour": "1",
    "showtimeHour": "09:30:00"
  },
  "reservedSeats": [
    {
      "seat": {
        "idSeat": 12,
        "position": "C2"
      }
    },
    {
      "seat": {
        "idSeat": 13,
        "position": "C3"
      }
    }
  ]
}

Get showtimes by movie ID
http://localhost:8091/api/v1/showtimes/movie/{id}

Get the last purchased ticket by a user
http://localhost:8091/api/v1/ticket/user
Request body example:
{
"firstName":"Riquelme",
"lastName":"Roman",
"email":"riquelme@gmail.com"
}

Get all tickets of a user
http://localhost:8091/api/v1/tickets/user
Request body example:
{
"firstName":"Riquelme",
"lastName":"Roman",
"email":"riquelme@gmail.com"
}

Create a user (not frequently used)
http://localhost:8091/api/v1/user
Request body example:
{
"firstName":"example1",
"lastName":"example1",
"email":"example@gmail.com"
}

Eureka endpoint:
http://localhost:8761/

