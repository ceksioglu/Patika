SELECT DISTINCT replacement_cost FROM film

SELECT DISTINCT COUNT (replacement_cost) FROM film

SELECT title FROM film WHERE (title LIKE 'T%') AND rating = 'G';

SELECT country FROM country WHERE LENGTH(country) = 5;

SELECT city FROM city WHERE city ILIKE '%R';