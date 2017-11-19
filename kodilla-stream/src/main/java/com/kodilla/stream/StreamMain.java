package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifiler;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumberGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Poem Beautifiler");

       PoemBeautifiler poemBeautifiler = new PoemBeautifiler();

        poemBeautifiler.beautify("Computer", String::toUpperCase);
        poemBeautifiler.beautify("lubie placki", (b) -> b.toUpperCase() + " " + b.toLowerCase() + " " + b.toUpperCase());
        poemBeautifiler.beautify("Mouse", (c) -> "ABC" + c + "ABC");
        poemBeautifiler.beautify("ABC", (d) -> d.substring(d.length() - 1) + d.substring(d.length() - 2) + d.substring(d.length() - 3));

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResult = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getAge() > 20)
                .filter(forumUser -> forumUser.getCountPublicedPost() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResult.size());

        theResult.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        System.out.println("Tomek tomek");

    }


}
