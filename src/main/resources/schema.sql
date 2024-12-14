CREATE TABLE IF NOT EXISTS product
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description TEXT,
    price       DECIMAL(10, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS category
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS item
(
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id         BIGINT       NOT NULL,
    category_id        BIGINT       NOT NULL,
    quantity_in_stock  INT          NOT NULL,
    warehouse_location VARCHAR(255) NOT NULL,

    FOREIGN KEY (product_id) REFERENCES product (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
);

CREATE TABLE IF NOT EXISTS admin
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
