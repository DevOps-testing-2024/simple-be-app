CREATE TABLE IF NOT EXISTS Description (
    id BIGSERIAL PRIMARY KEY,
    details VARCHAR(255) NOT NULL
);

INSERT INTO Description (details) VALUES ('Test one');
INSERT INTO Description (details) VALUES ('test two');