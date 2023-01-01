package com.example.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzApplication.class, args);

        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + "- fizzbuzz");
            }else if(i%3==0){
                System.out.println(i + "- fizz");
            }else if(i%5==0){
                System.out.println(i + "- buzz");
            }
        }
    }

}
