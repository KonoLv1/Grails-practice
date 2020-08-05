<!DOCTYPE html>
        <html>
        <head>
        </head>
<body>
    Hello!!
    <ul>
        <g:each in="${todoList}">
                <li>${it.name}</li>
                <li>${it.text}</li>
        </g:each>
    </ul>
</body>
        </html>