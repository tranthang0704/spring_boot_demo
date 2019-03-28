<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   </head>
   <body>
 	<hr>
 	<h2>Team information</h2>
 	<table class="table table-striped">
 		<thead>
	 		<tr>
		 		<td>Company</td>
		 		<td>Department</td>
		 		<td>Team</td>
		 		<td>Leader</td>
	 		</tr>
 		</thead>
 		<tbody>
	 		<tr>
		 		<td>${company}</td>
		 		<td>${department}</td>
		 		<td>${team}</td>
		 		<td>${leader}</td>
	 		</tr>
 		</tbody>
 	</table>
 	<hr>
   </body>
</html>
