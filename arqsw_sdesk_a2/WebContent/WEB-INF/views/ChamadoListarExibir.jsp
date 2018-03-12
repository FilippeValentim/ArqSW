<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 	<link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">
</head>
<body>
         <div id="list" class="row">

                    <div class="table-responsive col-md-12">
                        <table class="table table-striped" cellspacing="0" cellpadding="0">
                            <thead>
                                <tr>
                                    <th>Nome</th>
                                    <th>Descrição</th>
                                    <th>Abertura</th>
                                    <th>Fechamento</th>
                                    <th>Status</th>
                                    <th>Tempo</th>
                                </tr>
                            </thead>
                            <tbody>
          					<c:forEach var="chamado" items="${chamados}">
                            <option value="${chamado.id}">${chamado.descricao}</option>
                        	</c:forEach>
                            </tbody>
                        </table>

                    </div>
                </div>
</body>
</html>