-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(animal_id) count from animal_ins
GROUP BY animal_type
ORDER BY animal_type;