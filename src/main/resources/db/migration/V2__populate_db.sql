INSERT INTO Client (name) VALUES
('John Smith'),
('Alice Johnson'),
('Michael Brown'),
('Emily Davis'),
('David Wilson'),
('Sarah Martinez'),
('James Taylor'),
('Jennifer Anderson'),
('Christopher Thomas'),
('Jessica Garcia');

INSERT INTO Planet (id, name) VALUES
('MARS', 'Mars'),
('VEN', 'Venus'),
('JUP', 'Jupiter'),
('SAT', 'Saturn'),
('NEP', 'Neptune');

INSERT INTO Ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES
(NOW(), 1, 'MARS', 'VEN'),
(NOW(), 2, 'JUP', 'SAT'),
(NOW(), 3, 'VEN', 'MARS'),
(NOW(), 4, 'MARS', 'NEP'),
(NOW(), 5, 'SAT', 'JUP'),
(NOW(), 6, 'MARS', 'SAT'),
(NOW(), 7, 'NEP', 'MARS'),
(NOW(), 8, 'VEN', 'JUP'),
(NOW(), 9, 'MARS', 'NEP'),
(NOW(), 10, 'SAT', 'VEN');
