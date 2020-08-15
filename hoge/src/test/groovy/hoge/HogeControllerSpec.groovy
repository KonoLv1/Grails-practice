package hoge

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HogeControllerSpec extends Specification implements ControllerUnitTest<HogeController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
