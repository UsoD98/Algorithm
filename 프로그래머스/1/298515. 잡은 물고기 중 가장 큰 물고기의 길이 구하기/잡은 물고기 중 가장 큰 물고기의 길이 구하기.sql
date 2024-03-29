-- 코드를 작성해주세요
select concat(format(length,2),'cm') as MAX_LENGTH
from fish_info
order by Length desc
limit 1;