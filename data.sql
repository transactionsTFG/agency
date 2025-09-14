-- HOTEL MTA
INSERT INTO COUNTRY (NAME, VERSION) VALUES
('España', 1), ('Francia', 1), ('Italia', 1), ('Alemania', 1), ('Portugal', 1),
('Reino Unido', 1), ('Estados Unidos', 1), ('Mexico', 1), ('Brasil', 1), ('Argentina', 1),
('Canada', 1), ('Japon', 1), ('China', 1), ('India', 1), ('Australia', 1),
('Sudafrica', 1), ('Egipto', 1), ('Rusia', 1), ('Turquia', 1), ('Grecia', 1);

-- Insertar en CUSTOMER
INSERT INTO CUSTOMER (AVAILABLE, DNI, EMAIL, NAME, PHONE, VERSION) VALUES
(1, '12345678A', 'juan.perez@email.com', 'Juan Pérez', '600123456', 1),
(1, '23456789B', 'maria.garcia@email.com', 'María García', '611234567', 1),
(1, '34567890C', 'carlos.lopez@email.com', 'Carlos López', '622345678', 1),
(1, '45678901D', 'ana.fernandez@email.com', 'Ana Fernández', '633456789', 1),
(1, '56789012E', 'david.martinez@email.com', 'David Martínez', '644567890', 1),
(1, '67890123F', 'laura.sanchez@email.com', 'Laura Sánchez', '655678901', 1),
(1, '78901234G', 'jorge.diaz@email.com', 'Jorge Díaz', '666789012', 1),
(1, '89012345H', 'sofia.ramirez@email.com', 'Sofía Ramírez', '677890123', 1),
(1, '90123456I', 'pedro.torres@email.com', 'Pedro Torres', '688901234', 1),
(1, '01234567J', 'marta.romero@email.com', 'Marta Romero', '699012345', 1),
(1, '11111111K', 'manuel.vazquez@email.com', 'Manuel Vázquez', '600111222', 1),
(1, '22222222L', 'isabel.ortega@email.com', 'Isabel Ortega', '611222333', 1),
(1, '33333333M', 'raul.medina@email.com', 'Raúl Medina', '622333444', 1),
(1, '44444444N', 'elena.castro@email.com', 'Elena Castro', '633444555', 1),
(1, '55555555O', 'hugo.herrera@email.com', 'Hugo Herrera', '644555666', 1),
(1, '66666666P', 'clara.navarro@email.com', 'Clara Navarro', '655666777', 1),
(1, '77777777Q', 'pablo.reyes@email.com', 'Pablo Reyes', '666777888', 1),
(1, '88888888R', 'nuria.serrano@email.com', 'Nuria Serrano', '677888999', 1),
(1, '99999999S', 'adrian.gil@email.com', 'Adrián Gil', '688999000', 1),
(1, '00000000T', 'beatriz.molina@email.com', 'Beatriz Molina', '699000111', 1);

-- Insertar en HOTEL
INSERT INTO HOTEL (NAME, VERSION) VALUES
('Hotel Madrid', 1), ('Hotel Barcelona', 1), ('Hotel Paris', 1), ('Hotel Roma', 1), ('Hotel Berlin', 1),
('Hotel Lisboa', 1), ('Hotel Londres', 1), ('Hotel Nueva York', 1), ('Hotel Ciudad de Mexico', 1), ('Hotel Río de Janeiro', 1),
('Hotel Buenos Aires', 1), ('Hotel Toronto', 1), ('Hotel Tokio', 1), ('Hotel Pekin', 1), ('Hotel Nueva Delhi', 1),
('Hotel Sídney', 1), ('Hotel Ciudad del Cabo', 1), ('Hotel El Cairo', 1), ('Hotel Moscu', 1), ('Hotel Atenas', 1);

-- Insertar en BOOKING
INSERT INTO BOOKING (AVAILABLE, PEOPLENUMBER, TOTALPRICE, VERSION, WITHBREAKFAST, CUSTOMER_ID) VALUES
(1, 2, 200.00, 1, 1, 1), (1, 3, 300.00, 1, 0, 2), (1, 1, 100.00, 1, 1, 3), (1, 4, 400.00, 1, 0, 4), (1, 2, 250.00, 1, 1, 5),
(1, 2, 220.00, 1, 0, 6), (1, 1, 90.00, 1, 1, 7), (1, 3, 320.00, 1, 0, 8), (1, 4, 500.00, 1, 1, 9), (1, 2, 275.00, 1, 0, 10),
(1, 2, 280.00, 1, 1, 11), (1, 1, 85.00, 1, 0, 12), (1, 3, 315.00, 1, 1, 13), (1, 4, 450.00, 1, 0, 14), (1, 2, 260.00, 1, 1, 15),
(1, 2, 230.00, 1, 0, 16), (1, 1, 95.00, 1, 1, 17), (1, 3, 350.00, 1, 0, 18), (1, 4, 600.00, 1, 1, 19), (1, 2, 290.00, 1, 0, 20);

-- Insertar en COUNTRY_HOTEL
INSERT INTO COUNTRY_HOTEL (hotel_ID, countries_ID) VALUES
(1, 1), (2, 1), (3, 2), (4, 3), (5, 4), (6, 5), (7, 6), (8, 7), (9, 8), (10, 9),
(11, 10), (12, 11), (13, 12), (14, 13), (15, 14), (16, 15), (17, 16), (18, 17), (19, 18), (20, 19);

-- Insertar en ROOM
INSERT INTO ROOM (AVAILABLE, DAILYPRICE, NUMBER, PEOPLENUMBER, SINGLEBED, VERSION, HOTEL_ID) VALUES
(1, 80.00, 101, 2, 0, 1, 1), (1, 100.00, 102, 3, 1, 1, 2), (1, 70.00, 103, 1, 1, 1, 3), (1, 120.00, 104, 4, 0, 1, 4),
(1, 90.00, 105, 2, 0, 1, 5), (1, 110.00, 106, 3, 1, 1, 6), (1, 60.00, 107, 1, 1, 1, 7), (1, 130.00, 108, 4, 0, 1, 8),
(1, 85.00, 109, 2, 0, 1, 9), (1, 105.00, 110, 3, 1, 1, 10);

-- Insertar en BOOKINGLINE
INSERT INTO BOOKINGLINE (AVAILABLE, ENDDATE, NUMBEROFNIGHTS, ROOMDAILYPRICE, STARTDATE, booking_id, room_id) VALUES
(1, '10/03/2030', 3, 80.00, '07/03/2030', 1, 1), (1, '12/04/2030', 2, 100.00, '10/04/2030', 2, 2),
(1, '15/05/2030', 1, 70.00, '14/05/2030', 3, 3), (1, '18/06/2030', 4, 120.00, '14/06/2030', 4, 4);

-- AIRLINE MTA
-- Insertar en CUSTOMER
INSERT INTO CUSTOMER (ACTIVE, DNI, EMAIL, NAME, PHONE, VERSION) VALUES
(1, '12345678A', 'juan.perez@email.com', 'Juan Pérez', '600123456', 1),
(1, '23456789B', 'maria.garcia@email.com', 'María García', '611234567', 1),
(1, '34567890C', 'carlos.lopez@email.com', 'Carlos López', '622345678', 1),
(1, '45678901D', 'ana.fernandez@email.com', 'Ana Fernández', '633456789', 1),
(1, '56789012E', 'david.martinez@email.com', 'David Martínez', '644567890', 1),
(1, '67890123F', 'laura.sanchez@email.com', 'Laura Sánchez', '655678901', 1),
(1, '78901234G', 'jorge.diaz@email.com', 'Jorge Díaz', '666789012', 1),
(1, '89012345H', 'sofia.ramirez@email.com', 'Sofía Ramírez', '677890123', 1),
(1, '90123456I', 'pedro.torres@email.com', 'Pedro Torres', '688901234', 1),
(1, '01234567J', 'marta.romero@email.com', 'Marta Romero', '699012345', 1),
(1, '11111111K', 'manuel.vazquez@email.com', 'Manuel Vázquez', '600111222', 1),
(1, '22222222L', 'isabel.ortega@email.com', 'Isabel Ortega', '611222333', 1),
(1, '33333333M', 'raul.medina@email.com', 'Raúl Medina', '622333444', 1),
(1, '44444444N', 'elena.castro@email.com', 'Elena Castro', '633444555', 1),
(1, '55555555O', 'hugo.herrera@email.com', 'Hugo Herrera', '644555666', 1),
(1, '66666666P', 'clara.navarro@email.com', 'Clara Navarro', '655666777', 1),
(1, '77777777Q', 'pablo.reyes@email.com', 'Pablo Reyes', '666777888', 1),
(1, '88888888R', 'nuria.serrano@email.com', 'Nuria Serrano', '677888999', 1),
(1, '99999999S', 'adrian.gil@email.com', 'Adrián Gil', '688999000', 1),
(1, '00000000T', 'beatriz.molina@email.com', 'Beatriz Molina', '699000111', 1);

-- Generar PAISES
INSERT INTO COUNTRY (ID, ACTIVE, NAME, PATHIMG, VERSION) VALUES
(1, TRUE, 'United States', '/images/flags/united_states.png', 1),
(2, FALSE, 'Canada', '/images/flags/canada.png', 1),
(3, TRUE, 'Mexico', '/images/flags/mexico.png', 1),
(4, FALSE, 'Brazil', '/images/flags/brazil.png', 1),
(5, TRUE, 'Argentina', '/images/flags/argentina.png', 1),
(6, FALSE, 'Germany', '/images/flags/germany.png', 1),
(7, TRUE, 'France', '/images/flags/france.png', 1),
(8, FALSE, 'United Kingdom', '/images/flags/united_kingdom.png', 1),
(9, TRUE, 'Spain', '/images/flags/spain.png', 1),
(10, FALSE, 'Italy', '/images/flags/italy.png', 1);

-- Generar AIRPORT
INSERT INTO AIRPORT (ID, ACTIVE, CITY, CODENAME, NAME, COUNTRY_ID, VERSION) VALUES
(1, TRUE, 'New York', 'JFK', 'Airport 1', 1, 1),
(2, FALSE, 'Los Angeles', 'LAX', 'Airport 2', 2, 1),
(3, TRUE, 'Chicago', 'ORD', 'Airport 3', 3, 1),
(4, FALSE, 'Miami', 'MIA', 'Airport 4', 4, 1),
(5, TRUE, 'Houston', 'IAH', 'Airport 5', 5, 1),
(6, TRUE, 'New York', 'JFK', 'Airport 6', 6, 1),
(7, FALSE, 'Los Angeles', 'LAX', 'Airport 7', 7, 1),
(8, TRUE, 'Chicago', 'ORD', 'Airport 8', 8, 1),
(9, FALSE, 'Miami', 'MIA', 'Airport 9', 9, 1),
(10, TRUE, 'Houston', 'IAH', 'Airport 10', 10, 1);

-- Generar AIRCRAFT
INSERT INTO AIRCRAFT (ID, ACTIVE, CAPACITY, MODEL, VERSION) VALUES
(1, TRUE, 1800, 'Boeing 737', 1),
(2, FALSE, 1500, 'Airbus A320', 1),
(3, TRUE, 2500, 'Boeing 777', 1),
(4, TRUE, 1200, 'Embraer 190', 1),
(5, FALSE, 2000, 'Boeing 737', 1),
(6, TRUE, 175, 'Airbus A320', 1),
(7, FALSE, 2200, 'Boeing 777', 1),
(8, TRUE, 1300, 'Embraer 190', 1),
(9, TRUE, 1900, 'Boeing 737', 1),
(10, FALSE, 1400, 'Airbus A320', 1);

-- Generar FLIGHT
INSERT INTO FLIGHT (ID, ACTIVE, ARRIVALTIME, CODEFLIGHT, DEPARTURETIME, VERSION, WEEKDAY, AIRCRAFT_ID, DESTINATION_ID, ORIGIN_ID) VALUES
(1, TRUE, '12:30:45', 'FL-1234', '06:15:30', 1, 'Monday', 1, 3, 5),
(2, FALSE, '08:45:00', 'FL-5678', '14:20:10', 1, 'Tuesday', 2, 5, 2),
(3, TRUE, '17:10:35', 'FL-9876', '10:40:55', 1, 'Wednesday', 3, 4, 1),
(4, FALSE, '19:05:20', 'FL-4321', '22:30:15', 1, 'Thursday', 4, 2, 3),
(5, TRUE, '23:55:10', 'FL-5432', '02:15:00', 1, 'Friday', 5, 1, 4),
(6, TRUE, '05:10:50', 'FL-6543', '07:45:20', 1, 'Saturday', 6, 4, 2),
(7, FALSE, '14:30:25', 'FL-7654', '16:50:40', 1, 'Sunday', 7, 3, 5),
(8, TRUE, '09:40:30', 'FL-8765', '11:20:05', 1, 'Monday', 8, 2, 4),
(9, FALSE, '21:50:55', 'FL-9875', '01:35:45', 1, 'Tuesday', 9, 5, 1),
(10, TRUE, '04:25:15', 'FL-1098', '06:10:20', 1, 'Wednesday', 10, 1, 3);

-- Generar Flight Instance
INSERT INTO FLIGHTINSTANCE (ID, ACTIVE, ARRIVALDATE, DEPARTUREDATE, PASSENGERCOUNTER, PRICE, STATUSFLIGHT, VERSION, FLIGHT_ID) VALUES
(1, TRUE, '2030-01-07', '2030-12-30', 152, 212.36, 'Scheduled', 1, 4),
(2, FALSE, '2030-01-13', '2030-10-16', 126, 880.36, 'Scheduled', 1, 9),
(3, FALSE, '2030-07-01', '2030-06-02', 148, 950.45, 'Scheduled', 1, 7),
(4, TRUE, '2030-10-03', '2030-06-02', 154, 997.26, 'Scheduled', 1, 5),
(5, TRUE, '2030-08-26', '2030-05-02', 165, 880.76, 'Scheduled', 1, 3),
(6, FALSE, '2030-06-14', '2030-11-11', 132, 721.65, 'Scheduled', 1, 8),
(7, TRUE, '2030-09-22', '2030-07-09', 174, 633.50, 'Completed', 1, 1),
(8, FALSE, '2030-02-17', '2030-03-25', 123, 412.89, 'Scheduled', 1, 2),
(9, TRUE, '2030-11-19', '2030-04-30', 156, 542.39, 'Scheduled', 1, 6),
(10, FALSE, '2030-03-11', '2030-08-15', 134, 275.90, 'Completed', 1, 10);