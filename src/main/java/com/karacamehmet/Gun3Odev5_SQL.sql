Use these queries one line at a time on: https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all

--SELECT-- Used to fetch data from a database table.
SELECT * FROM Products;
SELECT * FROM Customers;
SELECT * FROM Orders;

--WHERE-- Used to filter records in a query based on a specified condition, allowing you to retrieve only the rows that meet the specified criteria from a table.
SELECT * FROM Products WHERE CategoryID=5;
SELECT * FROM Categories WHERE CategoryID>5;
SELECT * FROM Products WHERE CategoryID>5 and Price<10;

--Order By-- Used to sort the result set of a query based on specified columns in ascending or descending order.
SELECT * FROM Suppliers ORDER BY Country;
SELECT * FROM Suppliers ORDER BY Country,PostalCode;
SELECT * FROM Products WHERE CategoryID>5 and Price<10 ORDER BY Price ASC;
SELECT * FROM Products WHERE CategoryID>5 and Price<10 ORDER BY Price DESC;

--COUNT-- Used to return the number of rows that satisfy a specified condition in a query, or it can be used to count all the rows in a table.
SELECT COUNT(*) FROM Suppliers;
SELECT COUNT(*) FROM Suppliers WHERE SupplierID>10;

--AS-- Used to alias or rename a column or table in query results.
SELECT COUNT(*) AS EXP FROM Suppliers WHERE SupplierID>10;

--SUM-- Used to calculate the total numeric value of a specific column in a result set.
SELECT SUM(Price) as TotalPrice FROM Products;

--GROUP BY-- Used to group rows that have the same values in specified columns.
SELECT CategoryID, SUM(Price) as TotalPrice FROM Products GROUP BY CategoryID;
SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID;

--HAVING-- Used in conjunction with the GROUP BY clause to filter the results of a query based on conditions applied to aggregated data.
SELECT CategoryID, COUNT(*) FROM Products WHERE Price>15 GROUP BY CategoryID HAVING COUNT(*)<5;

--JOIN--(Some times INNER JOIN) Used to combine rows from two or more tables based on a related column between them, creating a result set that includes columns from both tables.
SELECT Orders.OrderID, Orders.CustomerID, Customers.CustomerName FROM Orders INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
SELECT * FROM Products inner JOIN categories ON Products.CategoryID = Categories.CategoryID;