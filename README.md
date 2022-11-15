# 연습문제 MyBatis

### 1. View 생성

-   로그인 페이지
-   회원가입 페이지
-   상품목록 페이지
-   상품 상세보기 페이지
-   구매목록 페이지

### 2. 기능 (ajax 필요 없음) (서비스 만들 필요 없음)

서버1 (판매자 서버) - DB 를 공유
서버2 (구매자 서버)
(구매 테이블 필요)
(유저 테이블 필요) - 구매자

-   회원가입
-   로그인
-   상품목록 보기 (기존과 동일)
-   상품상세 보기 (기존과 다름 : 구매하기 버튼)
-   구매 후 상품 재고 수정
-   구매목록 보기

## 3. 고급 기능

-   상품 등록시 동일한 상품명 못들어가게 하기

### 4. 테이블 생성

```sql
create table users(
    users_id int primary KEY auto_increment,
    username VARCHAR(20) NOT NULL UNIQUE,
    password varchar(20) NOT NULL,
    role VARCHAR(20) NOT NULL,
    created_at TIMESTAMP  NOT NULL
);

create table members(
    members_id int primary KEY auto_increment,
    members_name varchar(20) NOT NULL,
    members_email varchar(50) NOT NULL,
    users_id int NOT NULL,
    created_at TIMESTAMP  NOT NULL

);

create table admin(
    admin_id int primary KEY auto_increment,
    admin_name varchar(20) NOT NULL,
    admin_email varchar(50) NOT NULL,
    users_id int NOT NULL,
    created_at TIMESTAMP  NOT NULL

);


create table product(
    product_id int primary KEY auto_increment,
    product_name varchar(20) NOT null UNIQUE,
    product_price INT NOT null,
    product_qty INT NOT null,
    created_at TIMESTAMP  NOT NULL

);

create table orders(
    orders_id int primary KEY auto_increment,
    orders_name varchar(20) NOT null,
    orders_price int NOT null,
    orders_count int NOT null,
    product_id int NOT null,
    users_id int NOT null,
    created_at TIMESTAMP  NOT NULL
);
```

### 5. 더미데이터

```sql
insert into users(username, password, role, created_at) values('ssar', '1234' ,'admin',  NOW());
insert into users(username, password, role, created_at) values('cos', '1234','member',  NOW());
insert into users(username, password, role, created_at) values('tan', '1234' ,'admin',  NOW());
insert into users(username, password, role, created_at) values('sing', '1234' ,'member',  NOW());




insert into members(members_name, members_email, users_id, created_at) values('홍길동','ssar@nate.com', 1,  NOW());
insert into admin(admin_name, admin_email,  users_id, created_at) values('장보고','cos@nate.com',2,  NOW());
insert into members(members_name, members_email, users_id, created_at) values('이순신','tan@nate.com', 3,  NOW());
insert into admin(admin_name, admin_email,  users_id, created_at) values('아이유','sing@nate.com',4,  NOW());



INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('바나나', 1000, 100, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('딸기', 2000, 200, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('사과', 3000, 300, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('블루베리', 4000, 400, NOW());


INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('바나나', 1000, 10, 1, 1,  NOW());
INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('딸기', 2000, 20, 2, 2,  NOW());
INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('사과', 3000, 30, 3, 3,  NOW());
INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('블루베리', 4000, 40, 4, 4,  NOW());

```

### 6. 페이지

회원가입 페이지

<img src=""  width="1000"/>

로그인 페이지
<img src=""  width="1000"/>

상품목록 페이지

<img src=""  width="1000"/>

상품 상세보기 페이지

<img src=""  width="1000"/>

구매목록 페이지

<img src=""  width="1000"/>

### 7. 구현기능

<img src=""  width="1000"/>

<img src=""  width="1000"/>

<img src=""  width="1000"/>
