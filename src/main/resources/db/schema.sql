CREATE DATABASE IF NOT EXISTS busan_stamp
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE busan_stamp;

CREATE TABLE users (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    nickname VARCHAR(50) NOT NULL,
    role VARCHAR(20) NOT NULL DEFAULT 'USER',
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT uk_users_email UNIQUE (email)
);


CREATE TABLE places (
    place_id BIGINT AUTO_INCREMENT PRIMARY KEY,

    name VARCHAR(100) NOT NULL,
    description TEXT,
    address VARCHAR(255) NOT NULL,

    latitude DECIMAL(10, 7) NOT NULL,
    longitude DECIMAL(10, 7) NOT NULL,

    category VARCHAR(50) NOT NULL,
    image_url VARCHAR(500),

    created_by BIGINT NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
        ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT fk_places_created_by
        FOREIGN KEY (created_by)
            REFERENCES users(user_id)
);