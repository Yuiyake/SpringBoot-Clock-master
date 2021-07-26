package com.clock.config;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class AppBanner implements Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println(
                "⊂ヽ(　^ω^)つ^ω^)つ\n" +
                "　 ＼ 　　／　　／\n" +
                "　　( ＿_フ( ＿_フ\n" +
                "　　(／　　(／"
        );

    }
}
