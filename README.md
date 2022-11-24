# 연습문제 MyBatis

### 1. View 생성

-   상품목록 페이지
-   상품등록 페이지
-   상품 상세보기 페이지
-   유저목록 관리 페이지
-   구매목록 관리 페이지
-   구매자, 관리자 수정 페이지

### 2. 기능 (ajax 필요 없음) (서비스 만들 필요 없음)

-   로그인 없이 유저와 구매목록 관리하기

## 3. 고급 기능


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

상품목록 페이지
<img src="https://user-images.githubusercontent.com/106166409/202647522-cb16e4d1-4f5f-4331-9322-b42e06371d83.png"  width="1000"/>

상품등록 페이지
<img src="https://user-images.githubusercontent.com/106166409/202647566-7c139090-4436-42fe-a57d-be262b08d1cd.png"  width="1000"/>

상품 상세보기 페이지
<img src="https://user-images.githubusercontent.com/106166409/202647684-a97914db-c4ca-41fe-9965-2a6737fdb715.png"  width="1000"/>

유저목록 관리 페이지
<img src="https://user-images.githubusercontent.com/106166409/202648369-d2cddd3f-da4c-4fb4-9c81-1aebde2cfe58.png"  width="1000"/>

구매목록 관리 페이지
<img src="https://user-images.githubusercontent.com/106166409/202647841-5b62164f-de89-43ea-a757-ceb814f05fa3.png"  width="1000"/>

판매자 수정 페이지
<img src="https://user-images.githubusercontent.com/106166409/202648279-befa7c54-39cb-4f35-95db-7416ab7dd842.png"  width="1000"/>

구매자 수정 페이지
<img src="https://user-images.githubusercontent.com/106166409/202648039-d2b76529-a4eb-4410-8aef-1e9e19b77bfe.png"  width="1000"/>

### 7. 구현기능
