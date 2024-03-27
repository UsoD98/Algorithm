-- 코드를 입력하세요
SELECT BOOK_ID, date_format(published_date,'%Y-%m-%d') as PUBLISHED_DATE
from book
where published_date like '2021%' and (book_id between 3 and 4)
order by published_date;