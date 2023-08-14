CREATE TABLE CUSTOMERS(
                          id SERIAL PRIMARY KEY,
                          name VARCHAR,
                          surname VARCHAR,
                          age INT,
                          phone_number VARCHAR
);
INSERT INTO CUSTOMERS(name, surname, age, phone_number)
VALUES ('Олег','Иванов',34,'+7 934-347-67-13'),
       ('Пётр','Сидоров',37,'+7 938-213-12-49'),
       ('Анна','Кузнецова',20,'+7 939-888-35-09');
INSERT INTO CUSTOMERS(name, surname,age, phone_number)
VALUES ('Alexey','Alexseev',27,'+7 944-458-59-04');

CREATE TABLE ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         TIMESTAMP,
    customer_id  SERIAL REFERENCES CUSTOMERS(id),
    product_name VARCHAR,
    amount       BIGINT
);

INSERT INTO ORDERS(date, product_name, amount)
VALUES ('2022-10-10 11:30:30','Кофе','2'),
       ('2021-11-11 11:11:11','Молоко','1'),
       ('2022-10-10 11:30:30','Сахар','10'),
       ('2022-10-10 11:30:30','Апельсины','13');


