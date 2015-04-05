package com.hello.Demo;

public aspect CallRecipe {

    pointcut callPointCut() : call(void com.hello.MyClass.foo(int, java.lang.String));

    before() : callPointCut () {
        System.out.println("-------------- AspectJ Advice Logic --------------");
        System.out.println("Signature : " + thisJoinPoint.getStaticPart().getSignature());
        System.out.println("Source Line : " + thisJoinPoint.getStaticPart().getSourceLocation());
        System.out.println("--------------------------------------------------");
    }
}
