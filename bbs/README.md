# Grails-practice

## bbs

簡単な掲示板アプリケーション

## データベース
H2

## コマンド

* **mysqlログイン**
```
mysql -u root -p
```
* **データベースの生成**
```
create database bbs;
```
* **ユーザーの生成**
```
create user 'bbs'@'localhost' identified by 'secret';
```
* **権限の付与**
```
grant all privileges on bbs.* to 'bbs'@'localhost';
```
