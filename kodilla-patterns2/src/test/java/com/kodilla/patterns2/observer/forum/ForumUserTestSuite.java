package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.observer.forum.observable.ForumTopic;
import com.kodilla.patterns2.observer.forum.observable.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.observable.JavaToolsForumTopic;
import com.kodilla.patterns2.observer.forum.observer.ForumUser;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser johnSmith =new ForumUser("John Smith");
        ForumUser ivoneEschobar = new ForumUser("Ivone Eschobar ");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");

        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEschobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        // When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop");
        javaHelpForum.addPost("Better try while loop in this case");
        javaHelpForum.addPost("Why while loop? Is better ???");

        javaToolsForum.addPost("Please help me my workbench don't work ;(");
        javaToolsForum.addPost("When I tried login I receive message 'bad credentials");

//        javaHelpForum.notifyObserver();
//        javaToolsForum.notifyObserver();
        // Then

//        System.out.println(javaHelpForum.getMessage());

        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEschobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());

    }
}
