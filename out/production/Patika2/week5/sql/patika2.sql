select * from film where replacement_cost between 12.99 AND 16.99

select first_name, last_name from actor where first_name IN ('Penelope','Nick','Ed')

select * from film where rental_rate IN (0.99,2.99,4.99) AND replacement_cost IN(12.99,15.99,28.99);