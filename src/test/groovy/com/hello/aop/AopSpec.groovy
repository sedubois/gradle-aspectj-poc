package com.hello.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = AopConfig)
class AopSpec extends Specification {

  @Autowired
  private MainService mainService
  @Autowired
  private TestService testService

  def mainService_throwsUnsupportedOperation() {
    when:
    mainService.serviceMethod()

    then:
    thrown(UnsupportedOperationException)
  }

  def testService_throwsUnsupportedOperation() {
    when:
    testService.serviceMethod()

    then:
    thrown(UnsupportedOperationException)
  }
}
