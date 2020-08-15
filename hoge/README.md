# Grails-practice

## HelloWorld

下記のコマンドを実施後、URLにアクセスするとHelloWorld!!!の文字を表示する。

```
grails
```
```
grails> run-app
```

http://localhost:8080/hello/index


## 主要なコード

**HelloController.groovy**
```groovy
package helloworld

class HelloController {

    def index() {
        render "Hello World!!!"
    }
}
```
