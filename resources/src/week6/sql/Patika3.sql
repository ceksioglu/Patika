-- 1. Filmleri rating değerlerine göre gruplama
SELECT rating, COUNT(*) AS film_sayisi
FROM film
GROUP BY rating;

-- 2. Film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda,
-- film sayısı 50'den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralama
SELECT replacement_cost, COUNT(*) AS film_sayisi
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_sayisi DESC;

-- 3. Customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayıları
SELECT store_id, COUNT(*) AS musteri_sayisi
FROM customer
GROUP BY store_id;

-- 4. City tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra
-- en fazla şehir sayısı barındıran country_id bilgisi ve şehir sayısı
SELECT country_id, COUNT(*) AS sehir_sayisi
FROM city
GROUP BY country_id
ORDER BY sehir_sayisi DESC
LIMIT 1;
