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
                <th>삭제</th>
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
                    <td>
                        <a
                            href="/members/${member.usersId}/update"
                            class="btn btn-warning"
                            >수정</a
                        >
                    </td>
                    <td>
                        <form
                            action="/members/${member.usersId}/delete"
                            method="post"
                        >
                            <button class="btn btn-danger">삭제</button>
                        </form>
                    </td>
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
                <th>삭제</th>
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
                    <td><a href="" class="btn btn-danger">삭제</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../layout/footer.jsp"%>
