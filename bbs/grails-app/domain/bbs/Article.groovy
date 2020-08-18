package bbs

class Article {
    String name
    String text
    static constraints = {
        // バリデーション　文字数制限と空白拒否
        name size: 1..10, blank: false
        text size: 1..120
    }
}
