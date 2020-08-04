# Grails-practice

## HelloWorld2

下記のコマンドを実施後、URLにアクセスするとThis is Viewの文字を表示する。

```
grails
```
```
grails> run-app
```

http://localhost:8080/hello/hello


## 主要なコード

**HelloController.groovy**
```groovy
package helloworld2

class HelloController {

    def index() {
        render "http://localhost:8080/hello/hello"
    }
    def hello() { }
}
```

**hello.gsp**
```groovy
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hello World2</title>
    </head>
    <body>
        <p>This is View</p>
    </body>
</html>
```
