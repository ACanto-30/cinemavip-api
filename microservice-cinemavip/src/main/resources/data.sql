SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE Movies;
TRUNCATE TABLE Classifications;
TRUNCATE TABLE Theaters;
TRUNCATE TABLE Actors;
TRUNCATE TABLE Casts;
TRUNCATE TABLE Reserved_Seats;
TRUNCATE TABLE Seats;
TRUNCATE TABLE Showtime_Hours;
TRUNCATE TABLE Showtimes;
TRUNCATE TABLE Tickets;
TRUNCATE TABLE Users;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO Classifications (classification_name, minimum_age, recommendation, summary, image) VALUES ('AA', 'Todo público', 'Apto para todo público, dirigido a niños', 'Dirigidas a público más preescolar', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/AA_80x60.png?raw=true');
INSERT INTO Classifications (classification_name, minimum_age, recommendation, summary, image) VALUES ('A', 'Todo público', 'Apto para todo público, se permite la entrada a niños menores a 7 años con un adulto, y mayores se recomienda la supervisión de un adulto', 'Peliculas infantiles con nula violencia', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/A_80x60.png?raw=true');
INSERT INTO Classifications (classification_name, minimum_age, recommendation, summary, image) VALUES ('B', 'Mayores a 12 años', 'Solo para mayores de 12 años, menores requieren supervisión, recomendada a adolescentes', 'Poseen escenas y referencias sexuales, violencia moderada o un poco fuerte, y consumo de sustancias controladas.', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/B-15_80x60.png?raw=true');



INSERT INTO Movies (trailer_title, url, title, duration, id_classification, release_date, director, genre, image, synopsis) VALUES ('MI VILLANO FAVORITO 4 - Tráiler Oficial (Universal Pictures) HD' ,'https://www.youtube.com/embed/I0_qFoptZ4Y' ,'Mi villano favorito 4', 94, 1, '2024-07-03', 'Chris Renaud', 'Comedia', 'https://raw.githubusercontent.com/ACanto-30/files/master/Files/cinemavip-files/Resized/Mi_Villano_Favorito_4_390x360.jpg?token=GHSAT0AAAAAACQQGEW4SBZXGH5QOP56QIOQZTXLF5Q', 'Gru, Lucy, Margo, Edith y Agnes le dan la bienvenida a un nuevo miembro de la familia, Gru Jr., quien esta decidido a atormentar a su papá, Gru se enfrenta a un nuevo némesis llamado Maxime Le Mal y su novia Valentina, y la familia se ve obligada a huir.');
INSERT INTO Movies (trailer_title, url, title, duration, id_classification, release_date, director, genre, image, synopsis) VALUES ('EL BUS DE LA VIDA - Tráiler Oficial' ,'https://www.youtube.com/embed/_tQRFwWZKys' ,'El bus de la vida', 89, 2, '2024-07-05', 'Ibon Cormenzana', 'Drama', 'https://raw.githubusercontent.com/ACanto-30/files/master/Files/cinemavip-files/Resized/El_bus_de_la_vida_390x360.jpg?token=GHSAT0AAAAAACQQGEW52N7YSOMIGVXCH6L6ZTXLGPA', 'Andrés, un profesor de música que trabaja en Madrid tiene que trasladarse a un pueblo vaco para cubrir la plaza que ha quedado libre en un instituto, Con los 40 cumplidos y sin haber superado nunca el miedo escénico, siente que si nueva vida le está alejando del sueño de ser músico. Al llegar allí, en su primer día de clase sufre un desmayo a cusa de fuerte pitido en el oído: es cáncer. Para recibir tratamiento debe desplazarse al hospital de Bilbao en El BUS DE LA VIDA, un viejo autocar que traslada gratuitamente a todos los pacientes de la zona.');

INSERT INTO Seats (position) VALUES ('A1');
INSERT INTO Seats (position) VALUES ('A2');
INSERT INTO Seats (position) VALUES ('A3');
INSERT INTO Seats (position) VALUES ('A4');
INSERT INTO Seats (position) VALUES ('B1');
INSERT INTO Seats (position) VALUES ('B2');
INSERT INTO Seats (position) VALUES ('B3');
INSERT INTO Seats (position) VALUES ('B4');
INSERT INTO Seats (position) VALUES ('B5');
INSERT INTO Seats (position) VALUES ('B6');
INSERT INTO Seats (position) VALUES ('C1');
INSERT INTO Seats (position) VALUES ('C2');
INSERT INTO Seats (position) VALUES ('C3');
INSERT INTO Seats (position) VALUES ('C4');
INSERT INTO Seats (position) VALUES ('C5');
INSERT INTO Seats (position) VALUES ('C6');
INSERT INTO Seats (position) VALUES ('D1');
INSERT INTO Seats (position) VALUES ('D2');
INSERT INTO Seats (position) VALUES ('D3');
INSERT INTO Seats (position) VALUES ('D4');
INSERT INTO Seats (position) VALUES ('D5');
INSERT INTO Seats (position) VALUES ('D6');

INSERT INTO Theaters (theater_number) VALUES ('1');
INSERT INTO Theaters (theater_number) VALUES ('2');

INSERT INTO Showtimes (showtime_date, id_theater, id_movie) VALUES ('2024-07-03', 1, 1);
INSERT INTO Showtimes (showtime_date, id_theater, id_movie) VALUES ('2024-07-04', 1, 1);
INSERT INTO Showtimes (showtime_date, id_theater, id_movie) VALUES ('2024-07-05', 1, 1);
INSERT INTO Showtimes (showtime_date, id_theater, id_movie) VALUES ('2024-07-05', 2, 2);

INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('09:30', 1);
INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('12:30', 1);
INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('15:00', 1);
INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('09:30', 2);
INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('13:00', 2);
INSERT INTO Showtime_Hours (showtime_hour, id_showtime) VALUES ('16:00', 2);

INSERT INTO Actors (actor_name) VALUES ('Steve Carell');
INSERT INTO Actors (actor_name) VALUES ('Kristen Wiig');
INSERT INTO Actors (actor_name) VALUES ('Will Ferrell');
INSERT INTO Actors (actor_name) VALUES ('Joey King');
INSERT INTO Actors (actor_name) VALUES ('Dani Rovira');
INSERT INTO Actors (actor_name) VALUES ('Susana Abaitua');
INSERT INTO Actors (actor_name) VALUES ('Andrés Gertrúdix');
INSERT INTO Actors (actor_name) VALUES ('Elena Irureta');

INSERT INTO Casts (id_movie, id_actor) VALUES (1, 1);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 2);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 3);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 4);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 5);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 6);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 7);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 8);

INSERT INTO Users (first_name, last_name, email) VALUES ('Riquelme', 'Roman', 'riquelme@gmail.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Diego', 'Maradona', 'maradona@email.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Kylian', 'Mbappe', 'mbappe@hotmail.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Iosef', 'Stalin', 'josef@gulag.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Adolf', 'Hitler', 'siegheil@judio.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Santiago', 'Abascal', 'killmuslim@islam.com');

INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (1, 1);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (1, 2);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (2, 3);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (2, 4);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (5, 1);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (5, 2);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (5, 3);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (6, 4);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (6, 5);
INSERT INTO Tickets (id_showtime_hour, id_user) VALUES (6, 6);

INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (1, 1);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (2, 1);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (3, 1);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (4, 2);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (5, 2);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (6, 2);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (8, 7);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (7, 7);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (5, 9);
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (3, 9);
