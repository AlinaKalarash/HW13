CREATE TABLE Client (
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) >= 3),
    UNIQUE(name)
);

CREATE TABLE Planet (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1),
    UNIQUE(id)
);

CREATE TABLE Ticket (
    id SERIAL PRIMARY KEY,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    client_id INTEGER REFERENCES Client(id),
    from_planet_id VARCHAR(10) REFERENCES Planet(id),
    to_planet_id VARCHAR(10) REFERENCES Planet(id)
);