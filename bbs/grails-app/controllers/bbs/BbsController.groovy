package bbs

class BbsController {

    def index() {
        render(view:'/bbs/index',model:[articles : Article.listOrderById(order: 'desc')])
    }
    def save() {
        String name = params.name
        String text = params.text
        def newArticle = new Article(name: name, text: text)
        if (newArticle.validate()) {
            newArticle.save()
            redirect(controller: "bbs", action: "index")
        }else{
            render(view:'/bbs/index',model:[errorArticle: newArticle, articles: Article.listOrderById()])
        }
    }
    def delete(){

    }
}
