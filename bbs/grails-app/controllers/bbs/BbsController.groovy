package bbs

class BbsController {

    def index() {
        def p = Article.get(1)
        render('name: ' + p.name)
    }
    def create() {
        def p = new Article(name: "Yamato", text: "ABC")
        p.save()
    }
}
