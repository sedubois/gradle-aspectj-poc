package com.hello;

import org.springframework.stereotype.Service;

@Service
class GreetingService {

  void unsupportedMethod() {
    // nothing to do
  }

  Greeting methodUsingAutoValue() {
    return new Greeting("yo!");
  }
}
