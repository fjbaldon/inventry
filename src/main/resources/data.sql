INSERT INTO product (name, description, price)
VALUES
    ('Laptop', 'High-performance laptop', 1200.00),
    ('Smartphone', 'Latest model smartphone', 800.00),
    ('Headphones', 'Noise-cancelling headphones', 150.00);

INSERT INTO category (name)
VALUES
    ('Electronics'),
    ('Accessories'),
    ('Home Appliances');

INSERT INTO item (product_id, category_id, quantity_in_stock, warehouse_location)
VALUES
    (1, 1, 50, 'A1'),
    (2, 1, 100, 'B2'),
    (3, 2, 75, 'C3');

INSERT INTO admin (username, password)
VALUES
    ('admin', 'password123'),
    ('manager', 'manager2024');
