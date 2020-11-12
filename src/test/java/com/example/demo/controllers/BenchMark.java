package com.example.demo.controllers;

import implem.Fact;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 2)
public class BenchMark {

    @Benchmark
    public void factorialUsingForLoop(BenchmarkState s){
        Fact fac = new Fact();
        fac.factorialUsingForLoop(s.n);

    }

    @Benchmark
    public void factorialUsingRecursion(BenchmarkState s){
        Fact fac = new Fact();
        fac.factorialUsingRecursion(s.n);
    }
    @State(Scope.Thread)
    public static class BenchmarkState {
        public int n = 5;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchMark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();

    }
}