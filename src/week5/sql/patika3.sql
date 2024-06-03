select country from country where country_name like 'A%a';

select country from country where length(country) >= 6 and country like '%n';

SELECT title FROM film WHERE (title ILIKE '%t%t%t%t%');

select * from film WHERE (title like 'C%') AND length > 90 AND rental_rate = 2.99;
