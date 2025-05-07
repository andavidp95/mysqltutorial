## DATA BASE
### Project: Employee Management System

### Description
CREATE TABLE project.Employees (
employee_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100) UNIQUE,
phone_number VARCHAR(20),
hire_date DATE,
job_title VARCHAR(50),
salary DECIMAL(10, 2),
department_id INT,
manager_id INT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

### Constraints
INSERT INTO project.Employees
(first_name, last_name, email, phone_number, hire_date, job_title, salary, department_id, manager_id)
VALUES
('Alice', 'Johnson', 'alice.johnson@example.com', '555-1234', '2021-04-12', 'Developer', 70000.00, 1, NULL),
('Bob', 'Smith', 'bob.smith@example.com', NULL, '2019-08-22', 'Manager', 90000.00, 2, NULL),
('Charlie', 'Lee', 'charlie.lee@example.com', '555-5678', '2022-01-15', 'QA Engineer', 60000.00, 1, 2),
('Diana', 'Prince', 'diana.prince@example.com', '555-8765', '2020-11-01', NULL, 80000.00, NULL, 2),
('Ethan', 'Wong', 'ethan.wong@example.com', '555-0001', '2023-03-30', 'Intern', NULL, 3, 2),
('Fiona', 'Garcia', 'fiona.garcia@example.com', NULL, '2021-06-05', 'Developer', 72000.00, 1, 2);
