USE cafe_db;

-- 메뉴 데이터 삽입
INSERT INTO menu (name, price) VALUES
('아메리카노', 2500),
('카페라떼', 3000),
('카페모카', 3500);

-- 주문 데이터 삽입
INSERT INTO orders(menu_id, is_hot) VALUES
(1, 'ice'),
(3, 'hot'),
(2, 'ice');

SELECT * FROM menu;
SELECT * FROM orders;