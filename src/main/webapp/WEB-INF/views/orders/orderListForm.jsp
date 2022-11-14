<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>
<h1>구매목록 페이지</h1>
<div class="container">
    <table class="table table-striped">
        <thead>
            <tr>
                <th>번호</th>
                <th>아이디</th>
                <th>주문명</th>
                <th>주문가격</th>
                <th>주문수량</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ordersList" items="${ordersList}">
                <tr>
                    <td>${ordersList.productId}</td>
                    <td>${ordersList.ordersName}</td>
                    <td>${ordersList.ordersPrice}</td>
                    <td>${ordersList.ordersCount}</td>
                    <td>${ordersList.ordersCount}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../layout/footer.jsp"%>
