USE MASTER 
GO
DROP DATABASE InventorySystem
GO
CREATE DATABASE InventorySystem;
GO
USE InventorySystem;
GO

-- Create the Orders table
CREATE TABLE dbo.Orders (
    order_id INT PRIMARY KEY,
    customer_id VARCHAR(5),
	order_date DATETIME,
	required_date DATETIME,
	shipped_date DATETIME,
	ship_address VARCHAR(100)
);
GO

-- Create the OrderDetails table
CREATE TABLE dbo.OrderDetails (
    order_id INT,
    product_id VARCHAR(10),
    unit_price MONEY,
	quantity TINYINT,
	discount FLOAT,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id) REFERENCES dbo.Orders(order_id)
);
GO

-- Insert data into the Orders table
INSERT INTO dbo.Orders (order_id, customer_id, order_date, required_date, shipped_date, ship_address) VALUES 
(1, 'C001', '2024-05-9', '2024-05-18', '2024-05-20', '123 Main St');
(2, 'C002', '2024-05-10', '2024-05-19', '2024-05-21', '124 Main St');
(3, 'C003', '2024-05-11', '2024-05-20', '2024-05-22', '125 Main St');

-- Insert data into the OrderDetails table
INSERT INTO dbo.OrderDetails (order_id, product_id, unit_price, quantity, discount) VALUES 
(1, 'P001', 19.99, 1, 0);
(2, 'P002', 19.98, 2, 0);
(3, 'P003', 19.97, 3, 0);

SELECT * FROM dbo.Orders
SELECT * FROM dbo.OrderDetails


