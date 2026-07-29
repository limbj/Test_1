<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제</title>
</head>
<body>
	<p>게시글을 삭제하시겠습니까?</p>

	<form action="delete.do" method="post">

		<input type="hidden" name="no" value="${delReq.articleNumber}">
		<input type="hidden" name="pageNo" value="${param.pageNo}"> <input
			type="submit" value="삭제"> <a
			href="read.do?no=${delReq.articleNumber}&pageNo=${param.pageNo}">[취소]
		</a>

	</form>

</body>
</html>