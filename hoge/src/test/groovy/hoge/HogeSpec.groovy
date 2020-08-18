package hoge

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class HogeSpec extends Specification implements DomainUnitTest<Hoge> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
