package br.com.bootcamp.app;

import br.com.bootcamp.domain.Mentoria;

import java.time.LocalDate;

public class TestAppBootcamp {
    public static void main(String[] args) {
        Mentoria mentoria = new Mentoria();

        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
