package com.hello.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
class AopConfig {

  @Aspect
  @Component
  static class UnsupportedOperationAspect {

    @Before("execution(* com.hello.aop.*Service.serviceMethod(..))")
    public void throwUnsupportedOperationServiceMethod() {
      throw new UnsupportedOperationException();
    }
  }
}
