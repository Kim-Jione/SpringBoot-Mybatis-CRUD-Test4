<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>

<div class="container">
    <h1>구매자</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>아이디</th>
                <th>이름</th>
                <th>이메일</th>
                <th>등급</th>
                <th>가입일자</th>
                <th>수정</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="member" items="${member}">
                <tr>
                    <td>${member.username}</td>
                    <td>${member.membersName}</td>
                    <td>${member.membersEmail }</td>
                    <td>${member.role}</td>
                    <td>${member.createdAt}</td>
                    <th>
                        <a href="/members/update" class="btn btn-warning"
                            >수정</a
                        >
                    </th>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h1>관리자</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>아이디</th>
                <th>이름</th>
                <th>이메일</th>
                <th>등급</th>
                <th>가입일자</th>
                <th>수정</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="admin" items="${admin}">
                <tr>
                    <td>${admin.username}</td>
                    <td>${admin.adminName }</td>
                    <td>${admin.adminEmail}</td>
                    <td>${admin.role}</td>
                    <td>${admin.createdAt}</td>
                    <td>
                        <a
                            href="/admin/${admin.usersId}/update"
                            class="btn btn-warning"
                            >수정</a
                        >
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../layout/footer.jsp"%>
