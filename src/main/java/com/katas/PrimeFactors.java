package com.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class PrimeFactors {

    private static BiFunction <Integer, Integer, List<Integer>> tryPrimeFactor = (n, i) -> {
        final List<Integer> primes = new ArrayList<>();
        if (n > 1)
            if (n % i == 0) {
                primes.add(i);
                primes.addAll(PrimeFactors.tryPrimeFactor.apply(n / i, i));
            } else {
                primes.addAll(PrimeFactors.tryPrimeFactor.apply(n, ++i));
            }
        return primes;
    };



    public static List<Integer> generate(int n) {
        return tryPrimeFactor.apply( n, 2);
    }

}
