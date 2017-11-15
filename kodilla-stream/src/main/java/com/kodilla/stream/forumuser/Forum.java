package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
   private List<ForumUser> userList = new ArrayList<>();

   public Forum() {
       userList.add(new ForumUser(2, "Tom", 'M', LocalDate.of(1994, 02, 16), 4));
       userList.add(new ForumUser(3, "Anna", 'F', LocalDate.of(1999, 01, 01), 10));
       userList.add(new ForumUser(1, "Konrad", 'M',LocalDate.of(1993, 10,12), 13));
       userList.add(new ForumUser(4, "Monika", 'F', LocalDate.of(1994, 12, 11), 33));
       userList.add(new ForumUser(5, "Susan", 'F', LocalDate.of(1999, 11, 11), 44));
       userList.add(new ForumUser(6, "Mike", 'M',LocalDate.of(1994, 10,11), 0));
   }

   public List<ForumUser> getUserList() {
       return userList;
   }

}
