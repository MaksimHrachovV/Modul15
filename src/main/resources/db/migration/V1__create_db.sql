CREATE TABLE IF NOT EXISTS NOTE(
    ID IDENTITY PRIMARY KEY,
    TITLE VARCHAR(200) NOT NULL,
    CONTENT VARCHAR(200) NOT NULL);