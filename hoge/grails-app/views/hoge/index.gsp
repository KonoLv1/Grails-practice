<!DOCTYPE html>
<html>
<head>
    <meta charaset="UTF-8">
    <title>create page</title>
</head>
<body>
    <p>文字と名前を登録します</p>
    <g:form controller="hoge" action="save">
        <g:textField name="name" placeholder="name"/>
        <g:textField name="text" placeholder="text"/>
        <g:submitButton name="登録">Add Todo</g:submitButton>
    </g:form>
    <ul>
    <g:each in="${hoges}" var="hoge">
        <li>${hoge.id} ${hoge.name} ${hoge.text}</li>
        <g:link controller="hoge" action="delete" params="['id':hoge.id]">
            削除　
        </g:link>
    </g:each>
    </ul>
</body>
</html>