package bbs

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        get "/index/"(controller:'bbs', action: "index")
        get "/create/"(controller:'bbs', action: "create")
        "/"{
            controller = "bbs"
            action = "index"
        }
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
