package com.hello.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = AopConfig)
class AopSpec extends Specification {

  @Autowired
  private MyService myService

  def myService_serviceMethod_throwsUnsupportedOperation() {
    when:
    myService.serviceMethod()

    then:
    thrown(UnsupportedOperationException)
  }
}
