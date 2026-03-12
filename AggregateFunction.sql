CREATE TABLE student
    -> (
    -> id INT PRIMARY KEY,
    -> name VARCHAR(10) NOT NULL,
    -> address VARCHAR(10) not null,
    -> age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.05 sec)

DESC student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| id      | int         | NO   | PRI | NULL    |       |
| name    | varchar(10) | NO   |     | NULL    |       |
| address | varchar(10) | NO   |     | NULL    |       |
| age     | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

INSERT INTO student VAlUES
    -> (1, 'John', 'AV Road', 12),
    -> (2, 'Alex', 'Street 20', 15),
    -> (3, 'Arjun', 'WT Road', 13),
    -> (4, 'Aryan', 'Street 40', 11),
    -> (5, 'Rohit', 'CJ Road', 13);
Query OK, 5 rows affected (0.02 sec)
Records: 5  Duplicates: 0  Warnings: 0

Select * FROM student;
+----+-------+-----------+-----+
| id | name  | address   | age |
+----+-------+-----------+-----+
|  1 | John  | AV Road   |  12 |
|  2 | Alex  | Street 20 |  15 |
|  3 | Arjun | WT Road   |  13 |
|  4 | Aryan | Street 40 |  11 |
|  5 | Rohit | CJ Road   |  13 |
+----+-------+-----------+-----+
5 rows in set (0.00 sec)

Select COUNT(age) FROM student WHERE age > 12;
+------------+
| COUNT(age) |
+------------+
|          3 |
+------------+
1 row in set (0.00 sec)

Select AVG(age) FROM student;
+----------+
| AVG(age) |
+----------+
|  12.8000 |
+----------+
1 row in set (0.00 sec)

Select MIN(age) FROM student;
+----------+
| MIN(age) |
+----------+
|       11 |
+----------+
1 row in set (0.00 sec)

Select MAX(age) FROM student;
+----------+
| MAX(age) |
+----------+
|       15 |
+----------+
1 row in set (0.00 sec)

Select SUM(age) FROM student;
+----------+
| SUM(age) |
+----------+
|       64 |
+----------+
1 row in set (0.00 sec)