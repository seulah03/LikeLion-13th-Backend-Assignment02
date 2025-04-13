USE cafe_db;

SELECT
menu.name AS 메뉴,
orders.is_hot AS `hot/ice`
FROM menu
JOIN orders
ON menu.menu_id = orders.menu_id;