-- 코드를 입력하세요

SELECT history_id, 
       car_id, 
       date_format(start_date, '%Y-%m-%d') as START_DATE, 
       date_format(end_date, '%Y-%m-%d') as END_DATE,
       CASE 
           WHEN DATEDIFF(end_date, start_date) < 29 THEN '단기 대여'
           ELSE '장기 대여'
       END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date >= '2022-09-01' AND start_date <= '2022-09-30'
ORDER BY history_id DESC;