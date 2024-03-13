<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <main>
        <form method="post">
            <div>Count all students in university</div>
            <input type="hidden" name="action" value="all_u">
            <button type="submit">Count</button>
        </form>
        <c:if test="${requestScope.action == 'all_u'}">
            <div>
                <c:out value="Result: ${requestScope.res}">

                </c:out>
            </div>
        </c:if>
        <form method="post">
            <div>Find faculty with most students</div>
            <input type="hidden" name="action" value="most">
            <button type="submit">Find</button>
        </form>
        <c:if test="${requestScope.action == 'most'}">
            <div>
                <c:out value="Result: ${requestScope.res}">

                </c:out>
            </div>
        </c:if>
        <form method="post">
            <div>Count all students with 95-100 grade</div>
            <input type="hidden" name="action" value="all_g">
            <button type="submit">Count</button>
        </form>
        <c:if test="${requestScope.action == 'all_g'}">
            <div>
                <c:out value="Results:">

                </c:out>
                <div>
                    <c:forEach var="i" begin="0" end="${requestScope.res.size() - 1}">
                        <div>
                            <span>
                                <c:out value="Name: ${requestScope.res.get(i).get_name()}">
                                </c:out>
                            </span>
                            <span>
                                <c:out value=" Surname: ${requestScope.res.get(i).get_surname()}">
                                </c:out>
                            </span>
                            <span>
                                <c:out value=" Number: ${requestScope.res.get(i).get_number()}">
                                </c:out>
                            </span>
                            <span>
                                <c:out value=" Grade: ${requestScope.res.get(i).get_grade()}">
                                </c:out>
                            </span>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </c:if>
    </main>
</body>
</html>