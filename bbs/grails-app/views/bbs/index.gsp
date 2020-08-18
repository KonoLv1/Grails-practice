<!DOCTYPE html>
<html>
<head>
    <meta charaset="UTF-8">
    <title>BBS</title>
</head>
<body>

<g:renderErrors bean="${errorArticle}" as="list" field="name"/>
<g:renderErrors bean="${errorArticle}" as="list" field="text"/>
<g:form controller="bbs" action="save">
    <g:textField name="name" placeholder="Name"/>
    <g:textField name="text" placeholder="Text"/>
    <g:submitButton name="送信">Add Todo</g:submitButton>
</g:form>

<g:each in="${articles}" var="article">
    <strong>${article.name}</strong>
    <p>${article.text}</p>
</g:each>

</body>
</html>