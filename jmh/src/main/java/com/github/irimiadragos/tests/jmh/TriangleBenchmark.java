package com.github.irimiadragos.tests.jmh;

import com.github.irimiadragos.tests.Triangle;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class TriangleBenchmark {

    @Benchmark
    public void testScaleneMethod(Blackhole bh) {
        Triangle t = new Triangle(3, 4, 5);
        bh.consume(t.getType());
    }


    @Benchmark
    public void testEquilaterale(Blackhole bh) {
        Triangle t = new Triangle(5, 5, 5);
        bh.consume(t.getType());
    }


    @Benchmark
    public void testIsosceleMethod(Blackhole bh) {
        Triangle t = new Triangle(3, 5, 5);
        bh.consume(t.getType());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(TriangleBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
