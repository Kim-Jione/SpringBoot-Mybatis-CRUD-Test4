<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>

<div class="container">
    <h1>구매목록</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>아이디</th>
                <th>주문자</th>
                <th>주문명</th>
                <th>주문가격</th>
                <th>주문수량</th>
                <th>주문날짜</th>
                <th>주문취소</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="saveList" items="${saveList}">
                <tr>
                    <td>${saveList.username}</td>
                    <td>${saveList.ordersMember}</td>
                    <td>${saveList.ordersName }</td> 
                    <td>${saveList.ordersPrice}</td>
                    <td>${saveList.ordersCount}</td>
                    <td>${saveList.createdAt}</td>
                    <td>
                         <form
                            action="/membersList/${saveList .ordersId}/delete"
                            method="post"
                        >
                        <input type="hidden" name="ordersCount" value="${saveList.ordersCount}">
                        
                      <input type="hidden" name="productId" value="${saveList.productId}">
                            <button type="submit" class="btn btn-danger">
                                주문취소
                            </button>
                        </form> 
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../layout/footer.jsp"%>
