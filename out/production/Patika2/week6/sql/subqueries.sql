/*
 film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
 film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
 film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
 payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
*/

SELECT COUNT(*) FROM film
WHERE length > (

	SELECT AVG(length(film))
	FROM film
	
);


SELECT COUNT(*) FROM film
WHERE rental_rate = (

	SELECT MAX(rental_rate) 
	FROM film
);


SELECT film_id, title FROM film
WHERE rental_rate = (

	SELECT MIN(rental_rate) FROM film
) AND replacement_cost = (

	SELECT MIN(replacement_cost) FROM film
) 
ORDER BY title;


SELECT customer_id, payment_count
FROM (
    SELECT customer_id, COUNT(*) as payment_count
    FROM payment
    GROUP BY customer_id
) as customer_payments
ORDER BY payment_count DESC;
