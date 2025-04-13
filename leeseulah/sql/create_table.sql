USE cafe_db;

-- 메뉴 테이블
CREATE TABLE menu (
menu_id INTEGER AUTO_INCREMENT PRIMARY KEY,	-- 메뉴 고유 ID, 자동 증가하고 고유값을 가지므로 PRIMARY KEY 사용
name VARCHAR(50) NOT NULL UNIQUE,	-- 메뉴 이름은 반드시 입력해야 하므로 NOT NULL, 중복을 방지하기 위해 UNIQUE 사용
price INTEGER	# 메뉴 가격
);

-- 주문 테이블
CREATE TABLE orders (
order_id INTEGER AUTO_INCREMENT PRIMARY KEY,	-- 주문 고유 ID, 자동 증가하고 고유값을 가지므로 PRIMARY KEY 사용
menu_id INTEGER,
is_hot VARCHAR(50) NOT NULL,	-- hot/ice 여부는 반드시 입력해야 하므로 NOT NULL 사용
FOREIGN KEY (menu_id) REFERENCES menu (menu_id)	-- menu 테이블의 name을 참조하므로 FOREGIN KEY 설정
);