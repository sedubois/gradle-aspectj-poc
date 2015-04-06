package com.hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = AppConfig)
class GreetingServiceSpec extends Specification {

  @Autowired
  private GreetingService greetingService

  def method1_triggersUnsupportedOperationAdvice() {
    when:
    greetingService.unsupportedMethod()

    then:
    thrown(UnsupportedOperationException)
  }

  public void method2_retrievesExpectedGreetingValue() {
    when:
    Greeting greeting = greetingService.supportedMethod()

    then:
    greeting == new Greeting("yo!")
  }
}
