package com.home.budget.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyJob implements CommandLineRunner {

    private final MonoUtilListIterator  monoUtilListIterator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Daily job executed");
        monoUtilListIterator.processWithInterval();
    }

}
