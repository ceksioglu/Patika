--  actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
--  actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
--  actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
--  İlk 3 sorguyu tekrar eden veriler için de yapalım.

--Tekrar eden datayı görmek için ALL ekleyin.
(
	SELECT first_name
	FROM actor
	ORDER BY first_name 
)
UNION
(
	SELECT first_name
	FROM customer
	ORDER BY first_name
);

(
	SELECT first_name
	FROM actor 
)
INTERSECT
(
	SELECT first_name
	FROM customer
);

(
	SELECT first_name
	FROM actor
)
EXCEPT
(
	SELECT first_name
	FROM customer
);