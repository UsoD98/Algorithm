SELECT a.flavor
FROM first_half a
LEFT JOIN icecream_info b ON a.flavor = b.flavor
WHERE a.total_order >= 3000 AND (b.ingredient_type LIKE 'fruit_based')
ORDER BY a.total_order DESC;