<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>
<div class="container">
    <h1>판매자 수정페이지</h1>
    <form action="/admin/${usersId}/update" method="post">
        <div class="mb-3 mt-3">
            아이디 :
            <input name="username" type="text" value="${admin.username}" />
        </div>
        <div class="mb-3 mt-3">
            이름 :
            <input name="adminName" type="text" value="${admin.adminName}" />
        </div>
        <div class="mb-3 mt-3">
            이메일 :
            <input name="adminEmail" type="email" value="${admin.adminEmail}" />
        </div>

        <button type="submit" class="btn btn-primary">수정완료</button>
    </form>
</div>

<%@ include file="../layout/footer.jsp"%>
