SELECT C.name,
       ORDERS.product_name
FROM ORDERS
         INNER JOIN CUSTOMERS C on C.id = ORDERS.customer_id
GROUP BY C.name, ORDERS.product_name