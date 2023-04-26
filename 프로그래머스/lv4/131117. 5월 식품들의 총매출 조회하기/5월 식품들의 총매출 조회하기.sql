-- 코드를 입력하세요
SELECT a.PRODUCT_ID, a.PRODUCT_NAME, 
sum(a.PRICE * b.AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT a inner join FOOD_ORDER b
on a.PRODUCT_ID = b.PRODUCT_ID 
where DATE_FORMAT(b.PRODUCE_DATE, '%Y-%m') = '2022-05'
group by a.PRODUCT_ID 
order by TOTAL_SALES desc, b.PRODUCT_ID asc;