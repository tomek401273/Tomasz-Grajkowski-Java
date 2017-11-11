package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void countPostIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listUsers = new ArrayList<>();
        double postCount = 0;
        //when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(postCount);

        CalculateStatistic calculateStatistic = new CalculateStatistic();

        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        double postCount2 = calculateStatistic.getCountPosts();

        //Then
        Assert.assertEquals(0, postCount2, 0);
    }

    @Test
    public void countPostIsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double postCount1 = 1000;
        //when(statisticsMock.usersNames()).thenReturn(listUsers);
        when(statisticsMock.postsCount()).thenReturn(postCount1);

        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.calculateAdvStatistics(statisticsMock);
        double postCount2 = calculateStatistic.getCountPosts();
        System.out.println("postCount2: " + postCount2);
        //Then
        Assert.assertEquals(1000, postCount2, 0);
    }

    @Test
    public void countCommentIsZero() {
        //Given
        Statistics staticsMock = mock(Statistics.class);
        double commentIsZero = 0;
        when(staticsMock.commentsCount()).thenReturn(commentIsZero);

        //when
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(staticsMock);

        double CommentIsZero2 = calculateStatistic.getCountComments();

        //Then
        Assert.assertEquals(0, CommentIsZero2, 0);
    }

    @Test
    public void countComentLessThanCountPost() {
        //Given
        Statistics staticMock = mock(Statistics.class);
        double CountComment = 10;
        double CountPosts = 20;
        when(staticMock.commentsCount()).thenReturn(CountComment);
        when(staticMock.postsCount()).thenReturn(CountPosts);

        //when
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(staticMock);
        double avgCommentsPerPost = calculateStatistic.getAvgCommentsPerPost();
        double expected = 0.5;

        //Then
        Assert.assertEquals(0.5, avgCommentsPerPost, 0);

    }

    @Test
    public void countCommentGreatherThanCuntPost() {
        //Given
        Statistics staticMock = mock(Statistics.class);
        double CountComment = 22;
        double CountPosts = 10;
        when(staticMock.commentsCount()).thenReturn(CountComment);
        when(staticMock.postsCount()).thenReturn(CountPosts);

        //when
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(staticMock);
        double avgCommentsPerPost = calculateStatistic.getAvgCommentsPerPost();
        double expected = 0.5;

        //Then
        Assert.assertEquals(2.2, avgCommentsPerPost, 0);
    }

    @Test
    public void countUserIsZero() {
        //Given
        Statistics statsticsMock = mock(Statistics.class);

        List<String>  listUsers = new ArrayList<>();
        when(statsticsMock.usersNames()).thenReturn(listUsers);

        //when
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(statsticsMock);
        double countUser = calculateStatistic.getCountUsers();

        //Then

        Assert.assertEquals(0, countUser, 0);

    }


    @Test
    public void countUserIsHundred() {
        //Given
        Statistics statsticsMock = mock(Statistics.class);

        List<String>  listUsers = new ArrayList<>();
        for (int i = 0; i<100; i++){
            listUsers.add("Spock");
        }

        when(statsticsMock.usersNames()).thenReturn(listUsers);

        //when
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(statsticsMock);
        double countUser = calculateStatistic.getCountUsers();
        //Then

        Assert.assertEquals(100, countUser, 0);

    }


}
