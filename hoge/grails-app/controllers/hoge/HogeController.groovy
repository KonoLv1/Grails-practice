package hoge

class HogeController {

    def index() {
        render(view: '/hoge/index', model:[hoges : Hoge.listOrderById()])
    }

    def save(){
        String text = params.text
        String name = params.name
        Hoge newHoge = new Hoge(name: name, text: text)
        // DB save
        newHoge.save()
        redirect(controller: "hoge", action: "index")
    }
    def delete(){
        Hoge hoge = Hoge.get(params.long("id"))
        if (hoge){
            hoge.delete()
            flash.message = "deleted"
        }
        redirect(controller: "hoge", action :"index")
    }
    def hoge(){}

}
