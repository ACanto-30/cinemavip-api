/*SET FOREIGN_KEY_CHECKS = 0;
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
INSERT INTO Classifications (classification_name, image, minimum_age, recommendation, summary) VALUES ('B-15', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/B-15_80x60.png?raw=true', 'Mayores a 15 años', 'Menores de 15 años no es recomendada y requieren supervision', 'Poseen escenas y referencias sexuales, violencia moderada o fuerte, y consumo de sustancias controladas');
INSERT INTO Classifications (classification_name, image, minimum_age, recommendation, summary) VALUES ('C', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/C_80x60.png?raw=true', 'Solo mayores a 18 años', 'Los menores no son aceptados con sus padres, se requiere ID', 'Horror detallado, alto grado de violencia, escenas sexuales específicas, adicciones y consumo de drogas');
INSERT INTO Classifications (classification_name, image, minimum_age, recommendation, summary) VALUES ('D', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/D_80x60.png?raw=true', 'Exclusivamente adultos', 'Restringido a mayores de 18 años y nadie de menores', 'Contenido explícito sexual, violencia, adicciones, sexualidad');
INSERT INTO Classifications (classification_name, image, minimum_age, recommendation, summary) VALUES ('E', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/E_80x60.png?raw=true', 'Mayores de 18', 'Clasificación pornográfica', 'Películas exclusivamente pornográficas');



INSERT INTO Movies (trailer_title, url, title, duration, id_classification, release_date, director, genre, image, synopsis) VALUES ('MI VILLANO FAVORITO 4 - Tráiler Oficial (Universal Pictures) HD' ,'https://www.youtube.com/embed/I0_qFoptZ4Y' ,'Mi villano favorito 4', 94, 1, '2024-07-03', 'Chris Renaud', 'Comedia', 'https://raw.githubusercontent.com/ACanto-30/files/master/Files/cinemavip-files/Resized/Mi_Villano_Favorito_4_390x360.jpg?token=GHSAT0AAAAAACQQGEW4SBZXGH5QOP56QIOQZTXLF5Q', 'Gru, Lucy, Margo, Edith y Agnes le dan la bienvenida a un nuevo miembro de la familia, Gru Jr., quien esta decidido a atormentar a su papá, Gru se enfrenta a un nuevo némesis llamado Maxime Le Mal y su novia Valentina, y la familia se ve obligada a huir.');
INSERT INTO Movies (trailer_title, url, title, duration, id_classification, release_date, director, genre, image, synopsis) VALUES ('EL BUS DE LA VIDA - Tráiler Oficial' ,'https://www.youtube.com/embed/_tQRFwWZKys' ,'El bus de la vida', 89, 2, '2024-07-05', 'Ibon Cormenzana', 'Drama', 'https://raw.githubusercontent.com/ACanto-30/files/master/Files/cinemavip-files/Resized/El_bus_de_la_vida_390x360.jpg?token=GHSAT0AAAAAACQQGEW52N7YSOMIGVXCH6L6ZTXLGPA', 'Andrés, un profesor de música que trabaja en Madrid tiene que trasladarse a un pueblo vaco para cubrir la plaza que ha quedado libre en un instituto, Con los 40 cumplidos y sin haber superado nunca el miedo escénico, siente que si nueva vida le está alejando del sueño de ser músico. Al llegar allí, en su primer día de clase sufre un desmayo a cusa de fuerte pitido en el oído: es cáncer. Para recibir tratamiento debe desplazarse al hospital de Bilbao en El BUS DE LA VIDA, un viejo autocar que traslada gratuitamente a todos los pacientes de la zona.');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (132, 3, '2024-07-12', 'Greg Berlanti', 'Romance', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Fly_me_to_the_moon_390x360.jpg?raw=true', 'Ambienta en el Histórico alunizaje del Apolo 11, en 1969. Llamados para mejorar la imagen pública de la NASA, las chipas vuelan en todas las direcciones cuando la prodigio del marketing Kelly Jones causa estragos en la difícil tarea del director del lanzamiento de Cole Davis. Cuando la Casa Blanca considera que la misión es demasiado importante para fracasar, Jones recibe la orden que la misión es demasiado importante para fracasar, Jones recibe la orden de disimular un alunizaje falso como respaldo.', 'Fly Me to the Moon', 'FLY ME TO THE MOON - Official Trailer (HD)', 'https://www.youtube.com/embed/lW7enw6mFxs');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (120, 4, '2024-07-18', 'Santiago Segura', 'Comedia', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Padre_no_hay_mas_que_uno_390x360.jpg?raw=true', '¿Qué efecto tendría e unos padres que el mismo día que su hija mayor cumple 18 años su novio le propone matrimonio y ella acepte de inmediato?', 'Padre no hay mas que uno 4: Campanas de boda', 'PADRE NO HAY MÁS QUE UNO 4. Trailer oficial en español HD. En cines 18 de julio.', 'https://www.youtube.com/embed/ftHAyhOuIWw');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (122, 3, '2024-07-19', 'Lee Isaac Chung', 'Accion', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Twisters_19_390x360.jpg?raw=true', 'Una actualización de la película de 1996 “Twisters”, centrada en un par de cazadores de tormentas que arriesgan sus vidas en un intento de probar un sistema experimental de alerta meteorológica.', 'Twisters', 'TWISTERS | Official Trailer', 'https://www.youtube.com/embed/wdok0rZdmx4');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (94, 5, '2024-07-19', 'Chris Nash', 'Terror', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/De_naturaleza_violenta_390x360.jpg?raw=true', 'Con ecos a viernes 13, en este “slasher” un muerto que vuelve a la vida llamado Johnny mata a los campistas uno a uno con métodos similares a los de la película de la mítica saga, pero yendo mucho más lejos que los de Jason.', 'De naturaleza violenta (In A Violent Nature)', 'In a Violent Nature (2024) - Tráiler Subtitulado en Español', 'https://www.youtube.com/embed/2d_hq-k1eoM');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (99, 3, '2024-07-25', 'Gunter Schwaiger', 'Documental', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Quien_teme_al_pueblo_de_Hitler_390x360.jpg?raw=true', '¿Por qué nunca se ha hecho una película en Austria sobre el lugar de nacimiento de Hitler? Esta fue la pregunta que se hizo el director Gunter Schwaiger cuando empezó a trabajar en esta película en 2018. Poco antes, la casa había sido expropiada por la Republica de Austria. Durante 5 años, el director acompaño con una mirada muy personal. Desde el cuestionamiento del cliché de la “ciudad nazi” hasta sorprendentes e indignantes descubrimientos, su camino le acaba conduciendo a su propia historia familiar.', '¿Quién teme al pueblo de hitler? (Wer Hat Angst vor Braunau?)', 'Trailer "¿Quién teme al pueblo de Hitler?"', 'https://www.youtube.com/embed/rTAthDarh6E');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (89, 3, '2024-07-26', 'Sonia Escolano', 'Comedia', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Norberta_390x360.jpg?raw=true', 'Norberto lleva toda una vida con María. Son gente humilde, de barrio, y de vez en cuando atracadores, pero Norberto necesita dar un giro para sentirte viva, libre, para sentirse “ella” misma. Una confesión inesperada que pondrá en jaque toda su vida.', 'Norberta', 'Norberta (2024) Tráiler Oficial Español', 'https://www.youtube.com/embed/0ecqUjf4r3w');
INSERT INTO Movies (duration, id_classification, release_date, director, genre, image, synopsis, title, trailer_title, url) VALUES (130, 5, '2024-07-26', 'Shawn Levy', 'Accion', 'https://github.com/ACanto-30/files/blob/master/Files/cinemavip-files/Resized/Deadpool_y_Wolverine_390x360.jpg?raw=true', 'Wade Wilson vive una vida tranquila, habiendo dejado atrás su época como mercenario Deadpool, hasta que la Time Variance Autority (TVA), una organización burocrática que existe fuera del tiempo y el espacio monitorea la línea temporal, lo involucra en una nueva misión. Con su universo natal enfrentando una amenaza existencial, Wilson se une a regañadientes a un Wolverine aún más reacio en una misión que cambiará la historia del MCU.', 'Deadpool and Wolverine', 'Deadpool & Wolverine | Tráiler Oficial | Doblado', 'https://www.youtube.com/embed/UzFZR2dRsSY');

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
INSERT INTO Theaters (theater_number) VALUES ('3');

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
INSERT INTO Actors (actor_name) VALUES ("Ray Romano");
INSERT INTO Actors (actor_name) VALUES ("Scarlett Johansson");
INSERT INTO Actors (actor_name) VALUES ("Channing Tatum");
INSERT INTO Actors (actor_name) VALUES ("Woody Harrelson");
INSERT INTO Actors (actor_name) VALUES ("Toni Acosta");
INSERT INTO Actors (actor_name) VALUES ("Calma Segura");
INSERT INTO Actors (actor_name) VALUES ("Diego Arroba");
INSERT INTO Actors (actor_name) VALUES ("Santiago Segura");
INSERT INTO Actors (actor_name) VALUES ("Glen Powell");
INSERT INTO Actors (actor_name) VALUES ("Kiernan Shipka");
INSERT INTO Actors (actor_name) VALUES ("Anthony Ramos");
INSERT INTO Actors (actor_name) VALUES ("Daisy Edgar-Jones");
INSERT INTO Actors (actor_name) VALUES ("Cameron Love");
INSERT INTO Actors (actor_name) VALUES ("Lauren-Marie Taylor");
INSERT INTO Actors (actor_name) VALUES ("Andrea Pavlovic");
INSERT INTO Actors (actor_name) VALUES ("Ry Barret");
INSERT INTO Actors (actor_name) VALUES ("Documental");
INSERT INTO Actors (actor_name) VALUES ("Luis Bermejo");
INSERT INTO Actors (actor_name) VALUES ("Adriana Ozores");
INSERT INTO Actors (actor_name) VALUES ("Maria Romanillos");
INSERT INTO Actors (actor_name) VALUES ("Mariona Teres");
INSERT INTO Actors (actor_name) VALUES ("Ryan Reynolds");
INSERT INTO Actors (actor_name) VALUES ("Leslie Uggams");
INSERT INTO Actors (actor_name) VALUES ("Hugh Jackman");
INSERT INTO Actors (actor_name) VALUES ("Emma Corrin");


INSERT INTO Casts (id_movie, id_actor) VALUES (1, 1);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 2);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 3);
INSERT INTO Casts (id_movie, id_actor) VALUES (1, 4);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 5);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 6);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 7);
INSERT INTO Casts (id_movie, id_actor) VALUES (2, 8);
INSERT INTO Casts (id_actor, id_movie) VALUES (9, 3);
INSERT INTO Casts (id_actor, id_movie) VALUES (10, 3);
INSERT INTO Casts (id_actor, id_movie) VALUES (11, 3);
INSERT INTO Casts (id_actor, id_movie) VALUES (12, 3);
INSERT INTO Casts (id_actor, id_movie) VALUES (13, 4);
INSERT INTO Casts (id_actor, id_movie) VALUES (14, 4);
INSERT INTO Casts (id_actor, id_movie) VALUES (15, 4);
INSERT INTO Casts (id_actor, id_movie) VALUES (16, 4);
INSERT INTO Casts (id_actor, id_movie) VALUES (17, 5);
INSERT INTO Casts (id_actor, id_movie) VALUES (18, 5);
INSERT INTO Casts (id_actor, id_movie) VALUES (19, 5);
INSERT INTO Casts (id_actor, id_movie) VALUES (20, 5);
INSERT INTO Casts (id_actor, id_movie) VALUES (21, 6);
INSERT INTO Casts (id_actor, id_movie) VALUES (22, 6);
INSERT INTO Casts (id_actor, id_movie) VALUES (23, 6);
INSERT INTO Casts (id_actor, id_movie) VALUES (24, 6);
INSERT INTO Casts (id_actor, id_movie) VALUES (25, 7);
INSERT INTO Casts (id_actor, id_movie) VALUES (26, 8);
INSERT INTO Casts (id_actor, id_movie) VALUES (27, 8);
INSERT INTO Casts (id_actor, id_movie) VALUES (28, 8);
INSERT INTO Casts (id_actor, id_movie) VALUES (29, 8);
INSERT INTO Casts (id_actor, id_movie) VALUES (30, 9);
INSERT INTO Casts (id_actor, id_movie) VALUES (31, 9);
INSERT INTO Casts (id_actor, id_movie) VALUES (32, 9);
INSERT INTO Casts (id_actor, id_movie) VALUES (33, 9);


INSERT INTO Users (first_name, last_name, email) VALUES ('Riquelme', 'Roman', 'riquelme@gmail.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Diego', 'Maradona', 'maradona@email.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Kylian', 'Mbappe', 'mbappe@hotmail.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Iosef', 'Stalin', 'josef@gulag.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Adolf', 'Hitler', 'siegheil@judio.com');
INSERT INTO Users (first_name, last_name, email) VALUES ('Santiago', 'Abascal', 'killmuslim@islam.com');
INSERT INTO Users (email, first_name, last_name) VALUES ('Josejose@tedaria.com', 'Jose', 'Daria');
INSERT INTO Users (email, first_name, last_name) VALUES ('HernestoOP@op.com', 'Hernesto', 'Opera');
INSERT INTO Users (email, first_name, last_name) VALUES ('JulianAl@fc.com', 'Julian', 'Alvares');
INSERT INTO Users (email, first_name, last_name) VALUES ('Master89@html.com', 'Luis', 'Lopez');
INSERT INTO Users (email, first_name, last_name) VALUES ('Ken@mc.com', 'Ken', 'justab');
INSERT INTO Users (email, first_name, last_name) VALUES ('Barbie@mc.com', 'Barbie', 'Delena');
INSERT INTO Users (email, first_name, last_name) VALUES ('Leonel@paris.com', 'Leonel', 'Messi');
INSERT INTO Users (email, first_name, last_name) VALUES ('Cristiano@dubai.com', 'Cristiano', 'Ronaldo');
INSERT INTO Users (email, first_name, last_name) VALUES ('Keylor@nabas.com', 'Keylor', 'Nabas');



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
INSERT INTO Reserved_Seats (id_seat, id_ticket) VALUES (3, 9);*/