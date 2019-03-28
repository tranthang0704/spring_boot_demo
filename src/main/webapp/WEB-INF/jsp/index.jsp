<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
      <h1>${message}</h1>
      <a href="/param?name=tthang&role=developer"><h4>Get request with parameter: /param?name=tthang&role=developer</h4></a>
      <a href="/api/v1/techbaseVN/dev1/auction"><h4>Get variable path: /api/v1/techbaseVN/dev1/auction</h4></a>
      <a href="/api/v1/techbaseVN/dev1/ticket"><h4>Get variable path: /api/v1/techbaseVN/dev1/ticket</h4></a>
   </body>
   
</html>
