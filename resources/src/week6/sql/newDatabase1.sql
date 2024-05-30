-- Adım 1: employee tablosunu oluştur
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);

-- Adım 2: 5 adet UPDATE işlemi gerçekleştir
-- id'si 1 olan satırın adını güncelle
UPDATE employee
SET name = 'Güncellenmiş İsim'
WHERE id = 1;

-- Adı 'Jane' olan satırın doğum gününü güncelle
UPDATE employee
SET birthday = '1992-01-01'
WHERE name = 'Jane';

-- Doğum günü '1985-06-15' olan satırın emailini güncelle
UPDATE employee
SET email = 'yenimail@example.com'
WHERE birthday = '1985-06-15';

-- Emaili 'john@example.com' olan satırın adını güncelle
UPDATE employee
SET name = 'John Güncellendi'
WHERE email = 'john@example.com';

-- id'si 2 olan satırın doğum gününü güncelle
UPDATE employee
SET birthday = '1991-07-07'
WHERE id = 2;

-- Adım 3: 5 adet DELETE işlemi gerçekleştir
-- id'si 3 olan satırı sil
DELETE FROM employee
WHERE id = 3;

-- Adı 'Jane' olan satırı sil
DELETE FROM employee
WHERE name = 'Jane';

-- Doğum günü '1990-08-24' olan satırı sil
DELETE FROM employee
WHERE birthday = '1990-08-24';

-- Emaili 'doe@example.com' olan satırı sil
DELETE FROM employee
WHERE email = 'doe@example.com';

-- id'si 4 olan satırı sil
DELETE FROM employee
WHERE id = 4;
