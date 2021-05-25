package com.annakhuseinova.lessons;

import reactor.core.publisher.Mono;

/**
 * In reactive programming nothing happens until you subscribe.
 * */
public class MonoJust {

    public static void main(String[] args) {

        Mono<Integer> mono = Mono.just(1);
        mono.subscribe(i -> System.out.println("Received : " + i));

    }
}
