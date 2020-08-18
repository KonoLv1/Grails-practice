# Grails-practice

## Grails（グレイルズ）

プログラミング言語Groovyを使用するオープンソースのWebアプリケーションフレームワーク<br>
GrailsやGroovyはJavaプラットフォーム上で動作する

## 導入（Windows向け）

* Githubから、grails-4.0.4.zipをダウンロード<br>
https://github.com/grails/grails-core/releases

## 導入（Mac向け）

* 導入しやすいようにSDKMANを導入する<br>
ターミナルで下記を入力
```
curl "https://get.sdkman.io" | bash
```
注：curlコマンドは、HTTPアクセスでコンテンツを取得するコマンド<br>
* SDKMANのパスを通す<br>
ターミナルで下記を入力
```
source "$HOME/.sdkman/bin/sdkman-init.sh"
```



## コマンド

* **アプリ「hoge」の生成**
```
grails create-app hoge
```

* **アプリケーションの実行**
```
grails run-app
```
* **コントローラー「hoge」の生成**
```
grails> create-controller hoge
```
* **アプリケーションの停止**
```
grails> stop-app
```
* **ドメイン「hoge」の生成**
```
grails> create-domain-class hoge
```
* **サービス「hoge」の生成**
```
grails> create-service hoge
```
