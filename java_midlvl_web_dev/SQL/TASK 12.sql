Task 12.


1. In the movie table, the movie length is shown in the length column. How many movies are longer than the average movie length?
SELECT COUNT(length) FROM film
WHERE length >
(
	SELECT AVG(length) FROM film
);

2. How many movies have the highest rental_rate in the movie table?
SELECT COUNT(rental_rate) FROM film
WHERE rental_rate =
(
	SELECT MAX(rental_rate) FROM film
);


3. In the film table, list the films with the lowest rental rate and the lowest replacement cost.
SELECT title, rental_rate, replacement_cost FROM film
WHERE rental_rate =
(
	SELECT MIN(rental_rate) FROM film
)
AND replacement_cost = 
(
	SELECT MIN(replacement_cost) FROM Film
);

4. In the payment table, list the customers who make the most purchases.
SELECT customer.first_name, customer.last_name, payment.customer_id, COUNT(payment.customer_id) FROM payment, customer
WHERE customer.customer_id = payment.customer_id
GROUP BY customer.first_name, customer.last_name, payment.customer_id
ORDER BY COUNT(payment.customer_id) DESC;